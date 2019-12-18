package com.thread;

class TicketWindows3 implements Runnable {

	private int tickets = 10;
	Object lock = new Object();

	public void run() {
		while (true) {
			synchronized (lock) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}

				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票");
				} else {
					break;
				}
			
		}
	}
}

public class Thread_test11 {

	public static void main(String[] args) {
		TicketWindows3 tw = new TicketWindows3();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();

	}

}