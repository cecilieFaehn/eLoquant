package main;

public class NegativAmountException extends Exception{
	public NegativAmountException(){
	    System.out.println("You are trying to create a check with a negative amount.");
	  }  
}
