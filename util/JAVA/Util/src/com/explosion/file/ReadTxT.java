package com.explosion.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;



public class ReadTxT {
	
	private String Filename = "";

	public ReadTxT(String sfilename){
		this.Filename = sfilename;
	}
	
	// rows into List<String>, 
	public int ReadTxtData(List<String> DataList){
		BufferedReader br = GetTxtToBuf();
		if(br!=null){
			GetDataIntoPD(br, DataList);
		}
		return 0;
	}
	
	private BufferedReader GetTxtToBuf(){
		File filename = new File(Filename);   
		try {
			InputStreamReader reader =  new InputStreamReader(new FileInputStream(filename));
			return new BufferedReader(reader);   
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	 }
	 
	 private int GetDataIntoPD(BufferedReader br, List<String> DataList){
		String line;
		try {
			line = br.readLine();
			while(line!=null){
				// delete blank row
				if(line.trim().equals("")){
					line = br.readLine();
					continue;
				}
				DataList.add(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	 }
}
