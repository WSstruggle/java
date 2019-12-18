package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class diedai_shancu {

	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("student1");
		arrayList1.add("student2");
		arrayList1.add("student3");
		Iterator<String> diedai = arrayList1.iterator();
		while (diedai.hasNext()) {
			Object object = (Object) diedai.next();
			if ("student2".equals(object)) {
				diedai.remove();
			}

		}
		System.out.println(arrayList1);
	}

}
