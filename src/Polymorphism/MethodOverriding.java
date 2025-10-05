package Polymorphism;

class Bank {
	double roi(double d) {
		return 2 * d;
	}
	static void display(double d) {
		System.out.println("The value of roi is " +  d);
	}
}

class SBI extends Bank{
	
	@Override
	double roi(double d) {
		return 1.25 * d;
	}
	
	static void display(double d) {
		System.out.println("The total amount you got is " + d);
	}
}

class HDFC extends Bank{
	
	@Override
	double roi(double d) {
		return 1.4 * d;
	}
}

public class MethodOverriding {

	public static void main(String... args) {
		SBI s1 = new SBI();
		System.out.println(s1.roi(1000));
		SBI.display(s1.roi(1000));
		
		HDFC h1 = new HDFC();
		System.out.println(h1.roi(1000));
		
		Bank b1 = new Bank();
		System.out.println(b1.roi(1000));
	}
}
