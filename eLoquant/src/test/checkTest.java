package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Check;
import main.NegativAmountException;

public class checkTest {

	@Test  
	public void testConvertToWord() {
		Check checkTest = new Check();
		
		checkTest.setBank("Banque de test");
		checkTest.setCustomer("Michel DeTest");
		checkTest.setIban("FR76 xxx xxx  xxx");
		
		checkTest.setAmount(2);
		assertTrue("Positive amount", checkTest.convertToWord() != "two");
		
		checkTest.setAmount(-10);
		assertTrue("Negative amount", checkTest.convertToWord() != "zero");
		
	}

}
