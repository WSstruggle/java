package com.thread;

class TicketWindows4 implements Runnable {

	private int tickets = 10;
	Object lock = new Object();

	public void run() {
		while (true) {
			maipiao();
				
		}
	}

	private synchronized void maipiao() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票");
		}
	}
}

public class Thread_test12 {

	public static void main(String[] args) {
		TicketWindows4 tw = new TicketWindows4();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();

	}

}