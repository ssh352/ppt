package com.dp.trade.oms;

import java.io.File;

import org.apache.log4j.PropertyConfigurator;

public class OmsServer {
	
	static {  
        PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "conf" + File.separator  
                + "log4j.properties");  
    }
	
	public static void main(String[] args)
	{
		OMSModule OmsModule = new OMSModule();
		OmsModule.StartCtpListen();
		Thread OmsModuleThread = new Thread(OmsModule);
		OmsModuleThread.start();
		OmsModuleThread.setName("OmsServerThread");
	}
}
