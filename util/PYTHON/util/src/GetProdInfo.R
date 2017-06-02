

#install.packages("WindR")


library(RODBC)
library(WindR)
w.start(showmenu=F)

rm(list = ls()) 

jydb_allConnect  <- odbcConnect('253',uid='xiao',pwd='xiao')


sql.getPortID <- paste("select distinct RTRIM(PortID) from jydb_all.dbo.dpProd;")

Prod.PortID <- sqlQuery(jydb_allConnect , as.is=FALSE, sql.getPortID)
Prod.pos <- data.frame(code=c(), portid=c())

for (i in 1: dim(Prod.PortID[1])[1])
{
  print(Prod.PortID[i,1])
  sql.positionstk <- paste("select distinct RTRIM(pos.SecurityID) + '.' + RTRIM(pos.StockExchange) as code, '", Prod.PortID[i,1] ,"' as portid from jydb_all.dbo.dpValuationPos pos where 
          Date = (select MAX(Date) from jydb_all.dbo.dpValuationPos where PortID ='",Prod.PortID[i,1],"');", sep = '')

  Prod.pos <- rbind(Prod.pos, sqlQuery(jydb_allConnect , as.is=FALSE, sql.positionstk))
}



 
w_wss_data<-w.wss(unique(Prod.pos[, 1]),'trade_status','tradeDate=20150703')

Prod.suspended <- subset(w_wss_data$Data, TRADE_STATUS =='Í£ÅÆÒ»Ìì', select = CODE: CODE)


odbcClose(jydb_allConnect)

