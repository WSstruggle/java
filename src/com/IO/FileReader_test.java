package com.IO;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_test {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("d:\\writer.txt");
		FileWriter fw=new FileWriter("writer.txt");
		for (int i = 0; i < 1000; i++) {
			fw.write("再别康桥\r\n");
			fw.write("\t-----徐志摩\r\n");
			fw.write("轻轻的我走了，\r\n");
			fw.write("正如我轻轻的来，\r\n");
			fw.write("我轻轻的招手，\r\n");
			fw.write("作别西天的云彩。\r\n");
			
		}
		char[] zfhc=new char[1024];
		int b=fr.read(zfhc);
		while(b!=-1) {
			fw.write(zfhc,0,b);
			//System.out.print((char)b);
			b=fr.read(zfhc);
		}
		fr.close();
		fw.close();
	}

}
