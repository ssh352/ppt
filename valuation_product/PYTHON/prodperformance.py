

import rpy2.robjects as robjects
import time
import json
from  util.helper import *
from json2html import *


if __name__ == '__main__':
    r = robjects.r
    r["setwd"]("E:/DP/DpRepo/R")
    r.source("productperformance.R")
    
    a = r["calcnav"]()
    
    decodejson  = json.loads(a[0])
    d           = decodejson["data"]
#     keys1 	    = ["item","CM1A01","CM1B01","CM1H01","CS1D01","CS1E02","CS2B02","CS9Z01"]
    keys1         = ["item","CM1H01","CS1D01","CS1E02","CS2B02","CS9Z01"]
    html        = ('Product performance : <br> %s' % changeRJsonStrToHtmlstrByHand(keys1, d))
    print(html)
    divtables   = ['<h1 style="color:red; text-align:center; font-size:20px; font-weight:bold;">\u4ea7\u54c1\u51c0\u503c\u53ca\u6301\u4ed3</h1>', html]
    
    a = r["getFundPos"]()
    decodejson  = json.loads(a[0])
    d           = decodejson["data"]
    keys1       = ["Date","PortSName","SecurityID","securityName","Enableamount","ClosePx","MKV"]
    html        = ('Fund position details : <br> %s' % changeRJsonStrToHtmlstrByHand(keys1, d))
    print(html)
    divtables.append(html)
    
    
    a = r["getFuturePos"]()
    decodejson  = json.loads(a[0])
    d           = decodejson["data"]
    keys1       = ['date', 'portsname', 'instrid', 'name', 'clearprice', 'btotalamt', 'stotalamt', 'amount', 'mkv']
    html        = ('Future position details : <br> %s' % changeRJsonStrToHtmlstrByHand(keys1, d))
    print(html)
    divtables.append(html)
    
    
    send_mail(["Simon@ppt.com"],  "Product Performance " + time.strftime('%Y%m%d',time.localtime(time.time())) + "[\u6b64\u90ae\u4ef6\u4e3a\u51c6]", "<br><br>".join(divtables))
    

    
    
    
    
    