package io.betterbanking.OpenBankingApp.transaction;

import java.util.Date;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @NoArgsConstructor @ToString
public class Transaction {

	private String type;
	private Date date;
	private String accountNumber;
	private String currency;
	private double amount;
	private String merchentName;
	private String merchantLogo;
	public Transaction(String type, Date date, String accountNumber, String currency, double amount,
			String merchentName, String merchantLogo) {
		super();
		this.type = type;
		this.date = date;
		this.accountNumber = accountNumber;
		this.currency = currency;
		this.amount = amount;
		this.merchentName = merchentName;
		this.merchantLogo = merchantLogo;
	}
	
	
	
	
}
