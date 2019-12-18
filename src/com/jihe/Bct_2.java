package com.jihe;

import java.util.*;
class MyComparator1 implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String Key1=(String) o1;
		String Key2=(String) o2;
		return Key2.compareTo(Key1);
	}
	
}
public class Bct_2 {
	
	public static void main(String[] args) {
		Map<String, String> hmap = new TreeMap<String, String>(new MyComparator1());
		hmap.put("2", "John");
		hmap.put("1", "Lucy");
		hmap.put("4", "Aimee");
		hmap.put("5", "Amanda");
		hmap.put("3", "Smith");
		System.out.println(hmap);
		System.out.println("�ü�������ȡ���ϵļ�ֵ");
		Set<String> keySet = hmap.keySet();
		Iterator<String> diedai = keySet.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value = hmap.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
