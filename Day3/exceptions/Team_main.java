package Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class Team_main {
	
	public static boolean validatelist(ArrayList <String> list,String s) {
	      for (String element : list)
	      {
	         if (element.contains(s))
	         {
	               return true;
	         }
	     }
		return false;  
	}
	
	public static void main(String args[])
	{  
		   ArrayList <String> list = new ArrayList<String>();
		      //Instantiating an ArrayList object
		      list.add("Chennai Super Kings");
		      list.add("Sun Risers Hyderabad");
		      list.add("Delhi Capitals");
		      list.add("Kings XI Punjab");
		      list.add("Kolkata Knight Riders");
		      list.add("Mumbai Indians");
		      list.add("Rajasthan Royals");
		      list.add("Royal Challengers Bangalore");
		  	  Scanner sc=new Scanner(System.in);
		  	  try {
		      System.out.println("Enter the expected winner team of IPL Season 13 ");
		      String winner=sc.nextLine();
		      if(validatelist(list,winner)) {
		    	  System.out.println("Enter the expected runner Team of IPL Season 13 ");
			      String runner=sc.nextLine();
			      sc.close();
			      if(validatelist(list,runner)) {
			    	  System.out.println("Expected IPL Season 13 winner: "+winner);
			    	  System.out.println("Expected IPL Season 13 runner: "+runner);
			    } else {
			    	  throw new TeamName("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
			      }
			      
		      }
		      else {
		    	  sc.close();
		    	  throw new TeamName("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
		      }
		  	  }
		      catch(TeamName e) {
		        	 System.out.println(e.getMessage());
		      }
		  	  
	}	     

}