package Keywords;

class Test{
	static int x = 100;
	
	final void display() {
		System.out.println("This is final function and the value of x is " + x );
	}
	
	void increase() {
		x++;
	}
}

class Test1 extends Test {
	void increase() {
		x--;
	}
	
	/*
	 * cannot override final method
 	void display() {
		
	}
	*/
}

public class finalKeyword {

	
	public static void main(String[] args) {
		Test t = new Test();
		// t.x = 100; we cannot change the value of a final variable 
		t.display();
		Test1 t1 = new Test1();
		t1.increase();
		t1.display();
		
	}

}
