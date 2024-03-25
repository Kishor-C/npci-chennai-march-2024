package com.npci;

public class User {
	// instance variables
	String name;
	int age;
	
	public User() {
		System.out.println("User() created");
	}
	
	public User(String n, int a) {
		System.out.println("User(String, age) created");
		name = n;
		age = a;
	}
	
	public void display() {
		System.out.println("---- display() called ------");
		System.out.println("Name = "+name+", age = "+age);
	}
}
