package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {
	private DatagramSocket ds;
	private int i;

	public ChatSender(DatagramSocket ds, int i) {
		this.ds=ds;
		this.i=i;
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("我说:");
			try {
				
				DatagramPacket dp;
				String str = sc.nextLine();
				System.out.println("你要发给哪个IP:");
				String ip = sc.nextLine();
				byte[] zjsz = str.getBytes();
				dp = new DatagramPacket(zjsz, zjsz.length, InetAddress.getByName(ip), 8900);
				ds.send(dp);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

		}
	}

}
