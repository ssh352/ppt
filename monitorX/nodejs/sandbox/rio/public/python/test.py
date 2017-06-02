# -*- coding:utf-8 -*-
from WindPy import w
import json
import datetime
import sys, numpy as np

def getReturn(time, index1, index2):
    ret = {}
    data = {}
    data['date'] = []
    data['ratio'] = []
    for i in range(len(index1)):
    	data['date'].append(str(time[i])[0:10])
    	data['ratio'].append(str(index1[i] / index2[i]))
    ret['data'] = data
    ret['reqid'] = ''
    test = json.dumps(ret)
    print(test)
    return test

#calRatio('000905.SH', '000016.SH', "2016-01-01", "2016-06-21")
def calRatio(index1, index2, startDate, endDate):
    w.start()
    #wsddata1 = w.wsd("000905.SH,000016.SH", "close", "2016-01-01", "2016-06-21", "")
    wsddata1 = w.wsd(index1+','+index2, 'close', startDate, endDate, '')
    ret = getReturn(wsddata1.Times, wsddata1.Data[0], wsddata1.Data[1])
    print(ret)
    return ret
    
if __name__ == "__main__":
    today = datetime.date.today()
    calRatio('000905.SH', '000016.SH', "2016-01-01", today)
