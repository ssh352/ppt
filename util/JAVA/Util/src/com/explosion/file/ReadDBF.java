package com.explosion.file;

import java.io.FileInputStream;  
import java.io.InputStream;  
import java.util.List;
import com.linuxense.javadbf.DBFReader;  


public class ReadDBF {
	
	private void readDBF(String path, List<Object[]> ArrList) {  
	        InputStream fis = null;  
	        try {  
	            fis = new FileInputStream(path);    
	            DBFReader reader = new DBFReader(fis);  
	            Object[] rowValues;  
	            while ((rowValues = reader.nextRecord()) != null) {  
	            	ArrList.add(rowValues);
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        } finally {  
	            try {  
	                fis.close();  
	            } catch (Exception e) {  
	            }  
	        }  
	    }  
}
