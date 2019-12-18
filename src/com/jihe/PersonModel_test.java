package com.jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PersonModel_test {
	public static void main(String[] args) {
		List<PersonModel> list=new ArrayList<>();
		PersonModel p1=new PersonModel("wang wen",20,"ÄÐ");
		PersonModel p2=new PersonModel("li jing",18,"Å®");
		PersonModel p3=new PersonModel("li qin",21,"Å®");
		PersonModel p4=new PersonModel("he feng",19,"ÄÐ");
		list=Arrays.asList(p1,p2,p3,p4);
		
		//old
		for (PersonModel pm : list) {
			System.out.println(pm.getName());
		}
		
		//new 1
		List<String> list2=list.stream().map(pm->pm.getName()).collect(Collectors.toList());
		System.out.println(list2);
		
		//new 1
		List<String> list3=list.stream().map(PersonModel::getName).collect(Collectors.toList());
		System.out.println(list3);
				
		//new 1
		List<String> list4=list.stream().map(pm->{
			return pm.getName();
		}).collect(Collectors.toList());
		System.out.println(list4);
	}

}
