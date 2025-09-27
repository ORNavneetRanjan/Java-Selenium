package Mutablity;

public class StringComparision {

	public static void main(String[] args) {
		// == : to compare the objects
		// equals : to compare the values of objects
		
		// don't affect anything if string is created like this
		String s1 = "welcome";
		String s2 = "welcome";
		
		System.out.println(s1 == s2); //true
		System.out.println(s1.equals(s2)); //true
		
		// case 2
		s1 = new String("welcome");
		s2 = new String("welcome");
		
		System.out.println(s1 == s2); 
		System.out.println(s1.equals(s2)); 
		
		//case 3
		s1 = "welcome";
		s2 = new String("welcome");
		System.out.println(s1 == s2); 
		System.out.println(s1.equals(s2));
		
		// case 4
		s1 = "abc";
		s2 = new String("abc");
		String s3 = s2;
		
		System.out.println(s2 == s3); // true
		System.out.println(s2.equals(s2)); // true
		
		
		
	}

}
