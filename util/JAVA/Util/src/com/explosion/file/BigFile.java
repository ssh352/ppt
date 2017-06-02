package com.explosion.file;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class BigFile {

	
	public static void main(String[] args) {
		File f = new File("F:\\Ñ¸À×ÏÂÔØ\\sp\\sp.txt");
		
		LineIterator it;
		try {
				it = FileUtils.lineIterator(f, "GBK");
				while (it.hasNext()) {
					String line = it.nextLine();
					System.out.println(line);
			    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
