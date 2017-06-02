


library(xtable)
library(sqldf)
library(rjson)
if(!as.character(Sys.info()["sysname"]) == "Linux"){
    library(xlsx)
    library(WindR)
    w.start(showmenu = F)
}

library(stringr)
library(stringi)
library(RODBC)
library(uuid)
library(reshape2)
library(zoo)
library(plyr)

source("./dputil/dphelper.constant.R")
source("./dputil/Init.R") 
source("./dputil/SparkUtil.R")


load("./strategy/BaseDB/data.wddb.ASHARECALENDAR.rdata")

dphlper.ZZ500INDEXCODE <- 4978
dphlper.HS300INDEXCODE <- 3145
options(stringsAsFactors = FALSE)

HS300Component        <- read.csv(file = "./StrategyPerformance/HS300ComponentWeight.csv",  header = T)
ZZ500ComponentWeight  <- read.csv(file = "./StrategyPerformance/ZZ500ComponentWeight.csv",  header = T)    
SZ50ComponentWeight   <- read.csv(file = "./StrategyPerformance/SZ50ComponentWeight.csv",  header = T)

dphelper.setWorkDirByClipboard <- function(){
    workdir <- scan("clipboard", what = "")
    print(sprintf("setwd('%s')", workdir))
    setwd(workdir)
}

dphelper.changeListToSQLFormatIN <- function(e){
    return (paste(shQuote(e, type = "sh"), collapse=','))
}


dphelper.FormatSecurityID <- function(df, field){
    df[, field][substr(df[, field],start=1,stop=1)%in%c('6')]     <- paste(df[, field][substr(df[, field],start=1,stop=1)%in%c('6')], ".SH", sep='')
    df[, field][substr(df[, field],start=1,stop=1)%in%c('0','3')] <- paste(df[, field][substr(df[, field],start=1,stop=1)%in%c('0','3')], ".SZ", sep='')
    return (df)
}

dphelper.formatbasketSQL <- function(bOpenDate, bCloseDate, bCode, SecuCode, Shares){
    return (sprintf("insert into paperportfoilo.dbo.basket(bOpenDate, bCloseDate, bCode, SecuCode, Shares) values('%s','%s','%s', '%s', %s)",  bOpenDate,  bCloseDate,  bCode, SecuCode,  Shares))
}

dphelper.formatbasketDelSQL <- function(bCode){
    return (sprintf("delete paperportfoilo.dbo.basket where  bCode = '%s'", bCode))
} 

dphelper.formatStategySQL <- function(sname, scode, bcode){
    return (sprintf("insert into paperportfoilo.dbo.strategy(sname, scode, bcode) values('%s', '%s', '%s')", sname, scode, bcode))
}

dphelper.formatStategyDelSQL <- function(scode, bcode){
    return (sprintf("delete paperportfoilo.dbo.strategy where scode = '%s' and bcode = '%s'", scode, bcode))
}

dphelper.formatSEODPerformanceSQL <- function(date, dret, bcode){
    return (sprintf("insert into paperportfoilo.dbo.SEODPerformance(date, dret, bcode) values('%s', '%s', '%s')", date, dret, bcode))
}

dphelper.formatSEODPerformanceDelSQL <- function(date, bcode){
    return (sprintf("delete paperportfoilo.dbo.SEODPerformance where date = '%s' and bcode = '%s'", date, bcode))
}

dphelper.fortmatASHARECALENDARSQL <- function(date){
    return (sprintf("select trade_days from wddb.dbo.ASHARECALENDAR where TRADE_DAYS = '%s' and s_info_exchmarket  = 'SSE'", date))
}


dphelper.UpdateSEODPerformanceCodeSQL <- function(){
    sql <- "update 
          	a
          set
          	a.SName = b.SName, 
          	a.SCode = b.SCode
          from
          	paperportfoilo.dbo.Strategy b,
          	paperportfoilo.dbo.SEODPerformance a
          where 
          	b.bcode = a.bcode"
    return (sql)
}


dphelper.formatdpPortfolioTradeDelSQL <- function(Sname, bCode, OffsetFlag, Tradedate){
    sql <- sprintf("delete from paperportfoilo.dbo.dpPortfolioTrade where sname = '%s' and bcode = '%s' and OffsetFlag = '%s' and Tradedate = '%s'", 
                   Sname, bCode, OffsetFlag, Tradedate)  
    return (sql)
}

dphelper.formatdpPortfolioTradeSQL <- function(Sname, bCode, EntrustBS, OffsetFlag, SecurityID, SecurityType, TradePrice, TradeVolume, Remark ){
    sql <- sprintf("insert into paperportfoilo.dbo.dpPortfolioTrade(Sname, bCode, EntrustBS, OffsetFlag, SecurityID, SecurityType, TradeDate, TradeTime, TradePrice, TradeVolume, Remark)
            values('%s','%s', '%s', '%s', '%s', '%s', %s, %s, '%s', '%s', '%s')", 
                   Sname, bCode, EntrustBS, OffsetFlag, SecurityID, SecurityType,
                   'CONVERT(varchar, GETDATE(), 112)', 
                   'CONVERT(varchar, GETDATE(), 24)',
                   TradePrice, TradeVolume, Remark)
    return (sql)
}



dphelper.formatdpPortfolioTradehisSQL <- function(Sname, bCode, EntrustBS, OffsetFlag, SecurityID, SecurityType, TradePrice, TradeVolume, TradeDate, TradeTime, Remark ){
    sql <- sprintf("insert into paperportfoilo.dbo.dpPortfolioTrade(Sname, bCode, EntrustBS, OffsetFlag, SecurityID, SecurityType, TradeDate, TradeTime, TradePrice, TradeVolume, Remark)
            values('%s','%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')", 
                   Sname, bCode, EntrustBS, OffsetFlag, SecurityID, SecurityType,
                   TradeDate, TradeTime,
                   TradePrice, TradeVolume, Remark)
    return (sql)
}

dphelper.getlastbasket <- function(scode, ch){
    bcode <- DB.sqlQuery(ch, sprintf("select MAX(rtrim(bCode)) as bcode from paperportfoilo.dbo.Strategy where SCode = '%s'", scode))
    port <- DB.sqlQuery(ch, sprintf("exec paperportfoilo.dbo.getbasket '%s'", bcode$bcode))
    return (port)
}

dphelper.formatopmonitor <- function(opmonitor){
    sql <- sprintf("insert into jydb_all.dbo.opmonitor values('%s', '%s', '%s', '%s', '%s', '%s')", 
                   opmonitor$date,
                   opmonitor$entryname,
                   opmonitor$startdatetime,
                   opmonitor$enddatetime,
                   opmonitor$result,
                   opmonitor$remark) 
    return (sql)
}


dphelper.formatopmonitor2 <- function(opmonitor){
    sql <- sprintf("insert into jydb_all.dbo.opmonitor(date, entryname, startdatetime, result, remark) values('%s', '%s', '%s', '%s', '%s')", 
                   opmonitor$date,
                   opmonitor$entryname,
                   opmonitor$startdatetime,
                   opmonitor$result,
                   opmonitor$remark) 
    return (sql)
}

dphelper.print <- function(scriptname, sInfo){
    filename <- sprintf("./Rlog%s.log", dphelper.today())
    #   if(file.exists(filename)){
    #     file.remove(filename)
    #   }
    write(sprintf('%s [%s]: %s', dphelper.timestamp(), scriptname, sInfo), file=filename, append = TRUE) 
}

dphelper.log <- function(filename, level, functionname, sInfo){
    filename <- sprintf("E:/log/%s%s.log", filename, dphelper.today())
    write(sprintf('%s %s %s %s', dphelper.timestamp(), level, functionname, sInfo), file=filename, append = TRUE) 
}


dphelper.timestamp <- function(){
    return(format(Sys.time(), '%Y-%m-%d %H:%M:%S'))
}

## format "20151203"
dphelper.today <- function(){
    return(format(Sys.Date(), '%Y%m%d'))
}


dphelper.GetLastFile<-function(filepath, pattern){
    filenames <- list.files(filepath, pattern = pattern)
    df_filenames <- as.data.frame(filenames)
    df_filenames$filenames <- as.character(df_filenames$filenames)
    df_filenames$date <- substr(df_filenames$filenames, nchar(df_filenames$filenames)-7-nchar(pattern), nchar(df_filenames$filenames)-nchar(pattern))
    return(df_filenames$filenames[df_filenames$date == max(df_filenames$date)])
}

dphelper.GetFileWithCondition <-function(filepath, pattern, startdate, enddate){
    filenames <- list.files(filepath, pattern = pattern)
    df_filenames <- as.data.frame(filenames)
    df_filenames$filenames <- as.character(df_filenames$filenames)
    df_filenames$date <- substr(df_filenames$filenames, nchar(df_filenames$filenames)-7-nchar(pattern), nchar(df_filenames$filenames)-nchar(pattern))
    df_filenames$date <- as.character(df_filenames$date)
    return(df_filenames$filenames[ df_filenames$date >= startdate & df_filenames$date <= enddate])
}



dphelper.isTradeingDate <- function(ch, date){
    sql <- dphelper.fortmatASHARECALENDARSQL(date)
    ret <-sqlQuery(ch, as.is=FALSE, sql)
    if(nrow(ret)>0){
        return(TRUE)
    }
    return(FALSE)
}


dphelper.formatResponse <- function(data, reqid){
    ret <- c()
    ret$data  <- data
    ret$reqid <- reqid
    #   t <- c()
    #   t$res <- ret
    return (toJSON(ret))
}


dphelper.cumret <- function(x){
    cumret <- (prod(1+x/100)-1)*100
    return (cumret)
}


dphelper.annret <- function(x){
    yr <- length(x)/250
    annret <- ((1+dphelper.cumret(x)/100)^(1/yr)-1)*100
    return (annret)
}

dphelper.annret2 <- function(dates, nav){
    yr      <- dates/250
    annret  <- ((nav)^(1/yr)-1)*100
    return (annret)
}


dphelper.vol <- function(x) {
    vol <- sd(x)*sqrt(250)
    return (vol)
}


dphelper.SR <- function(x, Rf=0){
    SR <- (dphelper.annret(x)-Rf)/dphelper.vol(x)
    return (SR)
}

# dret -> nav
# mydata2[,c(2:ncol(mydata2))] <- apply(mydata2[,c(2:ncol(mydata2))],2,function(x){cumprod(1+x/100)}) 
dphelper.MDD <- function(x){
    MDD <- 0
    peak <- -9999
    DD <- rep(0, length(x))
    beg <- 0
    end <- 0
    p <- 0
    for (i in 1:length(x)){
        if (x[i]>peak) {
            peak <- x[i]
            p <- i
        }
        DD[i] <- ((peak-x[i])/peak)*100
        if (DD[i]>MDD) {
            MDD <- DD[i]
            end <- i
            beg <- p
        }
    }
    return (c(MDD, beg, end))
}

dphelper.FormatSecurityID <- function(df, field){
    df[, field][substr(df[, field],start=1,stop=1)%in%c('6')]     <- paste(df[, field][substr(df[, field],start=1,stop=1)%in%c('6')], ".SH", sep='')
    df[, field][substr(df[, field],start=1,stop=1)%in%c('0','3')] <- paste(df[, field][substr(df[, field],start=1,stop=1)%in%c('0','3')], ".SZ", sep='')
    return (df)
}

dphelper.FoarmatSqlGetPortPerformance <- function(portid){
    return  (sprintf("SELECT	
                      	a.date, 
                      	rtrim(a.scode) scode, 
                      	a.dret,
                      	((select S_DQ_PCTCHANGE from wddb.dbo.AINDEXEODPRICES  where S_INFO_WINDCODE = '000016.SH' and TRADE_DT = a.date)) as R_SH50,
                      	((select S_DQ_PCTCHANGE from wddb.dbo.AINDEXEODPRICES  where S_INFO_WINDCODE = '000300.SH' and TRADE_DT = a.date)) as R_HS300,
                      	((select S_DQ_PCTCHANGE from wddb.dbo.AINDEXEODPRICES  where S_INFO_WINDCODE = '000905.SH' and TRADE_DT = a.date)) as R_ZZ500	
                      FROM 
                      	[paperportfoilo].[dbo].[SEODPerformance] a 
                      where a.scode = '%s' order by date", portid))
}

dphelper.calcPortperformance <- function(mydata2, portid){
    ret <- c()
    if(!portid %in% c("EXPORT01", "EXPORT02", "EXPORT03", "EXPORT04")){
        ret$Scode <- portid
        ret$Period <- sprintf("%s%s%s", min(mydata2$date), "-", max(mydata2$date)) 
        ret$Cumret <- dphelper.cumret(mydata2$dret)
        #     ret$Cumret_SH50 <- dphelper.cumret(mydata2$R_SH50)
        #     ret$Cumret_HS300 <- dphelper.cumret(mydata2$R_HS300)
        #     ret$Cumret_ZZ500 <- dphelper.cumret(mydata2$R_ZZ500)
        ret$Annret <- dphelper.annret(mydata2$dret)
        ret$Vol <- dphelper.vol(mydata2$dret)
        ret$SR <- dphelper.SR(mydata2$dret)
        mydata2$nav <- cumprod(1+mydata2$dret/100)
        MDD <- dphelper.MDD(mydata2$nav)
        ret$MDD <- MDD[1]
        ret$MDDSt <- mydata2[MDD[2], 'date']
        ret$MDDEn <- mydata2[MDD[3], 'date']
        
        ret$`2ndMDD` <- dphelper.secMDD(mydata2)$`2ndMDD`
        ret$`2ndMDDSt` <- dphelper.secMDD(mydata2)$`2ndMDDSt` 
        ret$`2ndMDDEn`  <- dphelper.secMDD(mydata2)$`2ndMDDEn`
        
    }else if(portid %in% c("EXPORT01", "EXPORT02", "EXPORT03", "EXPORT04")){
        tmp <- sqldf("select * from mydata2 where date > '20150810'", drv='SQLite')
        ret$Scode <- portid
        ret$Period <- sprintf("%s%s%s", min(tmp$date), "-", max(tmp$date)) 
        ret$Cumret <- dphelper.cumret(tmp$dret)
        #     ret$Cumret_SH50 <- dphelper.cumret(tmp$R_SH50)
        #     ret$Cumret_HS300 <- dphelper.cumret(tmp$R_HS300)
        #     ret$Cumret_ZZ500 <- dphelper.cumret(tmp$R_ZZ500)
        ret$Annret <- dphelper.annret(tmp$dret)
        ret$Vol <- dphelper.vol(tmp$dret)
        ret$SR <- dphelper.SR(tmp$dret)
        tmp$nav <- cumprod(1+tmp$dret/100)
        MDD <- dphelper.MDD(tmp$nav)
        ret$MDD <- MDD[1]
        ret$MDDSt <- tmp[MDD[2], 'date']
        ret$MDDEn <- tmp[MDD[3], 'date']
        
        
        ret$`2ndMDD` <- dphelper.secMDD(tmp)$`2ndMDD`
        ret$`2ndMDDSt` <- dphelper.secMDD(tmp)$`2ndMDDSt` 
        ret$`2ndMDDEn`  <- dphelper.secMDD(tmp)$`2ndMDDEn`
        
    }
    ret$Cumret <- round(ret$Cumret, 2)
    #   ret$Cumret_SH50 <- round(ret$Cumret_SH50, 2)
    #   ret$Cumret_HS300 <- round(ret$Cumret_HS300, 2)
    #   ret$Cumret_ZZ500 <- round(ret$Cumret_ZZ500, 2)
    ret$Annret <- round(ret$Annret, 2)
    ret$Vol <- round(ret$Vol, 2)
    ret$SR  <- round(ret$SR , 2)
    ret$MDD   <- round(ret$MDD , 2)
    ret$`2ndMDD`   <- round(ret$`2ndMDD` , 2)
    return (ret)
}

# input "2016-01-13", output "20160113"
dphelper.changedateformat <- function(date){
    tmpdate <- as.character(date)
    tmpdate <- str_replace_all(tmpdate, "-", "")
    return (tmpdate)
}


dphelper.secMDD <- function(tmp){
    ret <- c()
    MDD <- dphelper.MDD(tmp$nav)
    
    tmpbefore <- tmp[1:MDD[2]-1, ]
    tmpafter  <- tmp[MDD[3]+1:(nrow(tmp)-MDD[3]), ]
    if(nrow(tmpbefore) > 2){
        SecMDDbefore <- dphelper.MDD(tmpbefore$nav)
    }else{SecMDDbefore <- c()}
    if(nrow(tmpafter) > 2){
        SecMDDafter  <- dphelper.MDD(tmpafter$nav)
    }else{SecMDDafter <- c()}
    
    if((!is.null(SecMDDbefore)) && (!is.null(SecMDDafter))){
        if(SecMDDbefore[1] > SecMDDafter[1]){
            ret$`2ndMDD` <- SecMDDbefore[1]
            ret$`2ndMDDSt` <- tmpbefore[SecMDDbefore[2], 'date']
            ret$`2ndMDDEn` <- tmpbefore[SecMDDbefore[3], 'date']
        }else{
            ret$`2ndMDD` <- SecMDDafter[1]
            ret$`2ndMDDSt` <- tmpafter[SecMDDafter[2], 'date']
            ret$`2ndMDDEn` <- tmpafter[SecMDDafter[3], 'date']
        }
    }else if((!is.null(SecMDDbefore)) && (is.null(SecMDDafter))){
        ret$`2ndMDD` <- SecMDDbefore[1]
        ret$`2ndMDDSt` <- tmpbefore[SecMDDbefore[2], 'date']
        ret$`2ndMDDEn` <- tmpbefore[SecMDDbefore[3], 'date']
    }else if((is.null(SecMDDbefore)) && (!is.null(SecMDDafter))){
        ret$`2ndMDD` <- SecMDDafter[1]
        ret$`2ndMDDSt` <- tmpafter[SecMDDafter[2], 'date']
        ret$`2ndMDDEn` <- tmpafter[SecMDDafter[3], 'date']
    }
    return (ret)
}

dphelper.GetLastTradeDate <- function(date){
    con <- odbcConnect('252','production','production')
    codeday <- paste0("select CONVERT(varchar,MAX(TradingDay),112) as date
                    from JYDB.dbo.QT_DailyQuote
                    where TradingDay<'",date,"'")
    mydate <- sqlQuery(con,codeday,as.is = T)$date
    odbcClose(con)
    rm(con)
    return (mydate)
}

dphelper.GetLastTradeDate2 <- function(con, date){
    codeday <- paste0("select CONVERT(varchar,MAX(TradingDay),112) as date
                    from JYDB.dbo.QT_DailyQuote
                    where TradingDay<'",date,"'")
    mydate <- sqlQuery(con,codeday,as.is = T)$date
    return (mydate)
}

dphelper.dret2NAV <- function(mydata2){
    ret <- c()
    for(col in colnames(mydata2)){
        if(col != "date"){
            dret <- mydata2[, c ('date', col)]
            dret <- dret[complete.cases(dret),]
            dret$scode <- col
            dret$nav <- cumprod(1 + dret[, col]/100)
            
            dret <- dret[, (names(dret) %in% c("date", "scode", "nav"))]
            ret <- rbind(ret, dret)
        }
    }
    ret <- dcast(ret, date~scode)
    return (ret)
}


dphelper.Aftertradedate <- function(ch, sdate, N){
    predate <- DB.sqlQuery(ch, sprintf("select paperportfoilo.dbo.wddbaftertradedate('%s', %d) as date", sdate, N))  
    return (predate$date)
}

dphelper.Pretradedate <- function(ch, sdate, N){
    predate <- DB.sqlQuery(ch, sprintf("select paperportfoilo.dbo.wddbpretradedate('%s', %d) as date", sdate, N))  
    return (predate$date)
}


dphelper.EqualWeightPort <- function(ch, stockpool, calcdate){
    tmp <- stockpool
    initcapital <- 100000000
    LasttradeDatePrice <- DB.sqlQuery(ch, sprintf("select S_INFO_WINDCODE as code, S_DQ_CLOSE as closeprice from wddb.dbo.ASHAREEODPRICES a where a.TRADE_DT = '%s'", calcdate))
    tmp <- merge(tmp, LasttradeDatePrice, by = 'code')
    tmp$share <- floor((initcapital/nrow(tmp))/tmp$closeprice/100)*100
    return (tmp)
}



#17:15:15
dphelper.getTime <- function(){
    time <- format(Sys.time(), "%H:%M:%S")
    return (time)
}

dphelper.FilledNAWithLastData <- function(data, field){
    for(i in 2:nrow(data)){
        if(is.na(data[i, field])){
            data[i, field] <-  data[i-1, field]
        }
    }
    return (data)
}

dpheler.CaclMovingMeanSd <- function(dataList, dateList, calcWindow){
    Signal             <- zoo(dataList, dateList)
    # Miu                <- rollmean(x = Signal , k = calcWindow, align = c("right"))
    Miu                <- rollapply(data = Signal, width = calcWindow, FUN = mean, align = c("right"))
    sd                 <- rollapply(data = Signal, width = calcWindow, FUN = sd, align = c("right"))
    calcret00          <- as.data.frame(Miu)
    calcret00$sd       <- as.data.frame(sd)$sd
    calcret00$datetime <- as.POSIXct(rownames(calcret00)) 
    return (calcret00)
}

dpheler.CaclMovingMean <- function(dataList, dateList, calcWindow, nonedateformat = TRUE){
    Signal             <- zoo(dataList, dateList)
    Miu                <- rollapply(data = Signal, width = calcWindow, FUN = mean, align = c("right"))
    calcret00          <- as.data.frame(Miu)
    if(nonedateformat){
        calcret00$datetime <- as.POSIXct(rownames(calcret00)) 
    }else{
        calcret00$datetime <- rownames(calcret00)
    }
    return (calcret00)
}

# dataList <- Quote$adjclose
# dateList <- Quote$TRADE_DT
# calcWindow <- 1
# dphelper.CalcMovingMax(Quote$adjclose, Quote$TRADE_DT, CTATRENDPARAM$PREOPENDAYS)
dphelper.CalcMovingMax <- function(dataList, dateList, calcWindow){
    Signal             <- zoo(dataList, dateList)
    max                <- rollapply(data = Signal, width = calcWindow, FUN = max, align = c("right"))
    calcret00          <- as.data.frame(max)
    calcret00$datetime <- as.POSIXct(rownames(calcret00)) 
    return (calcret00)
}

dphelper.CalcMovingMin <- function(dataList, dateList, calcWindow){
    Signal             <- zoo(dataList, dateList)
    min                <- rollapply(data = Signal, width = calcWindow, FUN = min, align = c("right"))
    calcret00          <- as.data.frame(min)
    calcret00$datetime <- as.POSIXct(rownames(calcret00)) 
    return (calcret00)
}


dpheler.GenerateOrder <- function(data, code, BS, OffSet, guid, vol){
    #   ret <- c()
    #   ret$datetime <- as.POSIXct(strptime(sprintf("%s %s:00", data$date, data$time), "%Y%m%d %H:%M:%S"))
    #   ret$date     <- data$date
    #   ret$time     <- data$time
    #   ret$tradeID  <- guid
    #   ret$instr    <- code
    #   ret$BS       <- BS
    #   ret$OffSet   <- OffSet
    #   ret$vol      <- vol
    #   ret$price    <- data[ , code]
    #   ret$signal   <- data$signal
    #   return (ret)
    
    
    return (data.frame(datetime = c(as.POSIXct(strptime(sprintf("%s %s:00", data$date, data$time), "%Y%m%d %H:%M:%S"))),
                       date     = c(data$date),
                       time     = c(data$time),
                       tradeID  = c(guid),
                       instr    = c(code),
                       BS       = c(BS),
                       OffSet   = c(OffSet),
                       vol      = c(vol),
                       price    = c(data[ , code]),
                       signal   = c(data$signal),
                       MinIndex = c(data$MinIndex)))
}

dphelper.getMainInstr <- function(singleInstrPeriod, ignoreDays = 2){
    ret <- c()
    ret$sInstr    <- singleInstrPeriod$TRADE_HISCODE[1]
    # ret$startDate <- min(singleInstrPeriod$DATETIME)
    # ret$endDate   <- max(singleInstrPeriod$DATETIME)
    ret$startDate <- singleInstrPeriod$DATETIME[order(singleInstrPeriod$DATETIME)][ignoreDays+1]
    ret$endDate <- singleInstrPeriod$DATETIME[order(singleInstrPeriod$DATETIME, decreasing = T)][ignoreDays+1]
    return(as.data.frame(ret))
}

dphelper.getMainInstrPeriod <- function(sInstr, startDate, endDate, ignoreDays = 2){
    library(WindR)
    w.start(showmenu = F)
    splitFuturePeriods <- function(data, ignoreDays){
        row.names(data)		<- 1:nrow(data) 
        index <- c(as.integer(row.names(data[(data$difftime == 0 | data$difftime > 30), ])), nrow(data) + 1)
        ret <- c()
        for(i in 1 : (length(index)-1)){
            tmp	<- data[index[i] :  (index[i+1]-1), ]
            MainInstr <- dphelper.getMainInstr(tmp, ignoreDays)
            if(length(ret) == 0){
                ret <- MainInstr 
            }else{
                ret <- rbind(ret, MainInstr)
            }
        }
        return (ret)
    }
    
    w_wsd_data        <- w.wsd(sInstr, "trade_hiscode", startDate, endDate)
    w_wsd_data        <- w_wsd_data$Data
    w_wsd_data$YYYYMM <- format(w_wsd_data$DATETIME, '%Y%m')
    
    w_wsd_data$difftime	 <- ave(as.integer(w_wsd_data$DATETIME)  , w_wsd_data$TRADE_HISCODE, FUN = function(x) c(0, diff(x)))
    w_wsd_data$splitFlag	 <- w_wsd_data$TRADE_HISCODE
    
    ListInstrPeriod   <- split(w_wsd_data, f = w_wsd_data$TRADE_HISCODE)
    MainInstrPeriod <- lapply(ListInstrPeriod, splitFuturePeriods, ignoreDays) 
    MainInstrPeriod <- do.call('rbind', MainInstrPeriod)
    row.names(MainInstrPeriod) <- 1 : nrow(MainInstrPeriod)
    return (MainInstrPeriod)
}

# get commodity minute data from 253 sp
dphelper.getCommodityQuoteData <- function(InstrPeriod){
    InstrPeriod$startDate <- dphelper.changedateformat(InstrPeriod$startDate)
    InstrPeriod$endDate   <- dphelper.changedateformat(InstrPeriod$endDate)
    
    getQuoteData <- function(SingleInstrTerm){
        print(SingleInstrTerm$sInstr)
        CONTRACTID <- substr(SingleInstrTerm$sInstr, 1, nchar(as.character(SingleInstrTerm$sInstr))  - 4)
        ch  <- DB.Connect('253', 'dpadmin', 'dpadmin')
        ret <- DB.sqlQuery(ch, sprintf(" SELECT 
                                        * 
                                     FROM 
                                        Quote.dbo.sp 
                                     where 
                                        CONVERT(varchar, tdatetime, 112) >= '%s' and
                                        CONVERT(varchar, tdatetime, 112) <= '%s' and
                                        CONTRACTID = '%s'", 
                                       SingleInstrTerm$startDate,
                                       SingleInstrTerm$endDate,
                                       CONTRACTID))
        DB.close(ch);
        return (ret);
    }
    ListInstrPeriod       <- split(InstrPeriod, f = InstrPeriod$sInstr)
    QuoteData             <- lapply(ListInstrPeriod, getQuoteData)
    QuoteData             <- do.call('rbind', QuoteData)
    return (QuoteData)
}


dphelper.getCommodityDailyQuoteData <- function(CONTRACTID){
    
    ch  <- DB.Connect('252', 'dpadmin', 'Dao2016pu')
    ret <- c()
    if(CONTRACTID %in% c('IC.CFE', 'IF.CFE', 'IH.CFE')){
        ret <- DB.sqlQuery(ch, sprintf("  select 
                                            	a.*
                                       from 
                                       wddb.dbo.CINDEXFUTURESEODPRICES a,
                                       wddb.dbo.CFUTURESCONTRACTMAPPING b
                                       where
                                       a.S_INFO_WINDCODE = b.FS_MAPPING_WINDCODE and
                                       a.TRADE_DT >= b.STARTDATE and
                                       a.TRADE_DT <= b.ENDDATE and 
                                       b.S_INFO_WINDCODE = '%s'
                                       order by a.TRADE_DT
                                       ", CONTRACTID))
    }else if(CONTRACTID %in% c('T.CFE', 'TF.CFE') ){
        ret <- DB.sqlQuery(ch, sprintf("  select 
                                            	a.*
                                       from 
                                       wddb.dbo.CBondFuturesEODPrices a,
                                       wddb.dbo.CFUTURESCONTRACTMAPPING b
                                       where
                                       a.S_INFO_WINDCODE = b.FS_MAPPING_WINDCODE and
                                       a.TRADE_DT >= b.STARTDATE and
                                       a.TRADE_DT <= b.ENDDATE and 
                                       b.S_INFO_WINDCODE = '%s'
                                       order by a.TRADE_DT
                                       ", CONTRACTID))
    }
    else{
        ret <- DB.sqlQuery(ch, sprintf("  select 
                                            	a.*
                                            from 
                                            	wddb.dbo.CCOMMODITYFUTURESEODPRICES a,
                                            	wddb.dbo.CFUTURESCONTRACTMAPPING b
                                            where
                                            	a.S_INFO_WINDCODE = b.FS_MAPPING_WINDCODE and
                                            	a.TRADE_DT >= b.STARTDATE and
                                            	a.TRADE_DT <= b.ENDDATE and 
                                            	b.S_INFO_WINDCODE = '%s'
                                            order by a.TRADE_DT
                                            ", CONTRACTID))
    }
    DB.close(ch)
    
    
    return (ret)
}


dphelper.dret2NAVwithSName <- function(mydata2){
    ret <- c()
    for(col in colnames(mydata2)){
        if(col != "date"){
            dret <- mydata2[, c ('date', col)]
            dret <- dret[complete.cases(dret),]
            dret$scode <- col
            dret$nav <- cumprod(1 + dret[, col]/100)
            
            dret <- dret[, (names(dret) %in% c("date", "scode", "nav"))]
            ret <- rbind(ret, dret)
        }
    }
    ret <- dcast(ret, date~scode)
    return (ret)
}


dphelper.getListedBoard <- function(db, basket, field){
    sql.listedBoard <- sprintf("select S_INFO_LISTBOARD, S_INFO_CODE, S_INFO_WINDCODE 
                               from wddb.dbo.AShareDescription
                               where S_INFO_WINDCODE in (%s)", paste(shQuote(basket[, field], type = "sh"), collapse=','))
    listedBoard <- DB.sqlQuery(db, sql.listedBoard)
    return(listedBoard)
}


# dphelper.setwd() <- function(path){
#   str_replace_all(tmpdate, "-", "")
#   tmppath <- str_replace_all(path, "\\", "/")
#   setwd(tmppath)

# dphelper.indexdistribute <-function(basket, field){
#   
#   ch <- DB.Connect()
#   report.indexweight    <- c()
#   
#   HS300  <- DB.sqlQuery(ch, "select S_CON_WINDCODE from wddb.dbo.AIndexMembers where s_info_windcode = '000300.SH' and CUR_SIGN = '1'")
#   SH50   <- DB.sqlQuery(ch, "select S_CON_WINDCODE from wddb.dbo.AIndexMembers where s_info_windcode = '000016.SH' and CUR_SIGN = '1'")
#   ZZ500  <- DB.sqlQuery(ch, "select S_CON_WINDCODE from wddb.dbo.AIndexMembers where s_info_windcode = '000905.SH' and CUR_SIGN = '1'")
#   
#   basket$HS300  <- basket[, field] %in% HS300$S_CON_WINDCODE
#   basket$SH50   <- basket[, field] %in% SH50$S_CON_WINDCODE
#   basket$ZZ500  <- basket[, field] %in% ZZ500$S_CON_WINDCODE
#   
#   ret <- c()
#   ret$`stockcount` <- nrow(basket) 
#   ret$`nHS300`  <- length(basket[,field][basket$HS300])
#   ret$`nSZ50`   <- length(basket[,field][basket$SH50])
#   ret$`nZZ500`  <- length(basket[,field][basket$ZZ500])
#   
#   stk.listedBoard <- dphelper.getListedBoard(ch, basket, field)
#   DB.close(ch)
#   
#   basket <- merge(basket, stk.listedBoard, by.x = field, by.y = "S_INFO_WINDCODE")
#   ret$`nGEM`    <- length(basket[,field][basket$S_INFO_LISTBOARD.x=='434001000'])
#   ret$`nSME`    <- length(basket[,field][basket$S_INFO_LISTBOARD.x=='434003000'])
#   
#   report.indexweight <- rbind(report.indexweight , ret)
#   return (report.indexweight)
# }


dphelper.indexdistribute <- function(basket, field){
    
    ch <- DB.Connect()
    report.indexweight    <- c()
    
    HS300  <- DB.sqlQuery(ch, "select S_CON_WINDCODE from wddb.dbo.AIndexMembers where s_info_windcode = '000300.SH' and CUR_SIGN = '1'")
    SH50   <- DB.sqlQuery(ch, "select S_CON_WINDCODE from wddb.dbo.AIndexMembers where s_info_windcode = '000016.SH' and CUR_SIGN = '1'")
    ZZ500  <- DB.sqlQuery(ch, "select S_CON_WINDCODE from wddb.dbo.AIndexMembers where s_info_windcode = '000905.SH' and CUR_SIGN = '1'")
    
    basket$weight <- (1/nrow(basket))*100
    basket$HS300  <- basket[, field] %in% HS300$S_CON_WINDCODE
    basket$SH50   <- basket[, field] %in% SH50$S_CON_WINDCODE
    basket$ZZ500  <- basket[, field] %in% ZZ500$S_CON_WINDCODE
    
    ret <- c()
    ret$`stockcount` <- nrow(basket) 
    ret$`rHS300`  <- round(sum(basket$weight[basket$HS300]), 2)
    ret$`rSZ50`   <- round(sum(basket$weight[basket$SH50]), 2)
    ret$`rZZ500`  <- round(sum(basket$weight[basket$ZZ500]), 2)
    
    stk.listedBoard <- dphelper.getListedBoard(ch, basket, field)
    DB.close(ch)
    
    
    basket <- merge(basket, stk.listedBoard, by.x = field, by.y = "S_INFO_WINDCODE")
    ret$`rGEM`    <- round(sum(basket$weight[basket$S_INFO_LISTBOARD=='434001000']), 2)
    ret$`rSME`    <- round(sum(basket$weight[basket$S_INFO_LISTBOARD=='434003000']), 2)
    
    report.indexweight <- rbind(report.indexweight , ret)
    return (report.indexweight)
}


dphelper.removeNARows <- function(ret){
    return (ret[complete.cases(ret),])
}

# name: dret
dphelper.CalculateLastDaysPerformance <- function(theRet, periods, dateField = "Date"){
    ret <- data.frame()
    for(dates in periods){
        if(dates != 'YTD'){
            startIndex                           <- (nrow(theRet)- as.integer(dates) +1)
            startIndex                           <- ifelse(startIndex > 0, startIndex, 0)
            tmpret                               <- theRet[startIndex:nrow(theRet), ]
            ret[1, sprintf('%s%s',dates,'dret')] <-  (prod(1+tmpret$dret/100) - 1) * 100
        }else{
            tmpret        <- theRet
            sql           <- sprintf("select * from tmpret where %s > '%s'", dateField, dphelper.YearFirstDay())
            tmpret        <- sqldf(sql, drv='SQLite')
            ret[1, 'YTD'] <- (prod(1 + theRet$dret/100) - 1) * 100
        }
    }
    return (ret)
}


# ch, ret, 'FundNAV'
dphelper.calcMDD <- function(ch, ret, theKeyNAV){
    periods <- DB.sqlQuery(ch, sprintf("select 
                                       convert(varchar, DATEADD(yy, DATEDIFF(yy,0,getdate()), 0), 112) as yearfirst,
                                       convert(varchar, DATEADD(mm, DATEDIFF(m,0,getdate()), 0) , 112) as monthfirst"))
    #theYTD <- ret[ret$date>=periods$yearfirst, ]
    theYTD         <- ret[ret$date>=periods$yearfirst, ]
    theMTD         <- ret[ret$date>=periods$monthfirst, ]
    the5TD         <- ret[(nrow(ret)-4):nrow(ret), ]
    the10TD        <- ret[(nrow(ret)-9):nrow(ret), ]
    theDataSince4M <- ret[ret$date >= '20160331', ]
    
    p_getnav.mdd <- c()
    
    if(nrow(theYTD)>0){
        p_getnav.mdd$`YMDD` <- round(dphelper.MDD(theYTD[, theKeyNAV])[1], 2)
    }else{
        p_getnav.mdd$YMDD   <- 0
    }
    
    if(nrow(theMTD)>0){
        p_getnav.mdd$`MMDD` <- round(dphelper.MDD(theMTD[, theKeyNAV])[1], 2)
    }else{
        p_getnav.mdd$MMDD   <- 0
    }
    
    if(nrow(theDataSince4M > 0 )){
        p_getnav.mdd$`MDDSince4M` <- round(dphelper.MDD(theDataSince4M[, theKeyNAV])[1], 2)
    }else{
        p_getnav.mdd$MDDSince4M <- 0
    }
    
    maxNav <- max(theDataSince4M[, theKeyNAV])
    p_getnav.mdd$`Current DD` <- round(max((maxNav - theDataSince4M[nrow(theDataSince4M), theKeyNAV])/maxNav * 100, 0), 2)
    
    
    p_getnav.mdd$`SinceFund`  <- round(dphelper.MDD(ret[, theKeyNAV])[1], 2)
    
    
    
    
    if(nrow(the5TD)>0){
        mddret <- dphelper.MDD(the5TD[, theKeyNAV])
        p_getnav.mdd$`5MDD`<- round(mddret[1], 2)
        if(round(mddret[1], 2) > 0 ){
            p_getnav.mdd$`5MDDStartDate` <-  as.character(the5TD[mddret[2], ]$date)
            p_getnav.mdd$`5MDDEndDate` <-  as.character(the5TD[mddret[3], ]$date)
        }
        else{
            p_getnav.mdd$`5MDDStartDate` <-  NA
            p_getnav.mdd$`5MDDEndDate` <-  NA
        }
    }else{
        p_getnav.mdd$`5MMD` <- 0
    }
    
    if(nrow(the10TD)>0){
        mddret <- dphelper.MDD(the10TD[, theKeyNAV])
        p_getnav.mdd$`10MDD`<- round(mddret[1], 2)
        if(round(mddret[1], 2) > 0 ){
            p_getnav.mdd$`10MDDStartDate` <-  as.character(the10TD[mddret[2], ]$date)
            p_getnav.mdd$`10MDDEndDate` <-  as.character(the10TD[mddret[3], ]$date)
        }else{
            p_getnav.mdd$`10MDDStartDate` <-  NA
            p_getnav.mdd$`10MDDEndDate` <-  NA
        }
    }else{
        p_getnav.mdd$`10MDDStartDate` <- 0
    }
    
    p_getnav.mdd <- as.data.frame(p_getnav.mdd) 
    names(p_getnav.mdd) <- c('YMDD', 'MMDD', 'MDDSince4M', 'Current DD', 'SinceFund', '5MDD', '5MDDStartDate', '5MDDEndDate', '10MDD', '10MDDStartDate', '10MDDEndDate')
    
    p_getnav.mdd$period     <- sprintf("%s-%s", min(ret$date), max(ret$date))
    p_getnav.mdd$updatedate <- max(ret$date)
    return (p_getnav.mdd)
    
}

## get trade date N days ago
dphelper.getPreTradeDate <- function(date, N){
    tmpDate <- data.wddb.ASHARECALENDAR[data.wddb.ASHARECALENDAR$TRADE_DAYS<date, ]
    return (tmpDate[length(tmpDate)-N+1])
}

## get trade date N days later
dphelper.getAfterTradeDate <- function(date, N){
    tmpDate <- data.wddb.ASHARECALENDAR[data.wddb.ASHARECALENDAR$TRADE_DAYS>date, ]
    return (tmpDate[N])
}


dphelper.getMonthlyReturn <- function(ret, theKeyNAV, startYYYYMM){
    getMonthlyRet <- function(portNav){
        TotalMonthlyPerformance <- data.frame()
        if(nrow(portNav) == 1){
            MonthlyPerformance          <- c()
            MonthlyPerformance$YYYYMM   <- sprintf("%s%s", substr(portNav$date[1], 1, 4), substr(portNav$date[1], 5, 6))
            MonthlyPerformance$ret      <- round((portNav[, theKeyNAV] - 1)*100, 2)
            MonthlyPerformance          <- as.data.frame(MonthlyPerformance)
            names(MonthlyPerformance)   <- c('YYYYMM', portNav$PortID)
            return(MonthlyPerformance)
        }else{
            for(i in 2:nrow(portNav)){
                MonthlyPerformance <- c()
                MonthlyPerformance$YYYYMM <- sprintf("%s%s", substr(portNav$date[i], 1, 4), substr(portNav$date[i], 5, 6))
                MonthlyPerformance$ret    <- round((portNav[i, theKeyNAV] - portNav[i-1, theKeyNAV])/portNav[i-1, theKeyNAV] * 100, 2)
                TotalMonthlyPerformance   <- rbind(TotalMonthlyPerformance, MonthlyPerformance)
            }
            names(TotalMonthlyPerformance) <- c('YYYYMM', portNav$PortID[1])
            return (TotalMonthlyPerformance)
        }
    }

  tmpRet             <- ret
  tmpRetList         <- split(x = tmpRet, f = tmpRet$PortID)
  MonthlyPerformance <- lapply(tmpRetList, getMonthlyRet)
  
  MonthlyRet <- c()
  for(j in 1:length(MonthlyPerformance)){
    if(j == 1){
      MonthlyRet <- MonthlyPerformance[[j]]
    }
    else{
      MonthlyRet <- merge(MonthlyRet, MonthlyPerformance[[j]], all.x = T, all.y=T)
    }
  }
  
  return (MonthlyRet[MonthlyRet$YYYYMM >= startYYYYMM, ])
}


# ret constains name: "date"
# return
# X5Dret   MTD  YTD        period         updatedate
# 1   0.25 -0.05 1.17  20160108-20160407   20160407
dphelper.calcPerformanceByNAV <- function(ch, ret, theKeyNAV){
    periods         <- DB.sqlQuery(ch, sprintf("select 
                                               convert(varchar, DATEADD(yy, DATEDIFF(yy,0,getdate()), 0), 112) as yearfirst,
                                               convert(varchar, DATEADD(mm, DATEDIFF(m,0,getdate()), 0) , 112) as monthfirst"))
    theYTD          <- ret[ret$date>=periods$yearfirst, ]
    theLastMData    <- ret[ret$date<periods$monthfirst, ]
    
    # theMTD          <- rbind(theLastMData[nrow(theLastMData), ], ret[ret$date>=periods$monthfirst, ])
    theMTD          <-  ret[ret$date>=periods$monthfirst, ]
    
    the5TD          <- ret[(nrow(ret)-4):nrow(ret), ]
    
    today           <- dphelper.today() 
    the1MTD         <- ret[ret$date>=dphelper.getPreTradeDate(today, 20), ]
    the2MTD         <- ret[ret$date>=dphelper.getPreTradeDate(today, 40), ]
    the3MTD         <- ret[ret$date>=dphelper.getPreTradeDate(today, 60), ]
    
    
    p_getnav.perf <- c()
    
    if(nrow(the5TD)>0){
        p_getnav.perf$`5Dret` <- round(100*(prod(the5TD$Dret/100 + 1)-1), 2)
    }else{
        p_getnav.perf$`5Dret` <- 0
    }
    
    if(nrow(theMTD)>0){
        p_getnav.perf$MTD <- round(100*(prod(theMTD$Dret/100 + 1)-1), 2)
    }else{
        p_getnav.perf$MTD <- 0
    }
    
    if(nrow(theYTD)>0){
        p_getnav.perf$YTD <- round(100*(prod(theYTD$Dret/100 + 1)-1), 2)
    }else{
        p_getnav.perf$YTD <- 0
    }
    
    if(nrow(the1MTD)>0){
        p_getnav.perf$`1MTD` <- round(100*(prod(the1MTD$Dret/100 + 1)-1), 2)
    }else{
        p_getnav.perf$`1MTD` <- 0
    }
    
    if(nrow(the2MTD)>0){
        p_getnav.perf$`2MTD` <- round(100*(prod(the2MTD$Dret/100 + 1)-1), 2)
    }else{
        p_getnav.perf$`2MTD` <- 0
    }
    
    if(nrow(the3MTD)>0){
        p_getnav.perf$`3MTD` <- round(100*(prod(the3MTD$Dret/100 + 1)-1), 2)
    }else{
        p_getnav.perf$`3MTD` <- 0
    }
    
    p_getnav.perf <- as.data.frame(p_getnav.perf) 
    p_getnav.perf$lastnav <- ret[nrow(ret), theKeyNAV]
    
    names(p_getnav.perf) <- c('5Dret', 'MTD',  'YTD', '1MTD', '2MTD', '3MTD', 'lastnav')
    
    p_getnav.perf$period     <- sprintf("%s-%s", min(ret$date), max(ret$date))
    p_getnav.perf$updatedate <- max(ret$date)
    return (p_getnav.perf)
}

dphelper.getPreNDaysData <- function(Data, field, nDays){
  tmp <- Data
  filledData <-  vector("numeric", length = nDays)
  tmpPreDates <- data.frame(field = c(filledData, tmp[0 : (nrow(tmp)-nDays), field]))
  tradeCalendarWithPreNdays <-  cbind(tmp, tmpPreDates)
  tmpName <- sprintf("PRE%s%s", nDays, field)
  names(tradeCalendarWithPreNdays) <- c(names(Data), tmpName)
  tradeCalendarWithPreNdays[, tmpName] <- as.double(tradeCalendarWithPreNdays[, tmpName])
  tradeCalendarWithPreNdays <- tradeCalendarWithPreNdays[tradeCalendarWithPreNdays[, tmpName] != 0 , ]
  return (tradeCalendarWithPreNdays)
}

dphelper.getProdDailyRet <- function(Data, navField){
  tmpData <- dphelper.getPreNDaysData(Data, navField, 1)
  tmpData$Dret <- (tmpData$FundNAV/tmpData$PRE1FundNAV - 1) * 100
  return (tmpData[, !names(tmpData) %in% c(sprintf("PRE1%s", navField))])
}

dphelper.CalcStyle <- function(basket, bCode, date, WightKey){
  ret             <- c()
  ret$scode       <- bCode
  ret$date        <- date
  ret$value2      <- round(sum(basket[WightKey]*basket$value2), 3)
  ret$value1      <- round(sum(basket[WightKey]*basket$value1), 3)
  ret$size        <- -round(sum(basket[WightKey]*basket$size), 3)
  ret$reversal    <- round(sum(basket[WightKey]*basket$reversal), 3)
  ret$quality     <- round(sum(basket[WightKey]*basket$quality), 3)
  ret$momentum    <- round(sum(basket[WightKey]*basket$momentum), 3)
  ret$growth      <- round(sum(basket[WightKey]*basket$growth), 3)
  ret$analyst     <- round(sum(basket[WightKey]*basket$analyst), 3)
  ret <- as.data.frame(ret)
  return (ret)
}

dphelper.StockIndexStyle <- function(IndexCode, date){
  if(IndexCode == '000905.SH'){
    Indexdata <- ZZ500ComponentWeight
  }else if(IndexCode == '000300.SH'){
    Indexdata <- HS300Component
  }else if(IndexCode == '000016.SH'){
    Indexdata <- SZ50ComponentWeight
  }
  
  Indexdata$SecuCode <- sprintf("%06d", Indexdata$SecuCode)
  Indexdata          <- dphelper.FormatSecurityID(Indexdata, "SecuCode")
  
  factors               <- DB.sqlQuery(DB.CH, sprintf("select *  from paperportfoilo.dbo.factors where date = (select(max(date)) from paperportfoilo.dbo.factors where date <= '%s')", date))
  basket                <- merge(Indexdata, factors, by.x = 'SecuCode', by.y = 'code')
  basket[is.na(basket)] <- 0
  basket$Weight         <- basket$Weight/100
  return (dphelper.CalcStyle(basket, IndexCode, date, "Weight"))
}

# dphelper.GetLastQuoteData <- function(code, startdate, TERMMINUTES){
#   DateTime  <- dphelper.timestamp()    
#   HqData    <- w.wsi(code, "pct_chg, close" , as.character(startdate), DateTime)$Data
#   HqData    <- HqData[!is.na(HqData$close), ]
#   HqData    <- HqData[!is.na(HqData$pctchange), ]
  
  # HqData$close[nrow(HqData)]      <- w.wsq(code,'rt_latest')$Data$RT_LATEST
  # HqData$pctchange[nrow(HqData)]  <- HqData$close[nrow(HqData)]/HqData$close[nrow(HqData)-1]-1
  # HqData$date <- sprintf("%s", as.Date(as.character(HqData$DATETIME)) , "%Y%m%d")
  # HqData$date <- dphelper.changedateformat(HqData$date)
  # HqData      <- HqData[HqData$date %in% data.wddb.ASHARECALENDAR$TRADE_DAYS, ]
  
#   startRnow   <- nrow(HqData) - TERMMINUTES
#   HqData      <- HqData[(startRnow+1):nrow(HqData), ]
#   return (HqData)
# }

dphelper.YearFirstDay <- function(){
    return(sprintf("%s0101", format(Sys.time(), "%Y")))
}



dphelper.GetLastQuoteData <- function(code1, code2, startdate, TERMMINUTES){
  DateTime       <- dphelper.timestamp()    
  HqData1        <- w.wsi(code1, "pct_chg, close" , as.character(startdate), DateTime)$Data
  names(HqData1) <- c('datetime', 'pctchange1', 'close1')
  
  HqData2        <- w.wsi(code2, "pct_chg, close" , as.character(startdate), DateTime)$Data
  names(HqData2) <- c('datetime', 'pctchange2', 'close2')
  
  HqData         <- merge(HqData1, HqData2, by = 'datetime')
  HqData         <- dphelper.removeNARows(HqData)
  
  startRnow      <- nrow(HqData) - TERMMINUTES
  HqData         <- HqData[(startRnow+1):nrow(HqData), ]
  
  return (HqData)
}


dphelper.Quote <- function(InStr1, InStr2){
	Quote        <- w.wsq(sprintf("%s,%s", InStr1, InStr2), "rt_last,rt_bid1,rt_ask1,rt_pct_chg,rt_pre_settle")$Data
	return (Quote)
}


dphelper.mkdir <- function(sFileName){
	dir.create(sFileName, recursive = T)
}

dphelper.MonthFirstDay <- function(){
    return(sprintf("%s01", format(Sys.time(), "%Y%m")))
}

dphelper.getNearByDates <- function(date, n){
	ret <- c()
	if(class(date) == "Date"){
		date <- dphelper.changedateformat(date)
	}
	for(i in 1:n){
		ret[[length(ret) + 1]]	<- dphelper.Pretradedate(DB.CH, date, i)
		ret[[length(ret) + 1]]	<- dphelper.Aftertradedate(DB.CH, date, i)
	}
	return(ret)
}


dphelper.CalcMinsReturn <- function(dataList, dateList, calcWindow){
	Signal				<- zoo(dataList, dateList)
	CalcSingleWindowsRet <- function(MinsRetList){
		return ((prod(1+MinsRetList/100) - 1)*100) 
	} 
	
	SingleRet			<- rollapply(data = Signal, width = calcWindow, FUN = CalcSingleWindowsRet, align = c("right"))
	ret					<- as.data.frame(SingleRet)
	ret$datetime		<- as.POSIXct(row.names(ret))
	return (ret)
}



dphelper.getCommodityNonTradeDays <- function(Instr, startDate, endDate, num){
	Leg1DeliverPeriod            				<- dphelper.getMainInstrPeriod(Instr, startDate, endDate, 0)
	Leg1DeliverDays								<- lapply(Leg1DeliverPeriod$startDate, dphelper.getNearByDates, n=num)
	Leg1NonTradeDays							<- do.call('rbind', Leg1DeliverDays)
	Leg1NonTradeDays							<- as.list(Leg1NonTradeDays)
	Leg1NonTradeDays							<- c(as.character(Leg1NonTradeDays), dphelper.changedateformat(Leg1DeliverPeriod$startDate))
	return(Leg1NonTradeDays)
}


dphelper.getCommodityNonTradeDaysUseDB <- function(Instr, startDate, endDate, num){
    Leg1DeliverPeriod                           <- DB.sqlQuery(DB.CH, sprintf("select 
                                                                                FS_MAPPING_WINDCODE as sInstr, 
                                                                                STARTDATE as startDate, 
                                                                                ENDDATE as endDate 
                                                                              from 
                                                                                wddb.dbo.CFUTURESCONTRACTMAPPING 
                                                                              where 
                                                                                S_INFO_WINDCODE = '%s' and 
                                                                                STARTDATE >= '%s' and 
                                                                                STARTDATE <= '%s' order by STARTDATE", Instr, startDate, endDate))
    
    Leg1DeliverDays								<- lapply(Leg1DeliverPeriod$startDate, dphelper.getNearByDates, n=num)
    Leg1NonTradeDays							<- do.call('rbind', Leg1DeliverDays)
    Leg1NonTradeDays							<- as.list(Leg1NonTradeDays)
    Leg1NonTradeDays							<- c(as.character(Leg1NonTradeDays), dphelper.changedateformat(Leg1DeliverPeriod$startDate))
    return(Leg1NonTradeDays)
}


dphelper.getETFs <- function(sectorID){
    IndustryETF          <- w.wset('sectorconstituent', sprintf('date=%s;sectorid=%s', as.character(Sys.Date()), sectorID))$Data
    etfinfo              <- w.wss(paste(IndustryETF$wind_code, collapse = ','), 
                        'ipo_date,fund_trackindexcode,fund_benchmark,fund_benchindexcode,fund_fundmanager,fund_mgrcomp')$Data
    
    IndustryETF          <- merge(IndustryETF, etfinfo, by.x = 'wind_code', by.y = 'CODE')
    IndustryETF          <- IndustryETF[, ! names(IndustryETF) %in% c('CODE')] 
    IndustryETF$date     <- dphelper.changedateformat(as.Date(w.asDateTime(IndustryETF$date)))
    IndustryETF$IPO_DATE <- dphelper.changedateformat(as.Date(w.asDateTime(IndustryETF$IPO_DATE)))
    IndustryETF          <- IndustryETF[ , c('wind_code', 'sec_name', 'date', 'IPO_DATE', 'FUND_TRACKINDEXCODE', 'FUND_BENCHMARK', 'FUND_BENCHINDEXCODE', 'FUND_FUNDMANAGER', 
                                    'FUND_MGRCOMP')]
    return(IndustryETF)
}


dphelper.minListAndConstant <- function(listdata, constant){
    tmp <- matrix(data = c(listdata, rep(constant, length(listdata))), nrow = length(listdata), byrow = F, ncol = 2)
    return(apply(tmp, 1, min))
}

dphelper.maxListAndConstant <- function(listdata, constant){
    tmp <- matrix(data = c(listdata, rep(constant, length(listdata))), nrow = length(listdata), byrow = F, ncol = 2)
    return(apply(tmp, 1, max))
}


dphelper.getFutureID <- function(InstrIDList){
    if(length(InstrIDList) == 0){return (c())}
    matchPos            <- regexec("(\\d+)", InstrIDList)
    matchRet            <- regmatches(InstrIDList, matchPos)
    return(toupper(str_replace(InstrIDList, do.call('rbind', matchRet)[,1], '')))
}


dphelper.getinstrlist <- function(){
    instrlist           <- DB.sqlQuery(DB.CH, sprintf("select distinct FS_MAPPING_WINDCODE as strid from wddb.dbo.CfuturesContractMapping a where a.STARTDATE <= '%s' and a.ENDDATE >= '%s' order by FS_MAPPING_WINDCODE", dphelper.today(), dphelper.today()))
    tmp <- c()
    tmp$strid       <- instrlist[!grepl('-S', instrlist$strid), ]
    tmp$ctpid       <- substr(tmp$strid, 1, nchar(tmp$strid)-4)
    tmp$exchange    <- substr(tmp$strid, nchar(tmp$strid)-2, nchar(tmp$strid))
    tmp             <- as.data.frame(tmp)
    tmp[tmp$exchange  %in% c('DCE', 'SHF'), ]$ctpid <- tolower(tmp[tmp$exchange  %in% c('DCE', 'SHF'), ]$ctpid)
    return(tmp)
}





dphelper.getSuspendByJYDBSpecialNotice <- function(date){
    codestatus        <- sprintf("select 
                                      m.SecuCode as id
                                  from 
                                      JYDB.dbo.SecuMain m join JYDB.dbo.LC_SpecialNotice sn on sn.InnerCode = m.InnerCode
                                  where 
                                      m.SecuCategory = 1 and 
                                      SUBSTRING(m.SecuCode,1,1) in ('0','3','6') and 
                                      '%s' between CONVERT(varchar,sn.NoticeStartDate,112) and CONVERT(varchar,sn.NoticeEndDate,112) and 
                                      sn.SuspendTime is not NULL", date)
    
    status            <- DB.sqlQuery(DB.CH, codestatus)
    status$id         <- sprintf("%06d", status$id)
    return(status)
}

dphelper.getST <- function(date){
    codest              <- sprintf("SELECT 
                                        SUBSTRING(S_INFO_WINDCODE,1,6) as id
                                    FROM 
                                        wddb.dbo.asharest st
                                    where 
                                        '%s' between ENTRY_DT and ISNULL(REMOVE_DT, CONVERT(varchar, GETDATE(), 112)) and 
                                        S_TYPE_ST = 'S'
                                    order by S_INFO_WINDCODE", date)
    
    st                  <- DB.sqlQuery(DB.CH, codest)
    st$id               <- sprintf("%06d", st$id)
    return(st)
}


dphelper.getLastIPO <- function(pastYears, date){
    codeipo             <- sprintf(" select 
                                            SUBSTRING(S_INFO_WINDCODE,1,6) as id, 
                                            S_IPO_LISTDATE
                                        from 
                                            wddb.dbo.ASHAREIPO
                                        where 
                                            S_IPO_LISTDATE between '%s' and '%s'", dphelper.getPreTradeDate(date, 244*pastYears), date)
    
    ipo                 <- DB.sqlQuery(DB.CH, codeipo)
    ipo$id              <- sprintf("%06d", ipo$id)
    return(ipo)
}


dphelper.StrategyGetDYUniverse <- function(currentDate, PreDate, LastTradeDate){
    codeactnum    <- sprintf("select 
                                SUBSTRING(a.S_INFO_WINDCODE,1,6) as Stkcd, 
                                COUNT(distinct(p.S_INSTITUTIONNAME)) as num
                             from 
                                wddb.dbo.ASHAREISACTIVITY a join wddb.dbo.ASHAREISPARTICIPANT p on a.EVENT_ID = p.EVENT_ID
                             where 
                                a.S_ACTIVITIESTYPE = '254001000' and 
                                (p.S_INSTITUTIONTYPE is not NULL or p.S_INSTITUTIONTYPE = '257001006') and 
                                a.ANN_DT <= '%s' and 
                                a.S_SURVEYDATE between '%s' and '%s'
                             group by a.S_INFO_WINDCODE", currentDate , PreDate, LastTradeDate)
    
    actnum        <- DB.sqlQuery(DB.CH, codeactnum)
    actnum$Stkcd  <- sprintf("%06d", actnum$Stkcd)
    return(actnum)
}


#### Ding Zeng #### 
dphelper.StrategyGetDZUniverse <- function(date){
    codefellow  <- sprintf("select
                                SUBSTRING(s.S_INFO_WINDCODE,1,6) as Stkcd,
                                s.S_FELLOW_PROGRESS as progress,
                                t.S_TYPNAME as type,
                                s.S_FELLOW_PREPLANDATE,
                                s.S_FELLOW_APPROVEDDATE,
                                s.S_FELLOW_ORGPRICEMIN,
                                s.ANN_DT,
                                s.PRICINGDATE,
                                s.S_FELLOW_PRICEUPLIMIT,
                                s.S_FELLOW_PRICEDOWNLIMIT,
                                p.S_DQ_ADJFACTOR,
                                s.S_FELLOW_ORGPRICEMIN * p.S_DQ_ADJFACTOR as p_adjprice
                            from
                                wddb.dbo.ASHARESEO s
                                join wddb.dbo.ASHARETYPECODE t on CAST(t.S_ORIGIN_TYPCODE AS INT) = s.S_FELLOW_OBJECTIVE_CODE
                                left join wddb.dbo.ASHAREEODPRICES p on s.S_INFO_WINDCODE = p.S_INFO_WINDCODE and s.PRICINGDATE = p.TRADE_DT
                            where
                                p.S_DQ_ADJFACTOR = ISNULL(p.S_DQ_ADJFACTOR,1) and
                                S_FELLOW_ISSUETYPE = '439006000' and
                                s.S_FELLOW_PREPLANDATE < '%s'", date)
    fellow      <- DB.sqlQuery(DB.CH, codefellow)
    fellow      <- fellow[order(fellow$Stkcd, fellow$S_FELLOW_PREPLANDATE, decreasing = T), ]
    fellow      <- fellow[!duplicated(fellow$Stkcd), ]
    fellow      <- fellow[((!fellow$progress%in%c(3,4,11,12,14,16,21,22,24) & fellow$ANN_DT < date) | fellow$ANN_DT >= date ), ]
    return(fellow)
} 

#### Gao guan zeng chi #### 
dphelper.StrategyGetGGZCUniverse <- function(date, LastN){
    
    codeinsider <- sprintf("declare 
                                @lastn varchar(8),
                                @dateuse varchar(8)
                                
                            set @lastn = '%s'
                            set @dateuse = '%s';
                            
                            with aa as (select 
                                            CONVERT(varchar,TradingDate,112) as date, 
                                            ROW_NUMBER() over(order by TradingDate) as tnum
                                        from 
                                            JYDB.dbo.QT_TradingDayNew
                                        where 
                                            SecuMarket = 83 and IfTradingDay = 1 and 
                                            TradingDate <= @dateuse)
                            
                            select 
                                SUBSTRING(i.S_INFO_WINDCODE,1,6) as Stkcd, 
                                COUNT(i.S_INFO_WINDCODE) as num, 
                                SUM(i.CHANGE_VOLUME) as volume, 
                                AVG(i.TRADE_AVG_PRICE) as avgp, 
                                SUM(i.POSITION_AFTER_TRADE) as posafter, 
                                AVG(p.S_DQ_CLOSE)/AVG(i.TRADE_AVG_PRICE)-1 as revs, 
                                SUM(i.TRADE_AVG_PRICE*i.CHANGE_VOLUME) as amount
                            from 
                                wddb.dbo.ASHAREINSIDERTRADE i 
                                join aa as a1 on a1.date = (select MIN(aa.date) from aa where aa.date>=i.TRADE_DT)
                                right join aa as a2 on a2.date = (select MIN(aa.date) from aa where aa.date>=i.ANN_DT)
                                left join wddb.dbo.ASHARETYPECODE as tc on tc.S_ORIGIN_TYPCODE = i.TRADE_REASON_CODE
                                left join wddb.dbo.ASHAREEODPRICES p on p.S_INFO_WINDCODE = i.S_INFO_WINDCODE 
                                and p.TRADE_DT = (select MAX(TRADE_DT) from wddb.dbo.ASHAREEODPRICES where TRADE_DT < '%s')
                            where 
                                i.ANN_DT >= @lastn and i.ANN_DT < @dateuse and
                                a2.tnum - a1.tnum <= 5 and 
                                i.TRADE_AVG_PRICE!=0
                                group by i.S_INFO_WINDCODE", LastN, date, date)
    
    insider         <- sqlQuery(DB.CH, codeinsider)
    insider$Stkcd   <- sprintf("%06d",insider$Stkcd)
    return(insider)
} 




dphelper.getFactorPath <- function(){
	g_home <- getwd()
	return(sprintf('%s/MultiFactor/production/data/', g_home))
}

dphelper.getMainInstrByFutureID <- function(id){
    e 					<- CommdityParams[CommdityParams$id == id, ]
    e$s_info_windcode 	<- sprintf('%s.%s', e$id, e$exchange)
    return(dphelper.getMainstr(e))
}

dphelper.getMainstr <- function(e){
    e$strid               <- DB.sqlQuery(DB.CH, sprintf("select 
                                                        FS_MAPPING_WINDCODE 
                                                        from 
                                                        Wddb.dbo.CfuturesContractMapping b 
                                                        where 
                                                        b.S_INFO_WINDCODE = '%s' and 
                                                        b.STARTDATE = (select MAX(STARTDATE) from Wddb.dbo.CfuturesContractMapping a where a.S_INFO_WINDCODE = '%s')
                                                        ", e$s_info_windcode, e$s_info_windcode))$FS_MAPPING_WINDCODE
    if(e$s_info_windcode %in% c('IC.CFE', 'IF.CFE', 'IH.CFE')){
        e$Index   <- 1
    }else{
        e$Index   <- 0
    }
    return (e)
}

dphelper.getPreClose <- function(scodelist, date){
	lastdate 		<- dphelper.Pretradedate(DB.CH, date, 1)
	getpreclosesql  <- sprintf("select 
					TRADE_DT, 
					S_INFO_WINDCODE, 
					S_DQ_CLOSE  
					from 
					wddb.dbo.ASHAREEODPRICES a 
					where 
					a.TRADE_DT = '%s' and a.S_INFO_WINDCODE in (%s)", 
			lastdate, dphelper.changeListToSQLFormatIN(scodelist))
	preclose 		<- DB.sqlQuery(DB.CH, getpreclosesql)
	return(preclose)
}

dphelper.calcNum <- function(asset, realport){
#	realport$vol <- floor((asset/nrow(realport)/realport$S_DQ_CLOSE)/100) * 100
	realport$vol <- round(asset/nrow(realport)/realport$S_DQ_CLOSE/100, 0) * 100
	return(realport)
}




dphelper.changePortFormat <- function(realport, date) {
	realport$IsSH   <- substr(realport$Stkcd, 1, 1) == '6'
	realport    	<- dphelper.FormatSecurityID(df = realport, field = 'Stkcd')
	preclose 		<- dphelper.getPreClose(realport$Stkcd, date)
	realport    	<- merge(realport, preclose, by.x = 'Stkcd', by.y = 'S_INFO_WINDCODE')
	realport 		<- dphelper.calcNum(100000000, realport)
}


dphelper.getPreNdaysSuspendStock <- function(today, preNdays){
    preday <- today
	if(preNdays != 0){
        preday 	<- dphelper.getPreTradeDate(today, preNdays)
	}
	suspend <- DB.sqlQuery(DB.CH, sprintf("select S_INFO_WINDCODE from wddb.dbo.AShareTradingSuspension a where a.S_DQ_SUSPENDDATE >= '%s' and a.S_DQ_SUSPENDDATE <= '%s'", preday, today))
	return(unique(suspend$S_INFO_WINDCODE))
}



dphelper.yearlyPerformance <- function(port, dretField){
    port$year       <- substr(port$date, 1, 4)
    port$fundnav    <- cumprod(1+port[ , dretField])
    
    yearRoundPerformance <- function(e){
        maxdate <- max(e$date)
        return(e[e$date == maxdate, ])
    }
    
    ret         <- lapply(split(port, f = port$year), yearRoundPerformance)
    ret         <- do.call('rbind', ret)
    ret$prenav  <- c(1, ret$fundnav[1:(nrow(ret)-1)])
    ret$yearRet <- (ret$fundnav - ret$prenav)/ret$prenav * 100
    ret[,c('year', 'yearRet')]
}


dphelper.showStrategyPerformance <- function(navlist, datalist) {
	formatmonthlyperformance <- function(e){
		e       	<- t(e)
		e 			<- as.data.frame(e)
		colnames(e) <- e['mm', ]
		e['V1', ] 	<- round(as.numeric( e['V1', ])*100, 2)
		e$yyyy 		<- e['yyyy', '01']
		e 			<- e['V1', ]
		return(e)
	}
	
	xport   				<- xts(navlist, as.Date(as.character(datalist), '%Y%m%d') )
	dret    				<- Return.calculate(xport, method="discrete")
	monthlyperformance  	<- apply.monthly(dret, Return.cumulative)
	monthlyperformance  	<- as.data.frame(monthlyperformance) 
	monthlyperformance$yyyy <- substr(row.names(monthlyperformance) , 1, 4)
	monthlyperformance$mm   <- substr(row.names(monthlyperformance), 6, 7)
	monthlyperformancelist  <- split(monthlyperformance, f = monthlyperformance$yyyy)
	monthreturn 			<- lapply(monthlyperformancelist, formatmonthlyperformance)
	monthreturn             <- Reduce(f = function(...){ return(merge(..., all=T))}, monthreturn) 
	
	yearperformance     	<- apply.yearly(dret, Return.cumulative)
	yearperformance      	<- as.data.frame(yearperformance)
	yearperformance$yyyy   	<- substr(row.names(yearperformance), 1, 4)
	names(yearperformance) 	<- c('annret', 'yyyy')
	yearperformance$annret 	<- round(yearperformance$annret*100, 2)
	performance 			<- merge(yearperformance, monthreturn, by = 'yyyy')
}


dphelper.GuaiLiLv <- function(data, closefield, width){
    library(zoo)
    meanprice       <- rollapply(data[, closefield], width, mean, align = "right")
    data$meanprice  <- c(rep(0,width-1),meanprice[1:(length(meanprice))])
    data$BIAS       <- (data[, closefield] - data$meanprice)/data$meanprice * 100
    return(data[, !names(data) %in% c('meanprice')])
}

dphelper.GuaiLiLv2 <- function(data, closefield, width){
    library(zoo)
    meanprice       <- rollapply(data[, closefield], width, mean, align = "right")
    data$meanprice  <- c(rep(0, width-1), meanprice[1:(length(meanprice))])
    data$BIAS       <- (data[, closefield] - data$meanprice)/data$meanprice * 100
    data$BIAS       <- c(0, data$BIAS[1:(length(data$BIAS)-1)])
    return(data[, !names(data) %in% c('meanprice')])
}




dphelper.SuspendByWindAPI <- function(codelist, date){
    wd.status           <- w.wss(codelist,'trade_status, sec_type, sec_name', sprintf('tradeDate=%s', date))$Data
    nontradinglist      <- wd.status[wd.status$TRADE_STATUS != "交易", ]
    nontradinglist      <- nontradinglist[nontradinglist$SEC_TYPE =="普通股", ]
    return(nontradinglist)
}

dphelper.getSupendAndLastIPOByWindASHAREEODPRICES <- function(date) {
    lastdate   <- dphelper.getPreTradeDate(date, 1)
    codestatus <- sprintf("select 
                                S_INFO_WINDCODE as Stkcd
                           from 
                                wddb.dbo.ASHAREEODPRICES
                           where 
                                s_dq_tradestatus is not NULL and 
                                (S_DQ_TRADESTATUS like '停牌' or S_DQ_TRADESTATUS = 'N') and 
                                TRADE_DT = '%s'", lastdate)
    status <- DB.sqlQuery(DB.CH, codestatus)
    return(status)
}



dphelper.saveXTformat <- function(realport, today, scode, num, outputpath){
    #### Xun tou format ####
    realport$Stkcd 							<- substr(realport$Stkcd, 1, 6)
    realport$name 							<- ''
    realport$bs 							<- '0'
    realport$wt 							<- ''
    realport 								<- realport[, c('Stkcd', 'name', 'vol', 'wt', 'bs')]
    names(realport) 						<- c('代码', '名称', '数量', '权重', '方向')
    outfile 								<- sprintf("%s/%s/%s%s.XT%s.xlsx", outputpath, scode, scode, num, today)
    write.xlsx2(realport, file = outfile, row.names = F, fileEncoding = 'UTF-8')
}


dphelper.saveJZformat <- function(realport, today, scode, num, OUTPUTPATH, SIM = FALSE, NONEXLS = FALSE){
    #### Jin Zhen format ####
    realport$IsSH[realport$IsSH == TRUE]   	<- '1'
    realport$IsSH[realport$IsSH == FALSE]  	<- '0'
    realport$Stkcd 							<- substr(realport$Stkcd, 1, 6)
    realport$wt 							<- ''
    realport$replace 						<- '0'
    realport 								<- realport[ , c('IsSH', 'Stkcd', 'replace', 'wt', 'vol')]
    realport$Stkcd 							<- substr(realport$Stkcd, 1, 6)
    names(realport)							<- c('交易市场', '证券代码', '替换类型', '目标权重', '目标数量')
    if(!NONEXLS){
        if(!SIM){
            outfile 							<- sprintf("%s/%s/%s%s.JZ%s.xlsx", OUTPUTPATH, scode, scode, num, today)
            write.xlsx2(realport, file = outfile, row.names = F, fileEncoding = 'UTF-8')
        }else{
            outfile 							<- sprintf("%s/%s/%s%s%s.xlsx", OUTPUTPATH, scode, scode, num, today, fileEncoding = 'UTF-8')
            write.xlsx2(realport, file = outfile, row.names = F, fileEncoding = 'UTF-8')
        }
    }else{
        return(realport)
    }
}


################ CONSTANT ################
today <- dphelper.today()
