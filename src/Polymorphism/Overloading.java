package Polymorphism;

public class Overloading {

	void func(int a) {
		System.out.println("This is a single Integer function");
	}
	
	void func(int a, int b) {
		System.out.println("This is a double Integer function");
	}
	
	void func(double a, int b) {
		System.out.println("This is a single double and single Integer function");
	}
	
	void func(int a, double b) {
		System.out.println("This is a single Integer and a single double function");
	}
	
	public static void main(String[] args) {
		Overloading od = new Overloading();
		od.func(0.1, 3);
		od.func(9.8, 1);
		

	}

}
