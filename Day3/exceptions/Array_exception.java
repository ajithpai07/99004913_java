package Exceptions;

import java.util.*;

public class Array_exception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the number of overs");
		int over=sc.nextInt();
		int runs[] = new int[over];
		System.out.println("Enter the number of runs for each over");
		for(int i=0;i<over;i++) {
			runs[i]=sc.nextInt();
		}
		System.out.println("Enter the over number");
		int curr_over=sc.nextInt();
		System.out.println("Runs scored in this over : "+runs[curr_over-1]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}