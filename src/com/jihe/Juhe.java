package com.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("王帅");
		list.add("谢雷");
		list.add("陈盼盼");
		list.add("陈龙");
		list.add("陈大龙");
		Stream<String>stream=list.stream();
		
		stream.forEach(i->System.out.println(i));
		Stream<String> stream2=list.stream();
		Stream<String>stream3=stream2.filter(i ->i.startsWith("陈"));
		System.out.println("集合里所有姓陈的人：");
		stream3.forEach(k->System.out.println(k));
		
		System.out.println("集合里两个姓陈的人：");
		list.stream().filter(i ->i.startsWith("陈")).limit(2).forEach(k->System.out.println(k));
	
		
		System.out.println("集合里两个姓陈的人用,连接：");
		System.out.println(list.stream().filter(i ->i.startsWith("陈")).limit(2).collect(Collectors.joining(",")));
	}

}
