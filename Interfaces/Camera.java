package Interfaces;

public interface Camera {
	int a=100;
	void click();
	
	static void m1() {
		System.out.println("it is a static method in camera interface");
	}
	
	default void m2() {
		System.out.println("it is a default method......");
	}
}
