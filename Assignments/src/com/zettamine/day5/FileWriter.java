package com.zettamine.day5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args) throws IOException {
		File file =  new File("C:/CJava/java");
		if(file.mkdir()) {
			System.out.println("folder created");
		}else {
			System.out.println("file already exist");
		}
		String path = file + "/java.txt";
		FileOutputStream w = new FileOutputStream(path);
		
		try {
			w.write(8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		w.close();

	}

}
