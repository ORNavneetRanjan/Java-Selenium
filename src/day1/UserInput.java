package day1;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int num = sc.nextInt();
			
			System.out.println("Enter a string: ");
			String s = sc.findInLine("121");
			
			System.out.println(s + num);
		}
	}
	
	
	
}
