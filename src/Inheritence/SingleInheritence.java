package Inheritence;

//class A {
//	int a = 100;
//	void display(int n) {
//		System.out.println(n);
//	}
//}
//
//class B extends A{
//	int b = 200;
//	
//}

public class SingleInheritence {

	public static void main(String[] args) {
		B b = new B();
		b.display(b.a);
		b.display(b.b);

	}

}
