package Strings;

import java.util.Arrays;

public class StringMethos {
	public static void main(String[] args) {
		//length
		String s = "Navneet";
		System.out.println("The length of the string is " + s.length());
		
		//concat() - joining strings
		String s1 = "Welcome";
		String s2 = " To java";
		
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		
		String s3 = " Navneet";
		System.out.println(s1.concat(s2.concat(s3)));
		
		//trim() - remove spaces from left and right side
		s = "  welcome to java   ";
		System.out.println(s.trim());
		
		//charAt()
		s1 = "welcome";
		System.out.println(s.charAt(2));
		
		//contains() - checks string is the part of the parent string or not
		System.out.println(s.contains(s1));
		System.out.println(s.contains(s2));
		
		//equals() , equalsIgnoreCase() : compare strings
		s2 = "Welcome";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//replace() : replace single/multiple(sequence) of characters in a string
		s1 = "welcome to selenium java course Navneet, Welcome";
			//single character
		System.out.println(s1.replace('e', 'X'));
		System.out.println(s1.replace("welcome", "ranjan"));
		System.out.println(s1);
		
		//substring() : extract some string from one string
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 13));
		
		//toLowerCase() , toUpperCase()
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//split() : split the string into multiple parts based on delimiter
		s = "1, 2, 3, 4, 5"; 
		String[] arr = s.split(", ");
		System.out.println(Arrays.toString(arr));
		
	}
}
