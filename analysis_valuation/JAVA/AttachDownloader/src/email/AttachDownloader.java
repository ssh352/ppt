package email;

import java.io.File;
import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Message;

import com.explosion.base.helper;
import com.explosion.mail.MailAttachDownloader;
import com.explosion.mail.attr;

public class AttachDownloader {

	public static void main(String[] args) {
		Properties 	m_configProps 		= new Properties();
		String 		m_sConfigFile		= String.format("%s%sconf%s%s.properties",System.getProperty("user.dir"), File.separator, File.separator , "email");
		m_configProps 					= helper.loadConfig(m_sConfigFile);
		System.out.println(String.format("load config file %s", m_sConfigFile));
		
		int iAccount 				= 2;
		int iFilter  				= 10;
		String sValuationFilePath 	= m_configProps.getProperty("ValuationFilePath");
		
		for(int i=1; i<iAccount+1; i++){
			if(m_configProps.containsKey(String.format("Host%s", 		i))){
				String sHost  =  m_configProps.getProperty(String.format("Host%s", 		i));
				String sType  =  m_configProps.getProperty(String.format("StoreType%s", i));
				String sUser  =  m_configProps.getProperty(String.format("User%s", 		i));
				String sPwd   =  m_configProps.getProperty(String.format("Password%s", 	i));
				MailAttachDownloader mail = new MailAttachDownloader(sHost, sType, sUser, sPwd);
				ArrayList<attr> attrList = new ArrayList<attr>();
				for(int j=1; j<iFilter+1; j++){
					if(!m_configProps.containsKey(String.format("user%sfilter%s", i, j))){
						break;
					}
					String sFilter 	= m_configProps.getProperty(String.format("user%sfilter%s", i, j));
					String[] attrs 	= sFilter.split(";");
					attr at 		= new attr(attrs[1], attrs[2], String.format("%s/%s/", sValuationFilePath, attrs[3]));
					attrList.add(at);
					mail.setAttr(at);
					mail.setFolder(attrs[0]);
					Message[] msgs = mail.getUnSeenMail();
					mail.DownloadAttach(msgs);
				}
				mail.close();
			}
		}
	}
}
