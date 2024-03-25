package com.npci;

public class TestUser {
	public static void main(String[] args) {
		// it is used to even test the code you have written
		User u1 = new User(); // u1 [name = null, age = 0]
		u1.display();
		User u2 = new User("Raj", 30); // u2 [name = "Raj", age = 30]
		User u3 = new User("Vijay", 40); // u3 [name = "Vijay", age = 40]
		u2.display();
		u3.display();
	}
}
