package com.dp.hq;

import java.io.File;

import org.apache.log4j.PropertyConfigurator;

public class HqServer {
	static {  
        PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "conf" + File.separator  
                + "log4j.properties");  
    }  
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HqModule HqServer = new HqModule();
		HqServer.ConnectHHsoft();
		Thread t1 = new Thread(HqServer);
		t1.start();
		t1.setName("HqModuleThread");
		
		System.out.println("press anything to quit the program.");
		try {
			System.in.read();	
			HqServer.setQuitFlag(true);
			t1.join();
			System.out.println("Thread1 Quit!");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		System.out.println("Quit the program!");
		System.exit(0);
	}
}
