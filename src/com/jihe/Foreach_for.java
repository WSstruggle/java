package com.jihe;

public class Foreach_for {
	
	static String[] str= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		//foreachѭ����������
		for(@SuppressWarnings("unused") String mgys:str) {
			mgys="ddd";
		}
		System.out.println("foreachѭ���޸ĺ������:"+str[0]+","+str[1]+","+str[2]);
		//forѭ����������
		for (int i = 0; i < str.length; i++) {
			str[i]="ddd";
		}
		System.out.println("�ձ�forѭ���޸ĺ������:"+str[0]+","+str[1]+","+str[2]);
	}
	
}
