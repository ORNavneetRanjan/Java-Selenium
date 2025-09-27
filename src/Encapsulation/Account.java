package Encapsulation;

public class Account {
	
	private long accountNo;
	private String name;
	private int amount;
	private long mobileNumber;
	
	Account(String name, long mobileNumber){
		this.accountNo = generateAccountNumber();
		this.name = name;
		this.amount = 0;
		this.mobileNumber = mobileNumber;
	}
	
	Account(String name,long mobileNumber ,int amount){
		this.accountNo = generateAccountNumber();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.amount = amount;
	}
	
	public long getAccountNumber(String name, int otp) {
		return this.accountNo;
	}
	
	public void credit(int amount) {
		this.amount += amount;
		System.out.println("The amount " + amount + " is credited to your account ending with XXX"
				+ this.accountNo % 10000);
	}
	
	public void withdraw(int amount) {
		if(this.amount < amount) {
			System.out.println("Not enough balance in your account");
			return;
		}
		this.amount -= amount;
		System.out.print("The amount " + amount + " is debited from your account ending with XXX"
				+ this.accountNo % 10000);
	}
	
	public void viewDetails() {
		System.out.println("Here are your details");
		System.out.println("-".repeat(20));
		System.out.println("Account holder: " + this.name);
		System.out.println("Account number: XXXXXX" + this.accountNo % 10000);
		System.out.println("Account balance: Rs." + this.amount);
		System.out.println("Mobile number: XXXXXX" + this.mobileNumber % 10000);
	}
	
	private long generateAccountNumber() {
		// Math.random() generate from [0.0, 1.0) , hence after multiplying it will generate
		// from [0, 8_999_999_999);
		long number = 1_000_000_000L + (long)(Math.random() * 9_000_000_000L);
		return number;
		
	}
}
