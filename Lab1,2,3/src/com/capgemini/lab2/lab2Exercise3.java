package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class lab2Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("enter no of the arrays");
int size=sc.nextInt();
int arr[]=new int [size];
int a[]=new int[size];
System.out.println("enter the number");
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
for(int s:arr)
	
{
	System.out.println("enter the numbers"+s);
}
System.out.println("reversed arr is");
for(int i=arr.length-1;i>=0;i--)
{
	System.out.println(arr[i] );
}
for(int i=0;i<arr.length;i++)
{
	a[i]=arr[i];
}
System.out.println("sorted array");
 Arrays.sort(a);
 System.out.printf("sorted array is : %s" , Arrays.toString(a));


}
	}
