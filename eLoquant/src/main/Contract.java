package main;

import java.util.Locale;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;

public class Contract extends AdminPaper{
	private double price;
	private double tva;
	
	public Contract() {
		price = 0;
		tva = 0;
	}
	
	public Contract(double price, double tva, String customer) throws NegativePriceException{
		super();
		if(price < 0) 
			throw new NegativePriceException();
		else {
			this.price = price;
			this.tva = tva;
			this.customer = customer;
		}
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTva() {
		return tva;
	}
	public void setTva(double tva) {
		this.tva = tva;
	}
	
	public String convertToWord() {
		String result = " ";
		
		//conversion
		NumberFormat formatter = new RuleBasedNumberFormat(Locale.ENGLISH ,RuleBasedNumberFormat.SPELLOUT);
		
		result = formatter.format(this.price);
		
		return result;
	}
}
