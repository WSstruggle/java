package com.inner;

@FunctionalInterface
interface PersonBuilder{
	Person buildperson(String name);
}

class Person{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
public class E26 {

	public static void main(String[] args) {
		PrinterName("蔡徐坤",name->new Person(name));
		PrinterName("张杰",Person::new);
		PrinterName("赵丽颖",new PersonBuilder() {
			
			@Override
			public com.inner.Person buildperson(String name) {
				// TODO 自动生成的方法存根
				return new Person(name);
			}
		});
	}

	private static void PrinterName(String name, PersonBuilder pb) {
		System.out.println(pb.buildperson(name).getName());		
	}

}
