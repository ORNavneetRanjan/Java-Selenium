package Interfaces;

public class C1 extends InterfaceDemo implements I1,  I2 {
	
	@Override
	public void m(){
		I1.super.m();
		System.out.println(I1.x);
	}
	
	public void m2() {
		I1.super.m();
		System.out.println(I2.y);
	}
	
	public static void main(String[] args) {
		C1 obj = new C1();
		obj.m();
		obj.m2();
	}

}
