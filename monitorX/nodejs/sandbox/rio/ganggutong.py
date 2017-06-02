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
    data['HK'] = []
    for i in range(len(index1)):
    	data['date'].append(str(time[i])[0:10].replace('-',''))
    	data['HK'].append(str(index1[i]))
    ret['data'] = data
    ret['reqid'] = ''
    test = json.dumps(ret)
    print(test)
    return test

#calRatio('000905.SH', '000016.SH', "2016-01-01", "2016-06-21")
def calRatio(index1, index2, startDate, endDate):
    w.start()
    #wsddata1 = w.wsd("000905.SH,000016.SH", "close", "2007-01-01", "2016-06-21", "")
    wind_data = w.wset("shhktransactionstatistics","startdate=2014-11-17;enddate="+endDate+";cycle=day;currency=cny")
    cash_flow = pd.DataFrame(wind_data.Data, index=wind_data.Fields).T
    cash_flow = cash_flow.set_index('date').dropna()
    cash_flow.sort_index()
    sh_net_in = cash_flow['hk_buy_amount'] - cash_flow['hk_sell_amount']
    ret = getReturn(sh_net_in.index.values, sh_net_in.values)
    #print(ret)
    #return ret
    
if __name__ == "__main__":
    today = datetime.date.today().strftime("%Y%m%d")
    calRatio('830009.XI', '000016.SH', "2014-11-17", today)
