# -*- coding:utf-8 -*-
from WindPy import w
from datetime import *
import json

import sys, numpy as np

def calAccum_turnover(days_list):
    
    ##turnover_indiv = np.array(wsddata1.Data)
    #list(map(lambda x: x.pop(), wsddata1.Data))
    #turnover_indiv = np.array(wsddata1.Data).transpose()
    #weight_indiv = np.array(wsWeight.Data[2])
    #days_max = max(days_list)
    #time = wsddata1.Times[days_max+1:len(wsddata1.Times)] ##时间列
    	
    #turnover = (turnover_indiv*weight_indiv).sum(axis=1)/100
    #accum_turnover = turnover.cumsum()

    ret = {}
    data = {}
    data['xAxis'] = []
    data['yAsis'] = []
    data['series'] = {}
    ret['data'] = data
    ret['reqid'] = ''
    today = date.today()
    wind_data = w.wsd("000300.SH", "free_turn", "2007-1-15", str(today), "Fill=Previous")
    turnover = np.array(wind_data.Data[0])
    accum_turnover = turnover.cumsum()
    time = wind_data.Times
    days_max = max(days_list)
    for i in range(len(time)):
    	data['xAxis'].append(str(time[i])[0:10])
    #print(data['date'])
    for days in days_list:
        #days = days_list[0]
        accum_turnover_temp = np.copy(accum_turnover)
        accum_turnover_temp[days:] = accum_turnover_temp[days:] - turnover.cumsum()[:-days]
        accum_turnover_temp = accum_turnover_temp[days_max:len(time)]/days*240

        accum_turnover_temp = np.around(accum_turnover_temp,decimals=2)
        data['series'][days] = accum_turnover_temp.tolist()
        #print(json.dumps(accum_turnover_temp.tolist()))
        #print(len(accum_turnover_temp))
    print(json.dumps(ret))
    


   
if __name__ == "__main__":
    startDate = date(2015,10,1)##开始日期
    days = [5,20,60] ##累计天数
    w.start()
    windcode300 = "000300.SH"
    windcodezz800 = "000906.SH"
    windcodezz500 = "000905.SH"
    #calAccum_turnover(wsddata1,days)
    calAccum_turnover(days)