package com.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_test {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("time.txt","rw");
		int time=Integer.parseInt(raf.readLine())-1;
		if(time>0) {
			System.out.println("您还可以尝试"+time+"次");
			//回到文件的开始位置
			raf.seek(0);
			raf.write((time+"").getBytes());
		}else {
			System.out.println("使用次数已经用完");
		}
		raf.close();
	}

}
