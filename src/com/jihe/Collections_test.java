package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_test {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		Collections.addAll(list, "��","Ǯ","��","��","��");
		System.out.println("����ǰ��"+list);
		Collections.reverse(list);
		System.out.println("��ת��"+list);
		Collections.sort(list);;
		System.out.println("��Ȼ�����"+list);
		Collections.shuffle(list);;
		System.out.println("��������"+list);
		Collections.swap(list, 0,list.size()-1);;
		System.out.println("��β������"+list);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		Collections.addAll(list2, -3,2,9,5,8);
		System.out.println("�����е�Ԫ�أ�"+list2);
		System.out.println("����������Ԫ��Ϊ��"+Collections.max(list2));		System.out.println("��������С��Ԫ��Ϊ��"+Collections.min(list2));
		Collections.replaceAll(list2, 5, 0);
		System.out.println("�滻��ļ���Ϊ��"+list2);
		Collections.sort(list2);
		System.out.println("��Ȼ�����"+list2);
		System.out.println("ͨ�����ֲ��ҷ�����Ԫ��9���±�Ϊ��"+Collections.binarySearch(list2, 9));
	}

}
