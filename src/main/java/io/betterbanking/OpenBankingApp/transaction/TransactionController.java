package io.betterbanking.OpenBankingApp.transaction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
	
@Autowired
 TransactionService transactionService;
 @GetMapping("/transactions/{accNo}")
 public List<Transaction>	getTransactions(@PathVariable String accNo ) {
	
	 return transactionService.findAllByAccountNumber(accNo);
	 
 }
	
	
}
