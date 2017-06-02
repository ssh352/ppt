package com.explosion.file;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;



 
public class ReadExcel {	 

	private List<String> GetData(String Filename, int ignoreBeginRows, int ignoreEndRows){
		List<String> RetList = new ArrayList<String>();
    	File file = new File(Filename);
        try {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
	        POIFSFileSystem fs = new POIFSFileSystem(in);
	        HSSFWorkbook wb = new HSSFWorkbook(fs);
	        // 打开HSSFWorkbook
	        HSSFCell cell = null;

	        for (int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) {
	        	HSSFSheet st = wb.getSheetAt(sheetIndex);
	        	// 第一行为标题，不取
	        	for (int rowIndex = ignoreBeginRows; rowIndex <= st.getLastRowNum()-ignoreEndRows; rowIndex++)
	        	{
	        		HSSFRow row = st.getRow(rowIndex);
	        		if (row == null) {
	        			continue;
	        		}

	    			ArrayList<String> values = new ArrayList<String>();

	    			boolean hasValue = false;
	    			for (int columnIndex = 0; columnIndex <= row.getLastCellNum(); columnIndex++) 
	    			{
	    				String value = "";
	    				cell = row.getCell(columnIndex);
	    				if (cell != null) 
	    				{
	    					
							//注意：一定要设成这个，否则可能会出现乱码
							//cell.setEncoding(HSSFCell.ENCODING_UTF_16);
							switch (cell.getCellType()) {
								case HSSFCell.CELL_TYPE_STRING:
									value = cell.getStringCellValue();
									break;
								
								case HSSFCell.CELL_TYPE_NUMERIC:
									if (HSSFDateUtil.isCellDateFormatted(cell)) {
										Date date = cell.getDateCellValue();
										if (date != null) {
											value = new SimpleDateFormat("yyyy-MM-dd").format(date);
										} 
										else {
											value = "";
										}
									} 
									else {
//										value = Double.toString(cell.getNumericCellValue());
										value = new DecimalFormat("0.00#").format(cell.getNumericCellValue());
									}
									break;
								
								case HSSFCell.CELL_TYPE_FORMULA:
									// 导入时如果为公式生成的数据则无值
									if (!cell.getStringCellValue().equals("")) {
										value = cell.getStringCellValue();
									} 
									else {
										value = cell.getNumericCellValue() + "";
									}
									break;
								
								case HSSFCell.CELL_TYPE_BLANK:
									break;
								
								case HSSFCell.CELL_TYPE_ERROR:
									value = "";
									break;
								
								case HSSFCell.CELL_TYPE_BOOLEAN:
									value = (cell.getBooleanCellValue() == true ? "Y": "N");
									break;

								default:
									value = "";
	                     }
	                  }
	                  if (columnIndex == 0 && value.trim().equals("")) {
	                     break;
	                  }
	                  values.add(value.trim());
	                  hasValue = true;
	              }
	 
	              if (hasValue) {
	            	  RetList.add( StringUtils.join(values, ","));
	              }
	           }
	       }
	        in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return RetList;
	}
}
