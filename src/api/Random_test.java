package api;

import java.util.Random;

public class Random_test {

	public static void main(String[] args) {
		System.out.println("�������һ�����ڵ���0.0С��1.0����:"+Math.random());
		Random r=new Random();
		System.out.println("�������һ�����ڵ���0.0С��1.0����:"+r.nextDouble());
		System.out.println("�������һ�����ڵ���0��С��10����:"+r.nextInt(10));
	}

}
