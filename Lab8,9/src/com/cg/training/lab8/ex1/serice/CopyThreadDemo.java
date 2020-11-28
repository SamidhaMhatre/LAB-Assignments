package com.cg.training.lab8.ex1.serice;

import com.cg.training.lab8.ex1.client.CopyDataThread;

public class CopyThreadDemo {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread()); 
		Thread t1= new CopyDataThread("worker-1");
		t1.start();
		
		

	}



}


