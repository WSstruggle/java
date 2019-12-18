package com.thread;

import java.util.*;

import com.classcast.tiger;

public class Thread_test15 {

	public static void main(String[] args) {
		List<Object> goods=new ArrayList<>(); 
		long start=System.currentTimeMillis();
		Thread t1=new Thread(()->{
			int num=0;
			while (System.currentTimeMillis()-start<50) {
				synchronized (goods) {
					if (goods.size()>0) {
						try {
							goods.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}else {
						goods.add("商品"+(++num));
						System.out.println("生产商品"+num);
					}
				}
			}
		},"生产者路线");
		Thread t2=new Thread(()->{
			int num=0;
			while (System.currentTimeMillis()-start<50) {
				synchronized (goods) {
					if (goods.size()<=0) {
						goods.notify();
					}else {
						goods.remove("商品"+(++num));
						System.out.println("消费商品"+num);
					}
				}
			
			}
		},"消费者路线");
		t1.start();
		t2.start();
		
	}

}
