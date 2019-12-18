package com.jihe;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(2);
		ts.add(50);
		ts.add(9);
		ts.add(101);
		ts.add(21);
		//获取首元素和尾部元素
		System.out.println("创建的TreeSet集合为："+ts);
		System.out.println("TreeSet集合首元素为："+ts.first());
		System.out.println("TreeSet集合尾部元素为："+ts.last());
		//比较并获取元素
		System.out.println("集合中小于等于9的最大的一个元素为："+ts.floor(9));
		System.out.println("集合中大于10的最小一个元素为："+ts.higher(10));
		System.out.println("集合中大于100的最小的一个元素为："+ts.higher(100));
		//删除元素
		Object first=ts.pollFirst();
		System.out.println("删除的第一个元素是："+first);
		System.out.println("删除第一个元素后TreeSet集合变为："+ts);
	}

}
