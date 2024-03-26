package com.npci;

public class TestStatic {
	public static void main(String[] args) {
		// accessing m2 directly from the class name
		A.m2();
		System.out.println("Accessing static from reference converts to class name");
		A a1 = new A();
		a1.m2(); // compiler converts a1.m2() to A.m2()
		A a2 = new A();
		a1.x = 77;
		a2.x = 88;
		a1.y = 99;
		a2.y = 98;
		A.y = 97;
		System.out.println("a1 y = "+a1.y); // since y is static last updated value it prints i.e., 97
		System.out.println("a1 x = "+a1.x); // since x is instance variable it prints 88
		System.out.println("a2 y = "+a2.y); // y is static so last updated value is 97
		System.out.println("a2 x = "+a2.x); // x is instance variable it prints 98
	}
}
