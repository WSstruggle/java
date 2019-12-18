package com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Thread_test17 {

	public static void main(String[] args) throws Exception, Exception {
		//创造第一个线程
		CompletableFuture<Integer>f1=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for (int i = 0; i < 11; i++) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"线程任务正在执行...i:"+i);
			}
				
			return sum;
		});
		//创造第二个线程
		CompletableFuture<Integer>f2=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for (int j = 0; j < 21; j++) {
				sum+=j;
				System.out.println(Thread.currentThread().getName()+"线程任务正在执行...j:"+j);
			}
			return sum;
		});
		int total=f1.get()+f2.get();
		System.out.println("两个线程相加的结果为"+total);
	}

}
