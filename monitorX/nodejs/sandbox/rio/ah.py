# -*- coding:utf-8 -*-
from WindPy import w
import json
import datetime
import sys, numpy as np

def getReturn(time, index1):
    ret = {}
    data = {}
    data['date'] = []
    data['ah_index'] = []
    for i in range(len(index1)):
    	data['date'].append(str(time[i])[0:10].replace('-',''))
    	data['ah_index'].append(str(index1[i]))
    ret['data'] = data
    ret['reqid'] = ''
    test = json.dumps(ret)
    print(test)
    return test

#calRatio('000905.SH', '000016.SH', "2016-01-01", "2016-06-21")
def calRatio(index1, index2, startDate, endDate):
    w.start()
    #wsddata1 = w.wsd("000905.SH,000016.SH", "close", "2007-01-01", "2016-06-21", "")
    wsddata1 = wind_data = w.wsd("HSAHP.HI", "close", "2007-01-01", endDate, "")
    ret = getReturn(wsddata1.Times, wsddata1.Data[0])
    #print(ret)
    #return ret
    
if __name__ == "__main__":
    today = datetime.date.today()
    calRatio('830009.XI', '000016.SH', "2006-01-01", today)
