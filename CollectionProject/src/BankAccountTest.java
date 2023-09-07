import java.util.Iterator;

public class BankAccountTest {
	public static void main(String[] args) {
		int nums[]= {50,60,70};		
		for(int i=0;i<nums.length;i++) {
			System.out.println("num : "+nums[i]);
		}		
		BankAccount bankAccounts[]= new BankAccount[5000];
		bankAccounts[0] = new BankAccount(101, "Jack", 50000, "savings");
		bankAccounts[1] = new BankAccount(102, "Jane", 60000, "savings");
		bankAccounts[2] = new BankAccount(103, "Janet", 70000, "savings");
		bankAccounts[3] = new BankAccount(104, "Julie", 80000, "savings");
		bankAccounts[4] = new BankAccount(105, "Julia", 80000, "savings");	
		for(int i=0;i<bankAccounts.length;i++) {
			System.out.println("Acc : "+bankAccounts[i]);
		}
		
		for (BankAccount x : bankAccounts) {
			System.out.println("=> Bank account : "+x);
		}
	}
}
class BankAccount {
	static int count=0;
	private int position;
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	private String accountType;
	
	public BankAccount(int accountNumber, String accountHolder, double accountBalance, String accountType) {
		super();
		position=++count;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}
	
	public int getPosition() {
		return position;
	}

	public static int getCount() {
		return count;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + ", accountType=" + accountType + "]";
	}
	
	
}