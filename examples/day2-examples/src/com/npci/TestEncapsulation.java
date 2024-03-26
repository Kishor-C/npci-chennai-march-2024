package com.npci;

public class TestEncapsulation {
	public static void main(String[] args) {
		Person person1 = new Person("Alex", 30);
		Person person2 = new Person("Brad", 40);
		person1.display();
		person2.display();
		// update age of both the person 
		person1.setAge(32);
		person2.setAge(42);
		person1.display();
		person2.display();
	}
}
