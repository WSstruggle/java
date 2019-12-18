package api;

public class Baozhuang {

	public static void main(String[] args) {
		int a = 20;
		//自动装箱
		Integer b=a;
		//自动拆箱
		int c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		String Age="55";
		System.out.println(Age);
		System.out.println("NO.1:包装类valueOf方法-->"+(Integer.valueOf(Age)+10));
		System.out.println("NO.2:ParseXxx方法-->"+Integer.parseInt(Age));
		System.out.println("NO.3:构造方法-->"+new Integer(Age));
		Integer zs=88;
		System.out.println("NO.1:包装类的valueOf方法-->"+String.valueOf(zs));
		System.out.println("NO.2:包装类的tostring方法-->"+zs.toString());
		System.out.println("NO.3:构造方法-->"+zs+" ");
	}

}
