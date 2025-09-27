package Mutablity;

public class stringVsStringbuilder {

	public static void main(String[] args) {
		String s = "Welcome";
		s.concat(" to java.");
		
		StringBuilder str = new StringBuilder("My name is Navneet ");
		str.append("Ranjan");
		
		System.out.println(s);
		System.out.println(str);

		StringBuffer st = new StringBuffer("This is it");
		st.append(" baby.");
		System.out.println(st);
		
	}

}
