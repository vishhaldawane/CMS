package com.cms.service;

public class Testing {
	public static void main(String[] args) {
		ATMClient atmClient = new ATMClient();
		atmClient.withdraw();
	}
}

class SavingsAccount
{
	void withdraw() {
		//..
		//..
		//..
		System.out.println("\t\tSavingsAccount: is checking its card number");
		System.out.println("\t\tSavingsAccount: is checking its min balance");
		System.out.println("\t\tSavingsAccount: withdraw()....");
		System.out.println("\t\tSavingsAccount: is subtracting its balance with dispensed amt");
		System.out.println("\t\tSavingsAccount: is updating the bank master ");
				
		//..
		//..
		//..
	}
}
class ATMServer
{
	SavingsAccount savingsAccount = new SavingsAccount();

	void withdraw() {
		
		//....
		//...
		//...
		System.out.println("\tATMServer: is authenticating the ATMClient Machine");
		System.out.println("\tATMServer: is authorizing the ATMClient Machine");
		System.out.println("\tATMServer: withdraw().....");
		savingsAccount.withdraw();		
		System.out.println("\tATMServer: is closing the authorizing of ATMClient Machine");
		System.out.println("\tATMServer: is closing the authenticating of ATMClient Machine");

		//..
		//..
		//...
		
	}
}
class ATMClient
{
	ATMServer atmServer = new ATMServer();

	void withdraw() 
	{
		//.....
		//....
		//....
		System.out.println("ATMClient: is askin PIN");
		System.out.println("ATMClient: is askin if receipt to print");
		
		System.out.println("ATMClient: withdraw().....");
		atmServer.withdraw();
		
		System.out.println("ATMClient: is closing the cash tray ");
		System.out.println("ATMClient: is closing the printer ");
		
		
		//..
		//..
		//..
		
		
	}
}
