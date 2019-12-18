package com.thread;

import com.classcast.tiger;

public class Thread_test8 {

	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出i:"+i);
			}
		},"优先级较低的线程");
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+"正在输出i:"+i);
				}
			}
		},"优先级较普通的线程");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
