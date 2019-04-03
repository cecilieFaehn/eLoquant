package main;

import java.util.Locale;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;

public class Check extends AdminPaper{
	private double amount;
	private String bank;
	private String iban;
	
	public Check(double amount, String bank, String iban, String customer) {
		super();
		this.amount = amount;
		this.bank = bank;
		this.iban = iban;
		this.customer = customer;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public String convertToWord() {
		String result = " ";
		
		//conversion
		NumberFormat formatter = new RuleBasedNumberFormat(Locale.ENGLISH ,RuleBasedNumberFormat.SPELLOUT);
		
		result = formatter.format(this.amount);
		
		return result;
	}
	
}
