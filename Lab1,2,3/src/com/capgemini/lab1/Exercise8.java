package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to know the power");
		int number=sc.nextInt();
		System.out.println(checkNumber(number));
			
	}
	 public static boolean checkNumber(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 if(Math.pow(2,i)==n)
			 {
				 return true;
			 }
		 }
		 return false;
	 }
}

	 


