package com.capgemini.lab1;

import java.util.*;
public class Exercise5
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n nutural numbers:");
		int n=sc.nextInt();
		System.out.println(calculatesum(n));
	}
public static int calculatesum(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		if(i%3==0 || i%5==0)
		{
			sum+=i;
		}
	}
	return sum;
	
	
}
	
	
}




