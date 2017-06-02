package com.explosion.base;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

public class helper {
	// format: 2014-5-9 23:00:40
	public static String Now(){
		DateFormat d1 = DateFormat.getDateTimeInstance();
		Date now = new Date(); 
		return d1.format(now);
	}
	
	// format: 20150817
	public static String Today(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date now = new Date(); 
		return sdf.format(now);
	}
	
	//format: 2015-11-06 14:17:31:193
	public static String GetTimeStamp()
	{
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS") .format(new Date());
	}
	
	//format: 14:17
	public static String GetTimeMin()
	{
		return new SimpleDateFormat("HH:mm") .format(new Date());
	}

	//format: "14" 
	public static String GetHour()
	{
		return new SimpleDateFormat("HH") .format(new Date());
	}
	
	//format: 14
	public static int GetHourOfDay()
	{
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.HOUR_OF_DAY);
	}
	
	
	// if obj has subdictionary return true
	public static boolean HasSubDictionary(Object obj){
		boolean bRet = false;
		
		// generate file object
		File file = null;  
        if (obj instanceof File) {  
        	file = (File) obj;  
        } else {  
        	file = new File(obj.toString());  
        } 
		
        if(file.isDirectory()){
        	// get all files under file
        	File[] files = file.listFiles();
            if(files==null){
            	bRet = true;	//there is no files in "file"
            } 
            for (File f : files) {
               if(f.isDirectory()){	// there is sub directory under f
            	   bRet = false;
            	   return bRet;
               }
               else
               {
            	   bRet = true;
               }  
            }
        }
		
		return bRet;
	}
	
	

    public static List<String> GetAllDictionary(Object obj, List<String> resultFileName){
		
    	File file = null;  
        if (obj instanceof File) 
        {  
        	file = (File) obj;  
        } 
        else 
        {  
        	file = new File(obj.toString());  
        } 
    	
        File[] files = file.listFiles();
        file.getPath();
        if(files==null)
        {
        	resultFileName.add(obj.toString());
        	return resultFileName;// �ж�Ŀ¼���ǲ��ǿյ�
        }
        	
        // traverse file list, add to resultFileName which has no subdirectory
        for (File f : files) 
        {
            if(f.isDirectory())
            {// �ж��Ƿ��ļ���
        		resultFileName.add(f.getPath());
        		GetAllDictionary(f,resultFileName);// ��������,������Ŀ¼
            }
        }
        
        return resultFileName;
    }
 
    public static String resultSetToHtml(ResultSet rs) throws SQLException
    {
    	   // ��ȡ����  
        ResultSetMetaData metaData = rs.getMetaData();  
        List<String> listhtml =new ArrayList<String>();
        listhtml.add("<table border=\"1\">");
        int columnCount = metaData.getColumnCount();
        listhtml.add("<tr>");
        for(int i=1; i<=columnCount; i++)
        {
     	   String sHtml = "<th>" + metaData.getColumnLabel(i) + "</th>";
     	   listhtml.add(sHtml);
        }
        listhtml.add("</tr>");
        
        // ����ResultSet�е�ÿ������  
        while (rs.next()) {  
            // ����ÿһ��
            listhtml.add("<tr>");
            for (int i = 1; i <= columnCount; i++) {  
                String columnName =metaData.getColumnLabel(i);  
                String value = rs.getString(columnName);  
                  
                String sHtml = "<td>" + value + "</td>";
                listhtml.add(sHtml);
            }   
            listhtml.add("</tr>");
        }  
        listhtml.add("</table>");

    	return StringUtils.join(listhtml, "\n");
    }

    public static JSONArray resultSetToJsonArry(ResultSet rs) throws SQLException,JSONException  
    {  
       // json����  
       JSONArray array = new JSONArray();  
       // ��ȡ����  
       ResultSetMetaData metaData = rs.getMetaData();  
       
       int columnCount = metaData.getColumnCount();
       // ����ResultSet�е�ÿ������  
        while (rs.next()) {  
            JSONObject jsonObj = new JSONObject();  
            // ����ÿһ��
            for (int i = 1; i <= columnCount; i++) {  
                String columnName =metaData.getColumnLabel(i);  
                String value = rs.getString(columnName);  
                jsonObj.put(columnName, value);  
            }   
            array.add(jsonObj);   
        }  
       return array;  
    } 
    
    public static String DelBlank(String sContent)
    {
    	return sContent.replace(" ", "");
    }

    public static Properties loadConfig(String sConfigFile){
    	Properties configProps = new Properties();
    	File ConfigFile = new File(sConfigFile);
        URL url;
		try {
			url = ConfigFile.toURI().toURL();
			configProps.load(url.openStream());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return configProps;
    }
    
    public static String GenerateGuid()
    {
    	UUID uuid = UUID.randomUUID();
    	return uuid.toString();
    }
    
    /**  
     * ����ת����  
     * @param obj  
     * @return  
     */  
    public static byte[] toByteArray (Object obj) {      
        byte[] bytes = null;      
        try {
        		ByteArrayOutputStream bos = new ByteArrayOutputStream();
        		ObjectOutput out = new ObjectOutputStream(bos);
                out.writeObject(obj);
               	bytes = bos.toByteArray();
           } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
        return bytes;
    }   
       
    /**  
     * ����ת����  
     * @param bytes  
     * @return  
     */  
    public static Object toObject (byte[] bytes) {      
        Object obj = null;      
        try {        
            ByteArrayInputStream bis = new ByteArrayInputStream (bytes);        
            ObjectInputStream ois = new ObjectInputStream (bis);        
            obj = ois.readObject();      
            ois.close();   
            bis.close();   
        } catch (IOException ex) {        
            ex.printStackTrace();   
        } catch (ClassNotFoundException ex) {        
            ex.printStackTrace();   
        }      
        return obj;    
    }   
    
    public static String Unixtime()
    {
    	return String.format("%s", System.currentTimeMillis()); 
    }
    
    public static int Seconds(){
    	Calendar calendar = Calendar.getInstance();
		int hours = calendar.get(Calendar.HOUR_OF_DAY); // ʱ
		int minutes = calendar.get(Calendar.MINUTE);    // ��
		int seconds = calendar.get(Calendar.SECOND);    // ��
		return (hours * 3600 + minutes* 60 + seconds);
    }
    
    public static Boolean TimeCompare(String sTime1, String sTime2){
    	DateFormat df = new SimpleDateFormat("HH:mm");
    	try {
			java.util.Date Time1  = df.parse(sTime1);
			java.util.Date Time2  = df.parse(sTime2);
			long diff = Time1.getTime() - Time2.getTime();
			if(diff >= 0){
				return true;
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
    }

    
    public static String txt2String(File file){
        String result = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
            String s = null;
            while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
                result = result + "\n" +s;
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    
    /**
     * ���ļ���д������
     * @param filepath �ļ�·��������
     * @param newstr  д�������
     * @return
     * @throws IOException
     */
    public static boolean writeFileContent(String filepath,String newstr) throws IOException{
        Boolean bool = false;
        String filein = newstr+"\r\n";//��д����У�����
        String temp  = "";
        
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos  = null;
        PrintWriter pw = null;
        try {
            File file = new File(filepath);//�ļ�·��(�����ļ�����)
            //���ļ�����������
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();
            
            //�ļ�ԭ������
            for(int i=0;(temp =br.readLine())!=null;i++){
                buffer.append(temp);
                // ������֮��ķָ��� �൱�ڡ�\n��
                buffer = buffer.append(System.getProperty("line.separator"));
            }
            buffer.append(filein);
            
            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buffer.toString().toCharArray());
            pw.flush();
            bool = true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            //��Ҫ���ǹر�
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return bool;
    }
	
	/**   
     * @param str   
     *         ��Ҫ���˵��ַ���   
     * @return   
     * @Description:��������������ַ�   
     */    
    public static String filterNumber(String str) {     
        // ֻ������     
        String regEx = "[0-9]";     
        Pattern p = Pattern.compile(regEx);     
        Matcher m = p.matcher(str);     
        // �滻��ģʽƥ��������ַ����������ֵ��ַ�����""�滻��     
        String ret = m.replaceAll("").trim();
        return ret;
    }   	
}
