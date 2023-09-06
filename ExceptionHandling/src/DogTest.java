
public class DogTest {
	public static void main(String[] args) {
		
		System.out.println("Begin...");
		
		try {
			Dog dog1 = new Dog("Tommy",12);
			dog1.showDog();
		}
		catch(RuntimeException e) {
			System.out.println("Some Problem : "+e);
		}
		
		System.out.println("-------");
		
		try
		{
			SavingsAccount savAcc = new SavingsAccount(101, "Jack", 65000, "Sa234vings");
			System.out.println("sav : "+savAcc);
		}
		catch(RuntimeException e) {
			System.out.println("SOME PROBLEM : "+e); //toString() of e
		}
		
		System.out.println("End...");
		
	}
}


class SavingsAccount
{
	int accountNumber;
	String accountHolderName;
	float accountBalance;
	String accountType;
	
	public SavingsAccount(int accountNumber, String accountHolderName, float accountBalance, String accountType) {
		super();
		System.out.println("==> SavingsAccount ctr started...");
		
		if(accountNumber < 0) {
			//System.out.println("Account number cannot be negative...");
			throw new RuntimeException("Account number cannot be in negative...");
			
		}
		else {
			this.accountNumber = accountNumber;
		}
		
		if(accountHolderName.matches("[a-zA-Z]*")) {
			this.accountHolderName = accountHolderName;
					
		}
		else {	
		//	System.out.println("Account holder name must contain alphanets..");
			throw new RuntimeException("Account holder name must contain alphanets..");
			
		}
		
		if(accountBalance < 5000) {
			//System.out.println("Account opening balance must be more than 5000");
			throw new RuntimeException("Account opening balance must be more than 5000");
		}
		else {
			this.accountBalance = accountBalance;
		}
		
		
		if(accountType.equals("Savings") || accountType.equals("Current") || accountType.equals("Credit")) {
			this.accountType = accountType;
		}
		else {
			//System.out.println("Invalid account type : it must be Savings | Current | Credit");
			throw new RuntimeException("Invalid account type : it must be Savings | Current | Credit");
		}
		
		System.out.println("==> SavingsAccount ctr over......");

	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", accountType=" + accountType + "]";
	}
	
	
	
}

class Dog
{
	String name;
	int age;
	
	public Dog(String name, int age) {
		super();

		System.out.println("==> Dog(name,int)...STARTED");
		
		this.name = name;
		if(age>14) {
			//System.out.println("Dogs age cannot exceed 14");
			throw new RuntimeException("Dogs age cannot exceed 14");
		}
		else  if(age < 0 ){
			throw new RuntimeException("Dogs age cannot be in negative...");
		
		}
		else {
			this.age = age;
		}
		
		System.out.println("==> Dog(name,int)...FINISHED");

	}
	
	void showDog() {
		System.out.println("name : "+name);
		System.out.println("age  : "+age);
		
	}
	
	
}
