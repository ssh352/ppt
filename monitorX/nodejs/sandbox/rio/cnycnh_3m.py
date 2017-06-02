# -*- coding:utf-8 -*-
from WindPy import w
import json
import datetime
import sys, numpy as np
import pandas as pd

def getReturn(time, index1):
    ret = {}
    data = {}
    data['date'] = []
    data['CNY/CNH(%)'] = []
    for i in range(len(index1)):
    	data['date'].append(str(time[i])[0:10].replace('-',''))
    	data['CNY/CNH(%)'].append(str(index1[i]))
    ret['data'] = data
    ret['reqid'] = ''
    test = json.dumps(ret)
    print(test)
    return test

#calRatio('000905.SH', '000016.SH', "2016-01-01", "2016-06-21")
def calRatio(index1, index2, startDate, endDate):
    w.start()
    #wsddata1 = w.wsd("000905.SH,000016.SH", "close", "2007-01-01", "2016-06-21", "")
    wind_data = w.wsd("USDCNH.FX,USDCNY.IB", "close", "ED-3M", endDate, "")
    rmb_usd = pd.DataFrame(wind_data.Data, index=wind_data.Codes, columns=wind_data.Times).T.dropna()
    ratio = rmb_usd['USDCNY.IB']/rmb_usd['USDCNH.FX']*100
    ret = getReturn(ratio.index.values, ratio.values)
    #print(ret)
    #return ret
    
if __name__ == "__main__":
    today = datetime.date.today().strftime("%Y%m%d")
    calRatio('830009.XI', '000016.SH', "2014-11-17", today)
