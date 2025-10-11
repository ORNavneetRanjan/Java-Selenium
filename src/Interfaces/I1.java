package Interfaces;

interface I {
	int y = 10;
	void func();
	
}

public interface I1 extends I{
	int x = 10;
	void m2();
	default void m() {
		System.out.println("We are under I1");
	}
}
