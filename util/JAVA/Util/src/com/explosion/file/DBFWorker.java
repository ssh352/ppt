package com.explosion.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.explosion.base.base;
import com.explosion.trade.cats.catstradefields;
import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.linuxense.javadbf.DBFWriter;


public class DBFWorker extends base{
	
	
	
	public DBFWorker(){
		m_log 		 = Logger.getLogger(DBFWorker.class);

	}
	
	public void readDBF(String path, List<Object[]> ArrList) {  
	        InputStream fis = null;  
	        try {  
	            fis 			 = new FileInputStream(path);    
	            DBFReader reader = new DBFReader(fis);  
	            Object[] rowValues;
	            
	            for(int i=0; i<reader.getFieldCount(); i++){
	            	
	            	DBFField field = reader.getField(i);
	            	m_log.info(String.format("name:%s\t\t, type:%s, Length:%s, Decimal: %s", field.getName(), 
	            							 field.getDataType(),field.getFieldLength(), field.getDecimalCount()));
	            	
	            }
	            
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
	
	public void createDBFFile(String path, DBFField[] fields){
		try {
			DBFWriter writer = new DBFWriter(new File(path));
			writer.setFields(fields);
		} catch (DBFException e) {
			// TODO Auto-generated catch block
			m_log.error(e.getMessage());
		}
	}
	
	public void createDBFFile(String path){
		// 定义DBF文件字段
		DBFField[] fields = new DBFField[3];
		// 分别定义各个字段信息
		fields[0] = new DBFField();
		fields[0].setName("semp_code");
		fields[0].setDataType(DBFField.FIELD_TYPE_C);
		fields[0].setFieldLength(10);
		
		fields[1] = new DBFField();
		fields[1].setName("emp_name");
		fields[1].setDataType(DBFField.FIELD_TYPE_C);
		fields[1].setFieldLength(20);
		
		fields[2] = new DBFField();
		fields[2].setName("salary");
		fields[2].setDataType(DBFField.FIELD_TYPE_N);
		fields[2].setFieldLength(12);
		fields[2].setDecimalCount(2);
		try {
			DBFWriter writer = new DBFWriter(new File(path));
			writer.setFields(fields);
			
		} catch (DBFException e) {
			// TODO Auto-generated catch block
			m_log.error(e.getMessage());
		}
	} 
	
	
	public void writeDBF(String FilePath, ArrayList<Object[]> Data){
		if(Data.size() == 0 || Data == null){
			return;
		}
		
		DBFWriter writer;
		try {
			writer = new DBFWriter(new File(FilePath));
			for(int i=0; i<Data.size(); i++){
				Object[] rowData = Data.get(i);
				writer.addRecord(rowData);
			}
		} catch (DBFException e) {
			// TODO Auto-generated catch block
			m_log.error(e.getMessage());
		}
	}
	
	public void writeDBF2(String FilePath, ArrayList<Object[]> Data, DBFField[] fields){
		if(Data.size() == 0 || Data == null){
			return;
		}
		OutputStream fos = null; 

		
		DBFWriter writer;
		try {
			writer = new DBFWriter();
			writer.setFields(fields);
			for(int i=0; i<Data.size(); i++){
				Object[] rowData = Data.get(i);
				writer.addRecord(rowData);
			}
			// 写入数据
			fos = new FileOutputStream(FilePath);
			writer.write(fos);
			fos.close();
		} catch (DBFException e) {
			// TODO Auto-generated catch block
			m_log.error(e.getMessage());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			m_log.error(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void writeDBFAppend(String FilePath, ArrayList<Object[]> Data, DBFField[] fields){
		if(Data.size() == 0 || Data == null){
			return;
		}
		OutputStream fos = null; 

		
		DBFWriter writer;
		try {
			writer = new DBFWriter(new File(FilePath));
			for(int i=0; i<Data.size(); i++){
				Object[] rowData = Data.get(i);
				writer.addRecord(rowData);
			}
			// 写入数据
			fos = new FileOutputStream(FilePath, true);
			writer.write(fos);
			fos.close();
		} catch (DBFException e) {
			// TODO Auto-generated catch block
			m_log.error(e.getMessage());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			m_log.error(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeDBF(String path) {
		OutputStream fos = null;
		try {
	    	DBFField[] fields = new DBFField[3];
			// 分别定义各个字段信息
	    	fields[0] = new DBFField();
	    	fields[0].setName("semp_code");
			fields[0].setDataType(DBFField.FIELD_TYPE_C);
			fields[0].setFieldLength(10);
			
			fields[1] = new DBFField();
			fields[1].setName("emp_name");
			fields[1].setDataType(DBFField.FIELD_TYPE_C);
			fields[1].setFieldLength(20);
			
			fields[2] = new DBFField();
			fields[2].setName("salary");
			fields[2].setDataType(DBFField.FIELD_TYPE_N);
			fields[2].setFieldLength(12);
			fields[2].setDecimalCount(2);
			
	
			DBFWriter writer 	= new DBFWriter();
			writer.setFields(fields);
			// 把字段信息写入DBFWriter实例，即定义表结构
			// 一条条的写入记录
			Object[] rowData = new Object[3];
			rowData[0] = "1000";
			rowData[1] = "John";
			rowData[2] = new Double(5000.00);
			writer.addRecord(rowData);
			rowData = new Object[3];
			rowData[0] = "1001";
			rowData[1] = "Lalit";
			rowData[2] = new Double(3400.00);
			writer.addRecord(rowData);
			rowData = new Object[3];
			rowData[0] = "1002";
			rowData[1] = "Rohit";
			rowData[2] = new Double(7350.00);
			writer.addRecord(rowData);
			// 定义输出流，并关联的一个文件
			fos = new FileOutputStream(path);
			// 写入数据
			writer.write(fos);
		} catch (Exception e) {
		    m_log.error(e.getMessage()); 
		}finally {
		   try {
				fos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
					m_log.error(e1.getMessage());
				}
		}
	}
	
	
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub

	
		DBFWorker dbf = new DBFWorker();
//		dbf.createDBFFile("D:/Program Files (x86)/Wealth CATS_TestOut/scan_order/test.dbf");
//		dbf.writeDBF("D:/Program Files (x86)/Wealth CATS_TestOut/scan_order/test.dbf");
		
		Object[] rowData = new Object[3];
		rowData[0] = "1000";
		rowData[1] = "John";
		rowData[2] = new Double(5000.00);
		ArrayList<Object[]> e = new ArrayList<Object[]>();
		e.add(rowData);
		dbf.writeDBF("D:/Program Files (x86)/Wealth CATS_TestOut/scan_order/test.dbf", e);
		
		
//		Likst<Object[]> ArrList = new ArrayList<Object[]>();
//		dbf.readDBF("D:/Program Files (x86)/Wealth CATS_TestOut/scan_order/instructions.dbf", ArrList);
	}

}
