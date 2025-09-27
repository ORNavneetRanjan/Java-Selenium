package Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		Account firstAccount = new Account("Navneet", 9931330202L);
		
		firstAccount.credit(25000);
		firstAccount.viewDetails();
		System.out.println(firstAccount.getAccountNumber("Navneet", 0));
		firstAccount.withdraw(100000);
		firstAccount.withdraw(2000);
		firstAccount.viewDetails();
		
		Account secondAccount = new Account("Ranjan", 9709439155L,
			  1000);
		
		secondAccount.viewDetails();
		System.out.println(secondAccount.getAccountNumber("Ranjan", 0));
	}

}
