package com.capgemini.lab1;

import java.util.*;


public class Exercrise1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		System.out.println(sum);
	}
			
			
			
			
	}

