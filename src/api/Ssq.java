package api;

import java.util.*;

public class Ssq {

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("请输入你选择的号码:");
			 int a=in.nextInt();
			 System.out.println(a);
        /*
		Random t=new Random();
		
		for (int i = 0; i < 6; i++) {
			int s=t.nextInt(33)+1;
			System.out.print(s+"  ");
		}*/
		System.out.println();
		System.out.println("双色球开奖了:");
		Random r=new Random();
		Thread.sleep(1000);
		HashSet<Integer> hashSet=new HashSet<>();
		System.out.println("六个红球号码为:");
		for (int i = 0; i < 6; i++) {
			int hq=r.nextInt(33)+1;
			hashSet.add(hq);
			if (hashSet.size()==6) {
				break;
			}
			
		}
		for (Integer  hq: hashSet) {
			System.out.print(hq+"  ");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("一个蓝球号码为:");
		Thread.sleep(1000);
		System.out.println(r.nextInt(16)+1);
		Thread.sleep(1000);
	}

}
