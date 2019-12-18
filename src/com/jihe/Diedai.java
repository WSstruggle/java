package com.jihe;

import java.util.*;

public class Diedai {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("student1");
		arrayList.add("student2");
		arrayList.add("student3");
		arrayList.add("student4");
		//�õ����������
		System.out.println("�õ����������");
		Iterator<String> diedai=arrayList.iterator();
		while(diedai.hasNext()) {
			String mygys=diedai.next();
			System.out.println(mygys);
		}
		//��foreachѭ�����
		System.out.println("��foreachѭ�����");
		for(String mygys:arrayList) {
			System.out.println(mygys);
		}
		//���б����JDK8��foreach��������е�ÿ��Ԫ��
		System.out.println("���б����JDK8��foreachѭ�����");
		arrayList.forEach(mygys->System.out.println(mygys));
		//�õ�������JDK8��foreach��������е�ÿ��Ԫ��
		System.out.println("�õ�������JDK8��foreachѭ�����");
		Iterator<String> it=arrayList.iterator();
		it.forEachRemaining(mygys->System.out.println(mygys));
	}

}
