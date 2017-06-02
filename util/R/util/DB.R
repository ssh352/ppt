




library(RODBC)
library(RMySQL)
source('dputil/dphelper.R')
load("./strategy/CTA/rdata/CommdityParams.rdata")




DBMYSQL.DBNAME     <- 'dp'
DBMYSQL.DBUSER     <- 'root'
DBMYSQL.DBPWD      <- 'root'
DBMYSQL.DBHOST     <- '127.0.0.1'
DBMYSQL.DBPORT     <- 3306



DBMYSQL.getMysqlData <- function(sql){
    con <- dbConnect(MySQL(), 
                     dbname    = DBMYSQL.DBNAME, 
                     username  = DBMYSQL.DBUSER, 
                     password  = DBMYSQL.DBPWD, 
                     host      = DBMYSQL.DBHOST, 
                     port      = DBMYSQL.DBPORT)
    
    dbSendQuery(con, 'SET NAMES gbk')
    
    res           <- dbSendQuery(con, sql)
    ret           <- fetch(res)
    dbClearResult(res)
    dbDisconnect(con) 
    return(ret)
}



# connect to database
DB.Connect <- function(dbname, uid, pwd){
  return (odbcConnect(dbname,uid,pwd))
}

    
# close database
DB.close <- function(ch){
  odbcClose(ch)
}

# execute batch sql
DB.RunBatchSQL <- function(ch, sqldata){
  if(!('sql' %in% colnames(sqldata))){
    warning("DB.RunBatchSQL error: dataframe does not have sql field" )
    return(NA)
  }
  a <- lapply(sqldata$sql, function(sql){
    sqlQuery(ch, as.is=FALSE, sql)
  })
  rm(a)
}

# execute select 
DB.sqlQuery <- function(ch, sql){
  return (sqlQuery(ch, as.is=FALSE, sql, stringsAsFactors = F))
}

DB.sqlQuery2 <- function(sql, ch){
    return (sqlQuery(ch, as.is=FALSE, sql, stringsAsFactors = F))
}

DB.sqlQueryAsChar <- function(ch, sql){
  return (sqlQuery(ch, as.is=FALSE, sql, stringsAsFactors = F))
}

DB.sqlQueryBatch <- function(ch, sqlList){
    return(lapply(sqlList, DB.sqlQuery2, ch))
}


# connect to mysql database
DB.mysql.Connect <- function(){
  return (odbcConnect('hqserver32',uid='root',pwd='root'))
}

DB.CH          <- DB.Connect('db', 'root', 'root')

