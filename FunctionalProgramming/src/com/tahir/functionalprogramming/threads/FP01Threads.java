package com.tahir.functionalprogramming.threads;

public class FP01Threads {

	public static void main(String[] args) {
		Runnable raRunnable1 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println(Thread.currentThread().getId() + " : " + i);
				}

			}
		};
		Thread thread1 = new Thread(raRunnable1);
		thread1.start();
		Thread thread2 = new Thread(raRunnable1);
		thread2.start();
		Thread thread3 = new Thread(raRunnable1);
		thread3.start();
		
		
		
		Runnable raRunnable2 = ()->{
				for (int i = 0; i < 10000; i++) {
					System.out.println(Thread.currentThread().getId() + " : " + i);
				}
			
		};
		
		Thread thread5 = new Thread(raRunnable2);
		thread5.start();
		Thread thread4 = new Thread(raRunnable2);
		thread4.start();
		Thread thread6 = new Thread(raRunnable2);
		thread6.start();
		
	}

}
