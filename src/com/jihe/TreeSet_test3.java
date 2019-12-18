package com.jihe;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String) o1;
		String s2=(String) o2;
		return s1.length()-s2.length();
	}
	
}
public class TreeSet_test3 {

	public static void main(String[] args) {
		TreeSet<String> ts2=new TreeSet<String>(new MyComparator());
		ts2.add("Jack");
		ts2.add("Helena");
		ts2.add("Rose");
		ts2.add("Eve");
		System.out.println(ts2);
		TreeSet<String> ts3=new TreeSet<String>((obj1,obj2)->{
			String s1=(String)obj1;
			String s2=(String)obj2;
			return s1.length()-s2.length();
		});
		ts3.add("jack");
		ts3.add("Helena");
		ts3.add("Rose");
		ts3.add("Eve");
		System.out.println(ts3);
	}

}
