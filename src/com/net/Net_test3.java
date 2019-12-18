package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Net_test3 {

	public static void main(String[] args) throws Exception {
		
	DatagramSocket s1=new DatagramSocket(8900);
	byte[] buf=new byte[1024];
	DatagramPacket p1=new DatagramPacket(buf,buf.length);
	System.out.println("等待接收数据...");
	while (true) {
		s1.receive(p1);
		String xinxi=new String(p1.getData(),0,p1.getLength());
		System.out.println(p1.getAddress().getHostAddress()+":"+xinxi);
		
	}
	}

}
