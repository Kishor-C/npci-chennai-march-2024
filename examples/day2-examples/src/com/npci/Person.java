package com.npci;

public class Person {
	private String name;
	private int age;
	public Person() {
		System.out.println("Person() called");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(String, int) called");
	}
	// display method to print name & age
	public void display() {
		System.out.println("----- Person Display -----");
		System.out.println("Name = "+name+", Age = "+age);
		System.out.println("__________________________________________");
	}
	// getters and setters: getter returns the data, setter accepts the data to modify & returns void
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
