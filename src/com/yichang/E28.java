package com.yichang;

import java.util.concurrent.RecursiveTask;

public class E28 {
	public static int divide(int x,int y) {
		try {
			int result=x/y;
			return result;
		} catch (Exception e) {
			System.out.println("捕获运行时得异常信息为"+e.getMessage());
		}
		finally {
			System.out.println("无论怎么样都要执行finally");
		}
		return -1;
	}
	public static void main(String[] args) {
			int result=divide(4, 2);
			if(result==-1) {
				System.out.println("程序发生异常");
			}
			System.out.println(result);
	}

}
