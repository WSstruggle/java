package com.jihe;

import java.util.*;

public class Diedai {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("student1");
		arrayList.add("student2");
		arrayList.add("student3");
		arrayList.add("student4");
		//用迭代方法输出
		System.out.println("用迭代方法输出");
		Iterator<String> diedai=arrayList.iterator();
		while(diedai.hasNext()) {
			String mygys=diedai.next();
			System.out.println(mygys);
		}
		//用foreach循环输出
		System.out.println("用foreach循环输出");
		for(String mygys:arrayList) {
			System.out.println(mygys);
		}
		//用列表对象JDK8的foreach输出集合中的每个元素
		System.out.println("用列表对象JDK8的foreach循环输出");
		arrayList.forEach(mygys->System.out.println(mygys));
		//用迭代对象JDK8的foreach输出集合中的每个元素
		System.out.println("用迭代对象JDK8的foreach循环输出");
		Iterator<String> it=arrayList.iterator();
		it.forEachRemaining(mygys->System.out.println(mygys));
	}

}
