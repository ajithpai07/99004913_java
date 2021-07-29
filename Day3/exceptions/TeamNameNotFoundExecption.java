package Exceptions;

public class TeamName extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//custom exception definition
	TeamName(String s){  
	  super(s);  
	}
}