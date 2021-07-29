package Exceptions;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arithmetic_exception {

	public static void main(String[] args) {
		int score = 0;
		int over = 0;
		float runrate;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter the total runs scored ");
			score= Integer.parseInt(reader.readLine());
           			System.out.println("Enter the total overs faced ");
	        		over= Integer.parseInt(reader.readLine());
	        		if(over!=0) {
	        			runrate=score/over;
	        			System.out.println("Current Run Rate :"+runrate);
	        		}
			else {
	        			runrate=score/over;	
	        		}
			
		}
		catch(Exception e){
			System.out.println(e);
			
		}

	}

}