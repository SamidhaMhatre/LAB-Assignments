package Lab5Exercise2;

import java.util.Scanner;

public class BlankNameTester {
	
		  static void validageName(String fname,String lname) throws BlankName
		  {
			  if(fname.isEmpty() || lname.isEmpty())
				  throw new BlankName("balnk value entered");
			  else
				  System.out.println("Your name is : "+ fname + " "+lname);
		  }
			public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter fisrt name");
			String fname=sc.nextLine();
			System.out.println("Enter last name");
			String lname=sc.nextLine();
		    try
		    {
		    	validageName(fname,lname);
		    }catch(BlankName e)
		    {
		    	System.out.println("Exception occured for blank name" + e);
		    }
			}

		}

