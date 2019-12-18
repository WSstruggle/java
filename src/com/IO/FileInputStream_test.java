package com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class FileInputStream_test {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("D:\\tp.jpg");
		FileOutputStream fout=new FileOutputStream("C:\\tp.jpg");
		long kssj=System.currentTimeMillis();
		byte [] zjhc=new byte[2048];
		int b=fin.read(zjhc);
		while(b!=-1) {
			//System.out.print((char)b);
			fout.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("øΩ±¥Õº∆¨∫ƒ ±£∫"+(jssj-kssj)+"∫¡√Î");
		//fout.write(",Come on!".getBytes());
		fin.close();
		fout.close();
	}

}
