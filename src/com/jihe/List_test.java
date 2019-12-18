package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_test {
	//<>是泛型，里面的类型是集合里元素的类型
	//有两个类，前面的是集合类，后面尖括号里的是集合里元素的类型
	public static void main(String[] args) {
		//ArrayList集合
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("student1");
		arrayList.add("student2");
		arrayList.add("student3");
		arrayList.add("student4");
		System.out.println("ArrayList集合的长度是:"+arrayList.size());
		System.out.println("ArrayList集合第二个元素是:"+arrayList.get(1));
		//LinkedList链表集合
		LinkedList<String> LinkedList=new LinkedList<String>();
		LinkedList.add("student1");
		LinkedList.add("student2");
		System.out.println("链表Linked集合的长度是:"+LinkedList.size());
		System.out.println("链表Linked集合第二个元素是:"+LinkedList.get(1));
		//向集合尾部追加一个元素
		LinkedList.offer("offer");
		System.out.println("链表Linked集合的长度是:"+LinkedList.size());
		System.out.println("链表Linked集合第三个元素是:"+LinkedList.get(2));
		//向集合头部追加一个元素
		LinkedList.push("push");
		System.out.println(LinkedList);
		//获取集合第一个元素
		String dygys=LinkedList.peek();
		System.out.println("链表Linked集合第一个元素是:"+dygys);
		//删除第一个元素和最后一个元素
		LinkedList.removeFirst();
		LinkedList.pollLast();
		System.out.println(LinkedList);

	}

}
