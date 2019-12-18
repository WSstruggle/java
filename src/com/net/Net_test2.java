package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Net_test2 {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket(3000);
		String str="来自王帅的问候";
		byte[] zjsz=str.getBytes();
		DatagramPacket dp=new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.34"),8900);
		System.out.println("开始发送信息......");
		ds.send(dp);
		ds.close();
	}
}
