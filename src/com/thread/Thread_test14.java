package com.thread;

class DeadLockThread implements Runnable {
	static Object chopsticks = new Object();
	static Object KnifeAndFork = new Object();
	private boolean flag;

	public DeadLockThread(boolean flag) {
		this.flag = flag;
	}

	public void run() {
		if (flag) {
			while (true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName() + "---if--chopsticks");

					synchronized (KnifeAndFork) {
						System.out.println(Thread.currentThread().getName() + "---if--KnifeAndFork");
					}
				}
			}
		} else {
			while (true) {
				synchronized (KnifeAndFork) {
					System.out.println(Thread.currentThread().getName() + "---else--KnifeAndFork");

					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName() + "---else--chopsticks");
					}
				}
			}
		}
	}
}

public class Thread_test14 {

	public static void main(String[] args) {
		DeadLockThread t1=new DeadLockThread(true);
		DeadLockThread t2=new DeadLockThread(false);
		new Thread(t1,"Chinese").start();
		new Thread(t2,"American").start();
	}

}
