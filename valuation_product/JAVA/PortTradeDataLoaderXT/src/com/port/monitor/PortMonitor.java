package com.port.monitor;

import java.io.File;

import org.apache.log4j.PropertyConfigurator;
import com.port.details.CM1A01Port;
import com.port.details.CM1B01Port;
import com.port.details.CM1H01Port;
import com.port.details.CS1D01Port;
import com.port.details.CS1E02Port;
import com.port.details.CS2B02Port;
//import com.port.details.CS9Z01Port;

public class PortMonitor {

	/**
	 * @param args
	 */
	static {  
		System.out.println(System.getProperty("user.dir") + File.separator + "conf" + File.separator + "log4j.properties");
        PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "conf" + File.separator + "log4j.properties");  
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//******** CM ********//
		CM1B01Port CM1B01 = new CM1B01Port();
		Thread TCM1B01 = new Thread(CM1B01);
		TCM1B01.start();
		TCM1B01.setName("CM1B01");

		CM1A01Port CM1A01 = new CM1A01Port();
		Thread TCM1A01 = new Thread(CM1A01);
		TCM1A01.start();
		TCM1A01.setName("CM1A01");
		
		CM1H01Port CM1H01 = new CM1H01Port();
		Thread TCM1H01 = new Thread(CM1H01);
		TCM1H01.start();
		TCM1H01.setName("CM1H01");
		
		
		//******** CS ********//
		CS2B02Port CS2B02 = new CS2B02Port();
		Thread TCS2B02 = new Thread(CS2B02);
		TCS2B02.start();
		TCS2B02.setName("CS2B02");

		CS1D01Port CS1D01 = new CS1D01Port();
		Thread TCS1D01 = new Thread(CS1D01);
		TCS1D01.start();
		TCS1D01.setName("CS1D01");
		
		CS1E02Port CS1E02 	= new CS1E02Port();
		Thread TCS1E02 		= new Thread(CS1E02);
		TCS1E02.start();
		TCS1E02.setName("CS1E02");

	}

}
