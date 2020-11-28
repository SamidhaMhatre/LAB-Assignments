package Lab9;


import java.util.Scanner;

interface MyInterface
{
	double power(int x,int y);

}
public  class Exe1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		MyInterface m3=(x,y)->Math.pow(x,y);
		double x=m3.power(a,b);
		System.out.print(x);

	


}


}
