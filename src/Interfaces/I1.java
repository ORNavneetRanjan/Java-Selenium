package Interfaces;

public interface I1 {
	int x = 10;
	void m2();
	default void m() {
		System.out.println("We are under I1");
	}
}
