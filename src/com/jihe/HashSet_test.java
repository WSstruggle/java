package com.jihe;

import java.util.HashSet;

public class HashSet_test {

	public static void main(String[] args) {
//Hashset�ܹ�ȥ���ظ�Ԫ�أ�����ΪHashset���string����д��Object���HashCode()�Լ�equals()����
		HashSet<String> haset=new HashSet<String>();
		haset.add("student1");
		haset.add("student2");
		haset.add("student3");
		haset.add("student4");
		haset.add("student4");
		System.out.println("���Թ�ϣ�������");
		haset.forEach(obj->System.out.println(obj));
		haset.removeAll(haset);
//Hashset�ܹ�ȥ���ظ�Ԫ�أ�����ΪHashset���Intergeri����д��Object���HashCode()�Լ�equals()����
		haset.add("1");
		haset.add("2");
		haset.add("5");
		haset.add("3");
		haset.add("3");
		haset.add("4");
		System.out.println("���Թ�ϣ�������");
		haset.forEach(obj->System.out.println(obj));
	}

}
