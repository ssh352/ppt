package com.explosion.mail;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeUtility;
import javax.mail.search.FlagTerm;
import javax.mail.search.FromStringTerm;
import javax.mail.search.OrTerm;
import javax.mail.search.SearchTerm;
import javax.mail.search.SubjectTerm;



public class MailAttachDownloader {
	private String mailHost 		= "";
	private String mailStoreType 	= "";
	private String mailUser 		= "";
	private String mailPassword 	= "";
	private String sFolderName		= "INBOX";
	private String sfromfilter 		= "";
	private String sSubjectfilter 	= "";
	private String sDownloadpath 	= "";
	
	private Folder emailFolder 		= null; 
	private Store store 			= null;
	private Properties 				properties;
	private Session 				emailSession;
	
	public MailAttachDownloader(){
		Connect();
	}
	
	public MailAttachDownloader(String smailHost, String smailStoreType,  String smailUser, String smailPassword){
		mailHost 			= smailHost;
		mailStoreType 		= smailStoreType;
		mailUser 			= smailUser;
		mailPassword 		= smailPassword;
		
		Connect();
	}
	
	private void Connect(){
		properties 			= new Properties();
		emailSession		= Session.getDefaultInstance(properties);
		try {
			store 			= emailSession.getStore(mailStoreType);
			store.connect(mailHost, mailUser, mailPassword);
			Folder[] fs  = store.getDefaultFolder().list("*");
			for(int i=0; i<fs.length; i++){
				System.out.println(String.format("%s folder: %s", mailUser, fs[i].getFullName()));
			}
			emailFolder 	= store.getFolder(sFolderName);
			emailFolder.open(Folder.READ_WRITE);
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setFolder(String sFolder){
		try {
			System.out.println(String.format("Search %s", sFolder));
			this.emailFolder.close(false);
			this.sFolderName 	= sFolder;
			emailFolder 		= store.getFolder(sFolderName);
			emailFolder.open(Folder.READ_WRITE);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void close(){
		try {
			emailFolder.close(false);
			store.close();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Message[] getUnSeenMail(){
		//false代表未读，true代表已读
		FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false); 
	    try {
			return emailFolder.search(ft);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    return null;
	}
	
	public Message[] getFromer(String user){
		//false代表未读，true代表已读
		FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false); 
	    try {
			return emailFolder.search(ft);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    return null;
	}
	
	public void DownloadAttach(Message messages[]){
		for (int i = 0; i < messages.length; i++) {
			Message message = messages[i];
			try {
//				System.out.println(message.getSubject());
//				System.out.println(MimeUtility.decodeText(message.getSubject()));
				
				if( message.getFrom()[0].toString().contains(sfromfilter) && MimeUtility.decodeText(message.getSubject()).contains(sSubjectfilter))
				{
					System.out.println("==============================");
					System.out.println("Email #" 		+ (i + 1));
					System.out.println("Subject: " 		+ message.getSubject());
					System.out.println("From: " 		+ message.getFrom()[0]);
					String contentType = message.getContentType();
					if (contentType.contains("multipart")) 
					{
				    // this message may contain attachment
						Multipart multiPart = (Multipart) message.getContent();
						for (int j = 0; j < multiPart.getCount(); j++) 
						{
							MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(j);
							if(!Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition())) {
						            continue; // dealing with attachments only
						    }
					        // this part is attachment
					        // code to save attachment...
					    	// save an attachment from a MimeBodyPart to a file
							
							String filename 			= part.getFileName();
							filename 					= filename.trim();
							filename = filename.replaceAll("\"", "");
														  
		                    if (filename.toLowerCase().indexOf("gbk") != -1 || 
		                    	filename.toLowerCase().indexOf("gb2312") != -1){     
		                    	filename = MimeUtility.decodeText(filename);     
		                    }else if(filename.toLowerCase().indexOf("utf-8") != -1){
		                    	filename = MimeUtility.decodeText(filename);
		                    }else{
		                    	filename = String.format("%s.xls", message.getSubject());
		                    }
							
					    	String destFilePath 		= sDownloadpath + filename;
					    	FileOutputStream output 	= new FileOutputStream(destFilePath);
					    	InputStream input 			= part.getInputStream();
					    	byte[] buffer 				= new byte[4096];
					    	int byteRead;
					    	while ((byteRead = input.read(buffer)) != -1) 
					    	{
					    	    output.write(buffer, 0, byteRead);
					    	}
					    	output.close();
					    	message.setFlags(new Flags(Flags.Flag.SEEN), true);
						}
					}
				}
			} catch (MessagingException | IOException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

	
	public void DeleteMsgs(Message messages[]){
		for (int i = 0; i < messages.length; i++) {
			Message message = messages[i];
			try {
			    	message.setFlags(new Flags(Flags.Flag.DELETED), true);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
	public void setsSubjectfilter(String sSubjectfilter) {
		this.sSubjectfilter = sSubjectfilter;
	}
	
	public void setSfromfilter(String sfromfilter) {
		this.sfromfilter = sfromfilter;
	}
	public void setSDownloadpath(String sDownloadpath) {
		this.sDownloadpath = sDownloadpath;
	}
	
	public void setAttr(attr f){
		setsSubjectfilter(f.getsSubjectfilter());
		setSfromfilter(f.getSfromfilter());
		setSDownloadpath(f.getsDownloadpath());
	}
	
//	TODO
	public Message[] Search(String from, String Subject){
//		还有复杂的逻辑搜索类似：
		SearchTerm orTerm = new OrTerm(new FromStringTerm(from), 
									   new SubjectTerm(Subject));
		
		try {
			return emailFolder.search(new FromStringTerm(from));
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}