package com.jihe;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(2);
		ts.add(50);
		ts.add(9);
		ts.add(101);
		ts.add(21);
		//��ȡ��Ԫ�غ�β��Ԫ��
		System.out.println("������TreeSet����Ϊ��"+ts);
		System.out.println("TreeSet������Ԫ��Ϊ��"+ts.first());
		System.out.println("TreeSet����β��Ԫ��Ϊ��"+ts.last());
		//�Ƚϲ���ȡԪ��
		System.out.println("������С�ڵ���9������һ��Ԫ��Ϊ��"+ts.floor(9));
		System.out.println("�����д���10����Сһ��Ԫ��Ϊ��"+ts.higher(10));
		System.out.println("�����д���100����С��һ��Ԫ��Ϊ��"+ts.higher(100));
		//ɾ��Ԫ��
		Object first=ts.pollFirst();
		System.out.println("ɾ���ĵ�һ��Ԫ���ǣ�"+first);
		System.out.println("ɾ����һ��Ԫ�غ�TreeSet���ϱ�Ϊ��"+ts);
	}

}
