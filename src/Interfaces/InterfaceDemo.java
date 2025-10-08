package Interfaces;



interface Shape {
	int length = 0; // by default this variable is final and static
	int width = 20;
	
	//by default all method are abstract method
	void circle() ; // abstract method
	
	//static method 
	static void reactangle() {
		System.out.println("This is reactangle");
	}
	//default method
	default void square() {
		display();
		System.out.println("This is square");
	}
	
	private void display() {
		System.out.println("the side are " + Shape.length + Shape.width);
	}
}





public class InterfaceDemo implements  Shape{
	public int n = 0;
	public void circle() {
		System.out.println("This is circle");
	}
	public static void main(String[] args) {
		
		//  1. class -> class
		InterfaceDemo id = new InterfaceDemo();
		id.square();
		id.circle();
		Shape.reactangle();
		//System.out.println(id.length) 	this works but not a good practice
		/* 		2. class -> interface 
		 InterfaceDemo id = new Shape(); this is not possible as an interface cannot be instantiated 
		
		 		3. interface -> interface 
		 also not possible for the same reason
		
		  	4. interface -> class */
		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();
		// System.out.prinlnt(sh.n); error as n is not a part of interface shape
		

	}

}
