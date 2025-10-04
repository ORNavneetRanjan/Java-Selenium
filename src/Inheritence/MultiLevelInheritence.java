package Inheritence;

class A {
	int a = 100;
	void display(int n) {
		System.out.println(n);
	}
}

class B extends A{
	int b = 200;
	
}

class C extends B {
	
	int b = 300;
	
}

public class MultiLevelInheritence {

	public static void main(String[] args) {
		C c = new C();
		c.display(c.b);
		
		
		B b = new C();
		b.display(b.b);
	}

}
