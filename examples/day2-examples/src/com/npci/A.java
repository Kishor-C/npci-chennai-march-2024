package com.npci;

public class A {
	int x = 10;
	static int y = 20;
	// m1() method is not static 
	public void m1() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	// m2() method is static: 
	//You cannot directly access non-static member inside static method
	public static void m2() {
		A a = new A();
		System.out.println("x = "+a.x);
		System.out.println("y = "+y);
	}
}
