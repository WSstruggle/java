package com.jihe;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Min {

	public static void main(String[] args) {
		Test test = new Test();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//�����б�ÿ�β���һ��Ԫ�أ�����Ԫ�ض�Ҫ����ƶ����ķ�ʱ���
		long kssj1 = System.currentTimeMillis();
		test.listInsert(arrayList);
		long jssj1 = System.currentTimeMillis();
		System.out.println("�����б�ͷ������15���Ԫ�غ�ʱ" + (jssj1 - kssj1) + "����");
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		long kssj2 = System.currentTimeMillis();
		test.listInsert(linkedList);
		long jssj2 = System.currentTimeMillis();
		System.out.println("�����б�ͷ������15���Ԫ�غ�ʱ" + (jssj2 - kssj2) + "����");
		
		long kssj3 = System.currentTimeMillis();
		test.listRead(arrayList);
		long jssj3 = System.currentTimeMillis();
		System.out.println("�����б����ȡ15���Ԫ�غ�ʱ" + (jssj3 - kssj3) + "����");
		
		long kssj4 = System.currentTimeMillis();
		test.listRead(linkedList);
		long jssj4 = System.currentTimeMillis();
		System.out.println("�����б����ȡ15���Ԫ�غ�ʱ" + (jssj4 - kssj4) + "����");
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
