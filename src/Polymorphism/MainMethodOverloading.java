package Polymorphism;

import java.util.*;

public class MainMethodOverloading {
	
	static void main() {
		System.out.println("main function without paramenter");
	}
	
	static void main(List<String> list) {
		System.out.println("main function with list array");
	}
	
	static void main( int a, String... arr) {
		System.out.println("hi how are you " + Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		main();
		main(10, "Navneet", "Ranjan", "Kumar");
		main(5, "Kumari", "Suhani");
	}

}
