package com.jihe;

import java.util.HashSet;

public class HashSet_test {

	public static void main(String[] args) {
//Hashset能够去掉重复元素，是因为Hashset里的string类重写了Object类的HashCode()以及equals()方法
		HashSet<String> haset=new HashSet<String>();
		haset.add("student1");
		haset.add("student2");
		haset.add("student3");
		haset.add("student4");
		haset.add("student4");
		System.out.println("来自哈希集的输出");
		haset.forEach(obj->System.out.println(obj));
		haset.removeAll(haset);
//Hashset能够去掉重复元素，是因为Hashset里的Intergeri类重写了Object类的HashCode()以及equals()方法
		haset.add("1");
		haset.add("2");
		haset.add("5");
		haset.add("3");
		haset.add("3");
		haset.add("4");
		System.out.println("来自哈希集的输出");
		haset.forEach(obj->System.out.println(obj));
	}

}
