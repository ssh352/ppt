using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Mail;
using System.Text;

namespace WindowsFormsApplication1
{
    class Mail
    {
        public static void SendMail(string sContent, String Sub = "")
        {
    
                MailMessage myMail = new MailMessage();
                myMail.From = new MailAddress("xj4920@163.com");
                if (Sub.Equals(""))
                {
                    myMail.Subject = "MONITOR";
                }
                else {
                    myMail.Subject = Sub;
                }
                //myMail.SubjectEncoding = Encoding.UTF8;
                //myMail.Body = sContent;
                //myMail.BodyEncoding = Encoding.UTF8;
                //myMail.IsBodyHtml = false;
                //myMail.Priority = MailPriority.High;

                //myMail.To.Add(new MailAddress(ConstantVar.MONITOREMAIL));

                //SmtpClient smtpClient = new SmtpClient();
                //smtpClient.Host = "smtp.163.com";
                //smtpClient.Port = 25;
                //smtpClient.Credentials = new NetworkCredential("xj4920@163.com", "zhu924621yanfei");
                //smtpClient.DeliveryMethod = SmtpDeliveryMethod.Network;
                //smtpClient.Send(myMail);
            
        }
    }
}
