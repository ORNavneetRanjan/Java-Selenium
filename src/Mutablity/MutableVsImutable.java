package Mutablity;

import java.util.Arrays;

public class MutableVsImutable {

	public static void main(String[] args) {
		//mutable - can Change
		int a[] = {2, 4, 3, 2, 5};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//immutable 
		String s = new String("welcome ");
		String newS = s.concat("to java.");
		System.out.println(s);
		System.out.println(newS);
		
	}

}
