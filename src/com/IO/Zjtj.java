package com.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Zjtj {
	static HashMap<String, Integer> hmap=new HashMap<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("18rj2.txt")));
		String xm=br.readLine();
		while (xm!=null) {
			hmap.put(xm, 0);
			xm=br.readLine();
		}
		File ml=new File("D:\\18软件2班作业");
		fileDir(ml);
		System.out.print(hmap);
	}

	private static void fileDir(File ml) {
		File[] wjsz=ml.listFiles();
		for (File files : wjsz) {
			if(files.isDirectory()) {
				String wjm=files.getName();
				hmap.forEach((xsm,cs)->{
					if(wjm.contains(xsm)) {
					cs=cs+1;
					hmap.put(xsm, cs);
					} 
				});
				fileDir(files);
		}
		
	}
	}
		
}
