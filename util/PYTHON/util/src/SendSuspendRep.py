# -*- coding: utf-8 -*-
import mailutil
import pyodbc
import time
import csv
import rpy2.robjects as robjects
from mailutil import *
import datetime

    
if __name__ == '__main__':

    day = datetime.datetime.now()
    # if day.weekday() > 4: 
        # return
    iftradeday = "select * from jydb.dbo.QT_TradingDayNew where IfTradingDay = 1 and SecuMarket = 83 and TradingDate = convert(varchar(10),getdate(),120);"
    cnxn =   pyodbc.connect('DRIVER={SQL Server};SERVER=192.168.1.252,1433;DATABASE=jydb_all;UID=dpadmin;PWD=dpadmin');
    cursor = cnxn.cursor()
    cursor.execute(iftradeday)
    row = cursor.fetchone()  
    if row: 
        r = robjects.r
        r.source('GetSuspenedMV.R')

        mailto_list=["charles.wang@daopucapital.com",
                        "ray.cheng@daopucapital.com",
                        "xiao.chen@daopucapital.com",
                        "raymond.qu@daopucapital.com",
                        "yongqin.lin@daopucapital.com",
                        "jun.xu@daopucapital.com",
						"linton@daopucapital.com"] 
		
        f = open('mail.html', 'r')
        content = f.read()
        if send_mail(mailto_list, "DPMonitor", "Í£ÅÆ¹É¼à¿Ø",   content):  
            print("susscee")  
        else:  
            print("fail") 
              
        
        csvfile = file('suspended_' + time.strftime('%Y%m%d',time.localtime(time.time())) + '.csv', 'rb')
        reader = csv.reader(csvfile)
        suspended1 = """insert into dpSuspended(Date,PortID,SecurityID,HoldingAmount,CostMarketValue,PctMVofCost,CurrentMarketValue,PctMVofCurrent,PnL)  
                      values('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}','{8}')"""
        suspended2 = "('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}','{8}')"
                        
        sql = [];
        for line in reader:
            if not cmp(line[0], "") == 0 :
                if cmp(line[0], "1") == 0:
                    sql.append(suspended1.format(line[2], line[4], line[1], line[3], line[5], line[6], line[7], line[8], line[9]))
                elif not cmp(line[0], "1") == 0:    
                    sql.append(suspended2.format(line[2], line[4], line[1], line[3], line[5], line[6], line[7], line[8], line[9]))
                  
                
        csvfile.close() 
             
        cnxn =   pyodbc.connect('DRIVER={SQL Server};SERVER=192.168.1.252,1433;DATABASE=jydb_all;UID=dpadmin;PWD=dpadmin');
        cursor = cnxn.cursor()
        sqls = ",".join(sql)
           
        if len(sql) > 0:
            cursor.execute("delete from dpSuspended where Date = '{0}'".format(line[2]))
            cursor.execute(sqls)
               
        cnxn.commit() 
        cnxn.close() 
    

      