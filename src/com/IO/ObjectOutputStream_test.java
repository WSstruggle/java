package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_test {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream	out=new ObjectOutputStream(new FileOutputStream("d:\\Obj.txt"));
		Person p1=new Person("mike",20);
		out.writeObject(p1);
		
		//对象输入流
		ObjectInputStream	in=new ObjectInputStream(new FileInputStream("d:\\Obj.txt"));
		Person p=(Person)in.readObject();
		System.out.println("name="+p.getName());
		System.out.println("age="+p.getAge());
	}

}
