package Exceptions;

import java.util.Scanner;

public class Custom_main {

public static void main(String[] args) {
		
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the player name");
			name=sc.nextLine();
			System.out.println("Enter the player age");
	        age=sc.nextInt();
	        sc.close();
	        if(age<19) {
	        	throw new CustomeException("CustomException: InvalidAgeRangeException"); 	
	        }
	        else {
	        	System.out.println("Player name : "+name);
	        	System.out.println("Player age : "+age);
	        }
	        }catch(CustomeException e) {
	        	 System.out.println(e.getMessage());
	        }
	

	}

}