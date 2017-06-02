# -*- coding: utf-8 -*-
import smtplib  
from email.mime.text import MIMEText  



def send_mail(to_list, name, sub, content):  #to_list：收件人；sub：主题；content：邮件内容
    mail_host="smtp.163.com"  #设置服务器
    mail_user="xj4920@163.com"    #用户名
    mail_pass="zhu924621yanfei"   #口令 
    mail_postfix="163.com"  #发件箱的后缀
  
    me = name +"<"+mail_user+">"   #这里的hello可以任意设置，收到信后，将按照设置显示
    msg = MIMEText(content,_subtype='html',_charset='gbk')    #创建一个实例，这里设置为html格式邮件
    msg['Subject'] = sub    #设置主题
    msg['From'] = me  
    msg['To'] = ";".join(to_list)  
    try:  
        s = smtplib.SMTP()  
        s.connect(mail_host)  #连接smtp服务器
        s.login(mail_user,mail_pass)  #登陆服务器
        s.sendmail(me, to_list, msg.as_string())  #发送邮件
        s.close()  
        return True  
    except Exception as e:  
        print(e)  
        return False  
    
    
    
