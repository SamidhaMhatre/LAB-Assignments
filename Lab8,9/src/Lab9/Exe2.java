package Lab9;

import java.util.Scanner;

public class Exe2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);  
	       System.out.print("Please enter a Password: ");  
	        String password = input.next();  
	        if (isValid(password)) {  
	            System.out.println("Valid Password");  
	        } else {  
	            System.out.println("Invalid Password");  
	        }  
	    }  

		

	public static boolean isValid(String password) {  
	    
	    if (password.length() < 13 && password.endsWith("_job")) {   
	    	
	        return true;  
	    }else
	    	return false;
	}

	}


