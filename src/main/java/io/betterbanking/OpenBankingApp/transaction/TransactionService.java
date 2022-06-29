package io.betterbanking.OpenBankingApp.transaction;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {
 ArrayList<Transaction> transactions=new ArrayList<>();
 
 public ArrayList<Transaction> findAllByAccountNumber(String accNumber){
	 transactions.add(new Transaction("Saving",new Date(),accNumber,"INR",50000,"ABC","ABCLogo"));
	 transactions.add(new Transaction("Current",new Date(),accNumber,"USD",50000,"XYZ","XYZLogo"));

	 return transactions;
	 
 }

}
