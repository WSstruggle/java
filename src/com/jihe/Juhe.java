package com.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("��˧");
		list.add("л��");
		list.add("������");
		list.add("����");
		list.add("�´���");
		Stream<String>stream=list.stream();
		
		stream.forEach(i->System.out.println(i));
		Stream<String> stream2=list.stream();
		Stream<String>stream3=stream2.filter(i ->i.startsWith("��"));
		System.out.println("�����������ճµ��ˣ�");
		stream3.forEach(k->System.out.println(k));
		
		System.out.println("�����������ճµ��ˣ�");
		list.stream().filter(i ->i.startsWith("��")).limit(2).forEach(k->System.out.println(k));
	
		
		System.out.println("�����������ճµ�����,���ӣ�");
		System.out.println(list.stream().filter(i ->i.startsWith("��")).limit(2).collect(Collectors.joining(",")));
	}

}
