package api;

import java.util.Random;

public class Random_test {

	public static void main(String[] args) {
		System.out.println("随机生成一个大于等于0.0小于1.0的数:"+Math.random());
		Random r=new Random();
		System.out.println("随机生成一个大于等于0.0小于1.0的数:"+r.nextDouble());
		System.out.println("随机生成一个大于等于0亿小于10的数:"+r.nextInt(10));
	}

}
