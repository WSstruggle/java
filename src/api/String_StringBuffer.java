package api;

public class String_StringBuffer {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		StringBuffer sb1=new StringBuffer("a");
		StringBuffer sb2=new StringBuffer("b");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
	}

}
