package com.npci;
// inherits setters & getters and other methods excluding private & constructor of Person
public class Employee extends Person {
	private int id;
	private double salary;
	// constructor that initializes id, name, age and salary
	public Employee(int id, String name, int age, double salary) {
		super(name, age); // calls Person(String name, int age)
		this.id = id;
		this.salary = salary;
		System.out.println("Employee(int, String, int, double) called");
	}
	public Employee() {
		// super(); is automatically added by the compiler
		System.out.println("Employee() called"); // this is not present in the 1st line 
	}
	// override the display
	@Override
	public void display() {
		System.out.println("---- Employee Display ----");
		System.out.println("Id = "+id+", Name = "+getName()+", Age = "+getAge()+", Salary = "+salary);
	}
	// generate setters & getters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
