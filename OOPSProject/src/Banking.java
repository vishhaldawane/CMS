
 public class Banking { //Banking.java
	 public static void main(String[] args) {
			System.out.println("this is from Banking");
			
			SavingsAccount savObj1 = new SavingsAccount();
			savObj1.setSavingsAccount(101, "Sandeep", 50000);
			savObj1.showAccount();
			
			//savObj1.accountBalance=50505050;
			savObj1.showAccount();
			
			//savObj1.accountBalance=-1000;
			savObj1.showAccount();

	 }
}
 class SavingsAccount {
	 
	 private int accountNumber;
	 private String accountHolder;
	 private float accountBalance;

	 void setSavingsAccount(int a, String b, float c) {
		 accountNumber=a;
		 accountHolder = b;
		 accountBalance= c;
	 }
	 void showAccount() {
		 System.out.println("Acc no   : "+ accountNumber);
		 System.out.println("Acc name : "+ accountHolder);
		 System.out.println("Acc bal  : "+ accountBalance);
		 
	 }
	 
}