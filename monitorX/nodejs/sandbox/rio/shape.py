# -*- coding:utf-8 -*-
from WindPy import w
import json
import datetime
import sys, numpy as np
import pandas as pd

def annual_ret(close, multi):
    p_ret = close[len(close)-1]/close[0]-1
    return ((1+p_ret) ** multi-1)*100

def volatility(ret):
    std = ret.std()
    annual = std * (250**(1/2))
    return annual

def sharpe(close, ret, multi):
    annualized_ret = annual_ret(close, multi)
    annualized_vol = volatility(ret)
    return annualized_ret/annualized_vol

def getReturn(time, index1):
    data['date'] = []
    data['ah_index_3m'] = []
    for i in range(len(index1)):
    	data['date'].append(str(time[i])[0:10].replace('-',''))
    	data['ah_index_3m'].append(str(index1[i]))
    ret['data'] = data
    ret['reqid'] = ''
    test = json.dumps(ret)
    print(test)
    return test

#calRatio('000905.SH', '000016.SH', "2016-01-01", "2016-06-21")
def calRatio(index1, index2, startDate, endDate):
    data={}
    ret = {}
    for index in ['000300.SH', '000905.SH', '000016.SH']:
        for period in ['3M', '6M']:
            multi = int(12 / int(period[0]))
            wind_data = w.wsd(index, "close,pct_chg", "ED-"+period, today, "Fill=Previous")
            my_pd = pd.DataFrame(wind_data.Data, index=wind_data.Fields, columns=wind_data.Times).T
            my_pd.index = my_pd.index.date
            close = my_pd['CLOSE']
            pct = my_pd['PCT_CHG']
            data[index+'_'+period] = sharpe(close, pct, multi)
    ret['data'] = data
    ret['reqid'] = ''
    test = json.dumps(ret)
    print(test)
    return test

    
if __name__ == "__main__":
    w.start(showmenu=False)
    today = datetime.date.today()
    calRatio('830009.XI', '000016.SH', "2006-01-01", today)
