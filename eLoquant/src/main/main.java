package main;

import java.util.Locale;
import java.util.Scanner;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String checkConverted;
		String contractConverted;
		
		Check check150 = new Check(150, "ING Direct", "FR76 450 255 2222 0000", "Michel");
		Contract contract28 = new Contract(28, 5, "Jean");
		
		
		checkConverted = check150.convertToWord();
		contractConverted = contract28.convertToWord();
		System.out.println("montant du chèque converti :  " + checkConverted);
		System.out.println("prix du contrat converti :  " + contractConverted);
	}
}
