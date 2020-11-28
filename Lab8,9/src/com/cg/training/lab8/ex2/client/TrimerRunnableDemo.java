package com.cg.training.lab8.ex2.client;

import com.cg.training.lab8.ex2.service.TimerRunnable;

public class TrimerRunnableDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
        //Runnable object
        Runnable runnable= (Runnable) new TimerRunnable();
        
        Thread t1= new Thread(runnable,"worker-1");
        //main thread spawns thread, worker-1 which executes run() method
        //start() method invokes run() method
        t1.start();
           
	
	}
}


