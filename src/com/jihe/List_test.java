package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_test {
	//<>�Ƿ��ͣ�����������Ǽ�����Ԫ�ص�����
	//�������࣬ǰ����Ǽ����࣬�������������Ǽ�����Ԫ�ص�����
	public static void main(String[] args) {
		//ArrayList����
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("student1");
		arrayList.add("student2");
		arrayList.add("student3");
		arrayList.add("student4");
		System.out.println("ArrayList���ϵĳ�����:"+arrayList.size());
		System.out.println("ArrayList���ϵڶ���Ԫ����:"+arrayList.get(1));
		//LinkedList������
		LinkedList<String> LinkedList=new LinkedList<String>();
		LinkedList.add("student1");
		LinkedList.add("student2");
		System.out.println("����Linked���ϵĳ�����:"+LinkedList.size());
		System.out.println("����Linked���ϵڶ���Ԫ����:"+LinkedList.get(1));
		//�򼯺�β��׷��һ��Ԫ��
		LinkedList.offer("offer");
		System.out.println("����Linked���ϵĳ�����:"+LinkedList.size());
		System.out.println("����Linked���ϵ�����Ԫ����:"+LinkedList.get(2));
		//�򼯺�ͷ��׷��һ��Ԫ��
		LinkedList.push("push");
		System.out.println(LinkedList);
		//��ȡ���ϵ�һ��Ԫ��
		String dygys=LinkedList.peek();
		System.out.println("����Linked���ϵ�һ��Ԫ����:"+dygys);
		//ɾ����һ��Ԫ�غ����һ��Ԫ��
		LinkedList.removeFirst();
		LinkedList.pollLast();
		System.out.println(LinkedList);

	}

}
