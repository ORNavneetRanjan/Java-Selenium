package Inheritence;

class Parent {
	int value1 = 10;
	void dispaly(int n) {
		System.out.println(n);
	}
}

class Child1 extends Parent{
	int value1 = 100;
	int value2 = 300;
}

class Child2 extends Parent{
	int value1 = 20;
	int value3 = 400;
}

public class HierarchyInheritence {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.dispaly(c1.value1);
		c1.dispaly(c1.value2);
		
		Child2 c2 = new Child2();
		c2.dispaly(c2.value1);
		c2.dispaly(c2.value3);
		
		Parent p1 = new Child1();
		p1.dispaly(p1.value1);
		
		p1 = new Child2();
		p1.dispaly(p1.value1);

	}

}
