package com.Auowire.Auowire;


public abstract class BankAccountRepositoryImpl implements BankAccountRepository {
	
	private void BankAccountRepositoryImpl(){
	  BankAccount bankaccount = new BankAccount();
	  bankaccount.setAccountHolderName("Harry");
	  bankaccount.setAccountId(43);
	  bankaccount.setAccountType("Savings");
	  bankaccount.setAccountBalance((long) 2394.434);


	}
}
