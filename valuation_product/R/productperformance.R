


rm(list=ls())
source("./dputil/dphelper.R")
source("./dputil/DB.R")
load('./strategy/CTA/rdata/CommdityParams.rdata')

CAPITALADJ      <- data.frame(portid =  c("CM1H01",      "CM1A01",      "CM1B01",      "CS1D01",      "CS2B02",      "CS9Z01",     "CS1E02"),
                              option =  c(0,	         0,	      265062,	     0,	    		0,	           0,            0),
                              adjcash = c(0,	         155425.5,	          20703167,	       5688239,	            1999389,	           0,            100000))
SETTLEDATE      <- '20170418'
SETTLEDATE      <- dphelper.today()

calcnav <- function(){
    ch              <- DB.Connect('62', 'dpadmin', 'dpadmin')
    ret             <- DB.sqlQuery(ch,  sprintf("exec jydb_all.dbo.calcnav %s, 1", SETTLEDATE))
    
    ret             <- merge(ret, CAPITALADJ, by = 'portid')
    ret[, '总资产'] <- ret[, '总资产'] + ret[, 'option'] + ret[, 'adjcash']
    
    #    predatedata     <- DB.sqlQuery(ch, sprintf("select date, rtrim(PortID) as portid, GrossAsset, FundNAV  from jydb_all.dbo.dpprod where date = '%s' and len(portid) = 6", "20170228"))
    predatedata     <- DB.sqlQuery(ch, sprintf("select date, rtrim(PortID) as portid, GrossAsset, FundNAV  from jydb_all.dbo.dpprod where date = '%s' and len(portid) = 6", dphelper.Pretradedate(DB.CH, SETTLEDATE, 1)))
    ret             <- merge(ret, predatedata, by = 'portid')
    
    ret[, '当日收益(%)']        <- round((ret[, '总资产']/ret[,'GrossAsset'] - 1) * 100, 2)
    ret[, '净值']         <- round(ret$FundNAV * (1+ret[, '当日收益(%)']/100), 4)
    ret             <- ret[ , c("portid",  "产品简称",  "总资产", "当日收益(%)", "净值",   "股票现金",                
                                "期货保证金", "期货现金", "现金", "股票市值", "股票仓位(%)", "基金市值",
                                "基金仓位(%)", "股指期货市值", "股指期货仓位", "股指期货保证金占用(%)", "国债现货+国债期货市值", "国债现货+国债期货仓位(%)", "敞口(%)" )]
    
    ret             <- as.data.frame(t(ret))
    
    sqlbatch        <- sprintf("delete from jydb_all.dbo.dpprod where date = '%s' and portid = '%s'", SETTLEDATE, ret['portid',])
    noneoutput      <- DB.sqlQueryBatch(ch, sqlbatch)
    sqlbatch        <- sprintf("insert into jydb_all.dbo.dpProd(Date, PortID, PortSName, GrossAsset, FundNAV) values('%s', '%s', '%s', %s, %s)",
                               SETTLEDATE, ret['portid', ], ret['产品简称', ], ret['总资产', ], ret['净值', ])
    noneoutput      <- DB.sqlQueryBatch(ch, sqlbatch)
    
    DB.close(ch)
    names(ret)      <- ret['portid', ]
    ret$item        <- rownames(ret) 
    ret['产品简称', ] <- iconv(ret['产品简称', ], to="utf-8")
    ret$item <- iconv(ret$item, to="utf-8")
    rownames(ret) <- 1:nrow(ret)
    
    ret[4,'CM1A01'] <- '0.00'
    ret[4,'CM1B01'] <- '0.00'
    ret[4,'CS1D01'] <- '0.00'
    ret[4,'CS2B02'] <- '0.00'
    
    ret <- ret[ , !names(ret) %in% c('CM1A01', 'CM1B01')] 
    
    return(dphelper.formatResponse(ret[c(-1, -2), ], ''))
}

getFundPos <- function(){
    ch                      <- DB.Connect('62', 'dpadmin', 'dpadmin')
    fundpos                 <- DB.sqlQuery(ch, sprintf("select * from jydb_all.dbo.v_dpfundpos where date = '%s'", SETTLEDATE))
    DB.close(ch)
    fundpos                 <- fundpos[order(fundpos$PortSName), !names(fundpos) %in% c('Remark', 'PortID')]
    fundpos$PortSName       <- iconv(fundpos$PortSName, to="utf-8")
    fundpos$securityName    <- iconv(fundpos$securityName, to="utf-8")
    
    return(dphelper.formatResponse((fundpos), ''))
}


getFuturePos <- function(){
    ch                  <- DB.Connect('62', 'dpadmin', 'dpadmin')
    futurepos           <- DB.sqlQuery(ch, sprintf("select date, rtrim(portid) as portid, rtrim(portsname) as portsname, rtrim(InstrID) as instrid, clearprice, btotalamt, stotalamt, amount, mkv from jydb_all.dbo.v_dpfuturePosdetails where date = '%s'", SETTLEDATE))
    DB.close(ch)
    futurepos$id        <- dphelper.getFutureID(futurepos$instrid)
    futurepos           <- merge(futurepos, CommdityParams[, c("id", "times", "name")], by = 'id')
    futurepos$mkv       <- futurepos$amount * futurepos$times * futurepos$clearprice
    futurepos           <- futurepos[order(futurepos$portsname), ] 
    futurepos           <- futurepos[, c('date', 'portsname', 'instrid', 'name', 'clearprice', 'btotalamt', 'stotalamt', 'amount', 'mkv')]
    futurepos$portsname <- iconv(futurepos$portsname, to="utf-8")
    futurepos$name      <- iconv(futurepos$name, to="utf-8")
    return(dphelper.formatResponse(futurepos, ''))
}


