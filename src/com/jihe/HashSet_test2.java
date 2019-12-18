package com.jihe;

import java.util.HashSet;

class Student{
	String id;
	String name;
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id +":"+name;
	}
	public int hashCode() {
		return id.hashCode();
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student s1=(Student)obj;
		boolean b=this.id.equals(s1.id);
		return b;
	}
}
public class HashSet_test2 {

	public static void main(String[] args) {
		Student s1=new Student("1","mlik");
		Student s2=new Student("1","mlik");
		Student s3=new Student("3","yanghao");
		HashSet<Student> hset=new HashSet<Student>();
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);
		System.out.println(hset);
	}

}
