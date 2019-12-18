package com.IO;

import java.io.File;
import java.util.Arrays;

public class Bianli {

	public static void main(String[] args) {
		File file=new File("E:\\java王帅");
		fileDir(file);
	}

	private static void fileDir(File file) {
		File[] ListFiles=file.listFiles();
		for (File files : ListFiles) {
			if(files.isDirectory()) {
				fileDir(files);
			}
			else if(files.isFile()){
				String[] fileNames=file.list((dir,name)->name.endsWith(".java"));
				Arrays.stream(fileNames)
					.forEach(f->System.out.println(f));
			}
		}
		
	}

}
