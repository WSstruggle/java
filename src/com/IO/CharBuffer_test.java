package com.IO;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		CharBuffer cbf=CharBuffer.allocate(6);
		System.out.println("这个字符缓冲区容量是："+cbf.capacity());
		System.out.println("这个字符缓冲区界限是"+cbf.limit());
		System.out.println("这个字符缓冲区初始位置值是"+cbf.position());
		//添加3个元素
		cbf.put('a');cbf.put('b');cbf.put('c');
		System.out.println("添加3个元素以后这个字符缓冲区容量是"+cbf.capacity());
		System.out.println("添加3个元素以后这个字符缓冲区界限是"+cbf.limit());
		System.out.println("添加3个元素以后这个字符缓冲区初始位置值是"+cbf.position());
		//执行反转方法
		cbf.flip();
		System.out.println("添加元素并反转后这个字符缓冲区容量为"+cbf.capacity());
		System.out.println("添加元素并反转后这个字符缓冲区界限是"+cbf.limit());
		System.out.println("添加元素并反转后这个字符缓冲区初始位置值是"+cbf.position());
		//添加3个元素并反转后取出第一个元素
		System.out.println("添加3个元素并反转后取出第一个元素"+cbf.get());
		System.out.println("添加3个元素并反转取出第一个元素后这个字符缓冲区界限是"+cbf.limit());
		System.out.println("添加3个元素并反转取出第一个元素后这个字符缓冲区初始位置值是"+cbf.position());
		//执行删除后
		cbf.clear();
		System.out.println("执行clear后这个字符缓冲区容量为"+cbf.capacity());
		System.out.println("执行clear后这个字符缓冲区界限是"+cbf.limit());
		System.out.println("执行clear后这个字符缓冲区初始位置值是"+cbf.position());
	}

}
