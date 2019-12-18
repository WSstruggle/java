package com.jihe;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Min {

	public static void main(String[] args) {
		Test test = new Test();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//数组列表每次插入一个元素，其他元素都要向后移动，耗费时间大
		long kssj1 = System.currentTimeMillis();
		test.listInsert(arrayList);
		long jssj1 = System.currentTimeMillis();
		System.out.println("数组列表头部插入15万个元素耗时" + (jssj1 - kssj1) + "毫秒");
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		long kssj2 = System.currentTimeMillis();
		test.listInsert(linkedList);
		long jssj2 = System.currentTimeMillis();
		System.out.println("数组列表头部插入15万个元素耗时" + (jssj2 - kssj2) + "毫秒");
		
		long kssj3 = System.currentTimeMillis();
		test.listRead(arrayList);
		long jssj3 = System.currentTimeMillis();
		System.out.println("数组列表倒序读取15万个元素耗时" + (jssj3 - kssj3) + "毫秒");
		
		long kssj4 = System.currentTimeMillis();
		test.listRead(linkedList);
		long jssj4 = System.currentTimeMillis();
		System.out.println("链表列表倒序读取15万个元素耗时" + (jssj4 - kssj4) + "毫秒");
	}

}

class Test {

	public void listInsert(List<Integer> list) {
		for (int i = 0; i < 150000; i++) {
			list.add(0, i);
		}
	}
	public void listRead(List<Integer> list) {
		for (int i = 150000-1; i>=0; i--) {
			list.get(i);
		}
	}
}
