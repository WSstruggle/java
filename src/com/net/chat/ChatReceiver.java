package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable {
	private DatagramSocket s1;

	public ChatReceiver(DatagramSocket ds) {
		this.s1 = ds;
	}

	@Override
	public void run() {

		while (true) {
			byte[] buf = new byte[1024];
			DatagramPacket p1 = new DatagramPacket(buf, buf.length);
			while (true) {
				try {
					s1.receive(p1);
					String xinxi = new String(p1.getData(), 0, p1.getLength());
					System.out.println(p1.getAddress().getHostAddress() + ":" + xinxi);
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}

			}
		}
	}

}
