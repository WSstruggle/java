package com.thread;
class MyThread1 extends Thread{

	public MyThread1(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法正在运行");
		}
	}
}
public class Thread_test1 {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1("线程1");
		t1.start();
		MyThread1 t2=new MyThread1("线程2");
		t2.start();
	}

}
