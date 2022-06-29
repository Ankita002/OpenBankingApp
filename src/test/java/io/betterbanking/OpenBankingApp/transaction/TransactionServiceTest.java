package io.betterbanking.OpenBankingApp.transaction;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TransactionServiceTest {
	TransactionService transactionService;
	
	@BeforeEach
	void setUp() {
		transactionService=new TransactionService();
		
	}

	@Test
	@DisplayName("Getting dummy transactions should work")
	void testFindAllByAccountNumber() {
		assertEquals(2,transactionService.findAllByAccountNumber("123").size(),"Getting dummy transactions should work");
	}
}
