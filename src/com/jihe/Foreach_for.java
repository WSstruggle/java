package com.jihe;

public class Foreach_for {
	
	static String[] str= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		//foreach循环遍历数组
		for(@SuppressWarnings("unused") String mgys:str) {
			mgys="ddd";
		}
		System.out.println("foreach循环修改后的数组:"+str[0]+","+str[1]+","+str[2]);
		//for循环遍历数组
		for (int i = 0; i < str.length; i++) {
			str[i]="ddd";
		}
		System.out.println("普遍for循环修改后的数组:"+str[0]+","+str[1]+","+str[2]);
	}
	
}
