package com.thread;

import org.apache.poi.hssf.record.chart.TickRecord;

class TicketWindows2 implements Runnable{

	private int tickets=100;
	public void run() {
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
			}
			else {
				break;
			}
		}
	}
}
public class Thread_test5 {

	public static void main(String[] args) {
		TicketWindows2 tw=new TicketWindows2();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();

	}

}