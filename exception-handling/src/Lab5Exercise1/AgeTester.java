package Lab5Exercise1;

import java.util.Scanner;



public class AgeTester {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.println("Enter your age: ");
			int age= scanner.nextInt();
			if(age>15) {
				throw new AgeException("Person age should be above 15");
			}
			System.out.println("You are eligible ");

		}catch(AgeException e) {
			e.printStackTrace();
		}

	}

}
