





CS1B02_Val <- function(){
    library(rio)
    path        <- "X:/市场监控/"
    portsname   <- "中信主动2号"
    filepath    <- sprintf("%s/%s/估值报告", path, portsname)
    stockshid   <- '1102.01'
    stockszid   <- '1102.33'
    stockcybid  <- '1102.34'
    hkid        <- '1102.65'
    otcid       <- '1108.02.01'
    fundid      <- '1105'
    
    
    GetLastExcelFile <- function(filepath){
        filenames <- list.files(filepath, pattern = ".xls")
        df_filenames <- as.data.frame(filenames)
        df_filenames$filenames <- as.character(df_filenames$filenames)
        ret <- data.frame(
            filenames = df_filenames$filenames[grep("A0468", df_filenames$filenames)]
        )
        ret$filenames <- as.character(ret$filenames)
        ret$date <- substr(ret$filenames, nchar(ret$filenames)-11, nchar(ret$filenames)-4)
        return(ret[ret$date == max(ret$date), ])
    }
    
    
    lastvaluationfile <- GetLastExcelFile(filepath)
    pos <- rio::import(sprintf("%s/%s", filepath, lastvaluationfile$filenames))
    names(pos) <- 1:length(names(pos))
    names(pos) <- pos[4, ]
    stock <- pos[grep(stockshid, pos$`科目代码`), ]
    stock <- rbind(stock, pos[grep(stockszid, pos$`科目代码`), ])
    stock <- rbind(stock, pos[grep(stockcybid, pos$`科目代码`), ])
    stock       <- stock[nchar(stock$科目代码) > 11, ]
    stock$类型  <- "股票"
    
    otc         <- pos[grep(otcid, pos$`科目代码`), ]
    otc$类型    <- "场外_私募"
    otc       <- otc[nchar(otc$科目代码) > 11, ]
    
    hkpos <- pos[grep(hkid, pos$`科目代码`), ]
    hkpos       <- hkpos[nchar(hkpos$科目代码) > 11, ]
    hkpos$类型    <- "港股"
    
    fund <- pos[grep(fundid, pos$`科目代码`), ]
    fund       <- fund[nchar(fund$科目代码) > 11, ]
    fund$类型    <- "基金"
    
    
    
    summary <- c()
    summary$date <- lastvaluationfile$date
    summary$name <- portsname
    tmp <- as.numeric(pos[pos$科目代码 == "资产净值", "市值"])
    summary$capital <- tmp[!is.na(tmp)]
    
    tmp <- as.numeric(pos[pos$科目代码 == "今日单位净值", "科目名称"])
    summary$nav <- tmp[!is.na(tmp)]
    
    
    tmp <- as.numeric(pos[pos$科目代码 == "昨日单位净值", "科目名称"])
    summary$prenav <- tmp[!is.na(tmp)]
    
    
    summary$ret <- round((summary$nav - summary$prenav)/summary$prenav * 100, 2)
    summary$佳禾量化CTA二号 <- round(as.numeric(otc[otc$科目名称 == "佳禾量化CTA二号", "市值"])/summary$capital* 100, 2)
    summary$盈富复合进取一号 <- round(as.numeric(otc[otc$科目名称 == "盈富复合进取一号", "市值"])/summary$capital* 100, 2)
    # summary$otc <- round(sum(as.numeric(otc$市值))/summary$capital* 100, 2)
    summary$hk  <- round(sum(as.numeric(hkpos$市值))/summary$capital* 100, 2)
    
    
    
    #### YiYao Industry, BaoXiao ######
    source("./dputil/DB.R")
    source("./dputil/dphelper.R")
    basket  <- DB.sqlQuery(DB.CH, sprintf("select 
    												a.S_CON_WINDCODE 
    											from 
    												wddb.dbo.AIndexMembersCITICS a 
    											where 
    												a.S_INFO_WINDCODE = 'CI005018.WI' and
    									            a.S_CON_INDATE <= '%s' and (S_CON_OUTDATE > '%s' or S_CON_OUTDATE is null)", today, today))
    basket$code <- substr(basket$S_CON_WINDCODE, 1, 6)
    YiYao <- stock[substr(stock$科目代码, 12, 17) %in% basket$code, ]
    
    summary$YiYao   <- round(sum(as.numeric(YiYao$市值))/summary$capital* 100, 2)
    summary$BaoXian <- round(as.numeric(fund[fund$科目代码 == '1105.11.01.150330 SZ', '市值'])/summary$capital* 100, 2)
    summary$pos <- summary$YiYao + summary$BaoXian + summary$hk + summary$佳禾量化CTA二号 + summary$盈富复合进取一号
    
    as.data.frame(summary)
}