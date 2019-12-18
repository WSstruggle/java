package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net_test1 {

	public static void main(String[] args) throws Exception {
		InetAddress ip1=InetAddress.getLocalHost();
		System.out.println("本机的IP地址为:"+ip1.getHostAddress());
		InetAddress ip2=InetAddress.getByName("www.hbjhart.com");
		System.out.println("江汉艺术职业学院web服务器的IP地址为:"+ip2.getHostAddress());
		if (ip2.isReachable(3000)) {
			System.out.println("从本机到江汉艺术职业学院web服务器3秒可达");
		}else 
		{
			System.out.println("从本机到江汉艺术职业学院web服务器3秒不可达");
		}
		System.out.println("江汉艺术职业学院web服务器的主机名为："+ip2.getHostName());
	}

}
