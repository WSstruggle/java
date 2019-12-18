package com.jihe;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return this.name.equals(other.name);
		
	}
	@Override
	public String toString() {
		return name + ":" + age;
	}
	
}
public class Person_test {

	public static void main(String[] args) {
		Person p1=new Person("л��",18);
		Person p2=new Person("��˧",18);
		Person p3=new Person("����",19);
		Person p4=new Person("л��",18);
		HashSet<Person> h=new HashSet<Person>();
		h.add(p1);
		h.add(p2);
		h.add(p3);
		h.add(p4);
		System.out.println(h);
	}

}
