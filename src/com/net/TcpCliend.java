package com.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.IO.Zjtj;

public class TcpCliend {

	public static void main(String[] args) throws Exception, IOException {
		Socket khdtjz=new Socket("10.2.103.31",8899);
		OutputStream os=khdtjz.getOutputStream();
		FileInputStream fin=new FileInputStream("d:\\01.jpg");
		byte [] zjhc=new byte[1024];
		int len=fin.read(zjhc);
		while (len!=-1) {
			os.write(zjhc,0,len);
			len=fin.read(zjhc);
			
		}
		khdtjz.shutdownOutput();
		InputStream is=khdtjz.getInputStream();
		len=is.read(zjhc);
		while (len!=-1) {
			System.out.println(new String(zjhc,0,len));
			len=is.read(zjhc);
		}
		is.close();
	
		khdtjz.close();
	}

}
