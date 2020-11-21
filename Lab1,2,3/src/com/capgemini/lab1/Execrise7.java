package com.capgemini.lab1;

import java.util.Scanner;

public class Execrise7 {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check :");
		int a=sc.nextInt();
		boolean answer=checkIncreasingNumber(a);
		if(answer){
		System.out.println("not an increasing number");
		}
		else{
		System.out.println("it is an increasing number");
		}
		}
		public static boolean checkIncreasingNumber(int n){
		boolean flag=false;
		int cd=n%10;
		n=n/10;
		while(n>0){
		if(cd<=n%10){
		flag = true;
		break;
		}
		cd=n%10;
		n=n/10;
		}
		return flag;
		}
		}


