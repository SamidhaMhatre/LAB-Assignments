package Lab5Exercise3;

import java.util.Scanner;



	public class EmployeeExceptionTester {
		private static Scanner scanner=new Scanner(System.in);
		public static void main(String[] args) {
			try {
				System.out.println("Enter your salary: ");
				int salary= scanner.nextInt();
				if(salary<3000) {
					throw new EmployeeException("Salary is less than 3000");
				}
				System.out.println("Salary is above 3000");

			}catch(EmployeeException e) {
				e.printStackTrace();
			}

		}

	}


