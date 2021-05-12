package com.Auowire.Auowire;

public class BankAccountController{

	
	BankAccountServiceImpl bankaccountS = new BankAccountServiceImpl() {
		
		public double withdraw(long accountId, double balance) {
			// TODO Auto-generated method stub
			return withdraw(323902,1301);
		}
		
		public double getBalance(long accountId) {
			// TODO Auto-generated method stub
			return getBalance(342);
		}
		
		public boolean fundTransfer(long fromAccount, long toAccount, double aount) {
			// TODO Auto-generated method stub
			return false;
		}
		
		public double deposit(long accountId, double balance) {
			// TODO Auto-generated method stub
			return deposit(1000, 1000);
		}
	};

	public void withdraw() {
		// TODO Auto-generated method stub
		return;
	}
	
	
}

