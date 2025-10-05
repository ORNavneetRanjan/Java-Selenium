package Keywords;

class Parent{
	int x ;
	/*
	Parent (){
		this.x = 0;
	}
	*/
	Parent(int x){
		this.x = x;
	}
	void display() {
		System.out.println("The current value of x is : " + x);
	}
}

class Child extends Parent{
	int y = 0;
	Child(int x, int y){
		super(x);
		this.y = y;
	}
	@Override
	void display() {
		super.display();
		System.out.println("The current value of y is : " + y);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child(1, 2);
		c.display();
	}

}
