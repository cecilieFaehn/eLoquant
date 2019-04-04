package main;

public class NegativePriceException extends Exception{

	public NegativePriceException(){
	    System.out.println("You are trying to create a contract with a negative price.");
	  }  
	

}
