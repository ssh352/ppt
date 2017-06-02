package com.explosion.mail;

import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailUtil {
	private String m_host   = "smtp.qq.com"; 				// smtp服务器  
    private String m_user   = "Simon@ppt"; 					// 用户名  
    private String m_pwd    = "Simon"; 						// 密码  
    private String m_from   = "Simon"; 						// 发件人地址  

    private Properties  props;
    private Session 	session;
    private Transport   transport;
    
    public MailUtil(){
    	 props = new Properties();  
	     props.put("mail.smtp.host", 	m_host);  
	     props.put("mail.smtp.auth", 	true);  
	     session = Session.getInstance(props, null);
	     
	     ConnectTransport();
    }
    
    private int ConnectTransport(){
	     try {
			 transport = session.getTransport("smtp");
		     transport.connect(m_host, m_user, m_pwd);  
	     } catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    	return 0 ;
    }
  
	public void send(String txt, String subject, ArrayList<String> toList) {  
	     try{  
	    	 MimeMessage message = new MimeMessage(session);  
	    	 message.setFrom(new InternetAddress(m_from));  
	    	 for(String to : toList)
	    	 {
	    		 message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	    	 }
		     message.setSubject(subject);  
		     Multipart multipart = new MimeMultipart();  
		     BodyPart contentPart = new MimeBodyPart();  
		     contentPart.setText(txt);  
		     multipart.addBodyPart(contentPart);  
		     message.setContent(multipart);  
		     message.saveChanges();  

		     if(transport.isConnected())
		     {
		    	 transport.sendMessage(message, message.getAllRecipients());
		     }
		     else{
		    	 ConnectTransport();
		    	 transport.sendMessage(message, message.getAllRecipients());
		     }
	     } catch (Exception e) {  
	    	 e.printStackTrace();  
	     }  
	}
	
	
	public void sendHtml(String txt, String subject, ArrayList<String> toList) {  
	     try{  
	    	 MimeMessage message = new MimeMessage(session);  
	    	 message.setFrom(new InternetAddress(m_from));  
	    	 for(String to : toList)
	    	 {
	    		 message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	    	 }
		     message.setSubject(subject);  
		     
		     Multipart multipart = new MimeMultipart();  
		     BodyPart contentPart = new MimeBodyPart();  
		     contentPart.setContent(txt, "text/html;charset = gbk");
		     System.out.println(txt);
		     
		     multipart.addBodyPart(contentPart);  
		     message.setContent(multipart);
		     message.saveChanges();  

		     if(transport.isConnected())
		     {
		    	 transport.sendMessage(message, message.getAllRecipients());
		     }
		     else{
		    	 ConnectTransport();
		    	 transport.sendMessage(message, message.getAllRecipients());
		     }
	     } catch (Exception e) {  
	    	 e.printStackTrace();  
	     }  
	}
//	public static void main(String[] args) {
//		MailUtil mail = new MailUtil();
//		ArrayList<String> toList = new ArrayList<String>();
//		toList.add("909290665@qq.com");
//		toList.add("jun.xu@daopucapital.com");
//		mail.send("hello", "DP", toList);
//	}
}
