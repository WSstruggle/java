package com.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReader_test {

	public static void main(String[] args) throws Exception {
		//定义标准字节输入流
		//InputStream jpsr=System.in;
		//InputStreamReader ir=new InputStreamReader(jpsr);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入您的年龄：");
		String line=br.readLine();
		int age=Integer.parseInt(line);
		System.out.println("您明年的年龄为:"+(age+1));
		
	}

}
