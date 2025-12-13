package Keywords;

final class A {
	int x = 10;
	void display() {
		System.out.println("The value of x is "+ x);
	}
}

/*
 * cannot extend a final class B extends A {
	
}
*/
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.x++;
		a.display();
	}

}
