package com.jihe;

import java.util.TreeSet;
class Teacher implements Comparable<Object>{
	String name;
	int age;
	public Teacher(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return name + ":" +age;
	}

	@Override
	public int compareTo(Object o) {
		Teacher s=(Teacher) o;
		return s.age-this.age;
	}
}
public class TreeSet_test2 {

	public static void main(String[] args) {
		TreeSet<Teacher> ts=new TreeSet<Teacher>();
		ts.add(new Teacher("�����",30));
		ts.add(new Teacher("���¾�",32));
		ts.add(new Teacher("����Ƽ",31));
		ts.add(new Teacher("���¾�",32));
		System.out.println(ts);
	}

}
