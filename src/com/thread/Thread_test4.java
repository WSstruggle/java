package com.thread;
class TicketWindows extends Thread{

	public TicketWindows(String name) {
		super(name);
	}
	private int tickets=100;
	public void run() {
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
			}
		}
	}
}
public class Thread_test4 {

	public static void main(String[] args) {
		new TicketWindows("窗口1").start();
		new TicketWindows("窗口2").start();
		new TicketWindows("窗口3").start();
		new TicketWindows("窗口4").start();

	}

}
