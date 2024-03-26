package com.npci;

public class Student extends Person {
	private int rollNo;
	private double marks;
	
	public Student(int rollNo, String name, int age, double marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
		System.out.println("Student(int, String, int, double) called");
	}
	public Student() {
		super();
		System.out.println("Student() called");
	}
	
	@Override
	public void display() {
		System.out.println("---- Student Display ----");
		System.out.println("RollNo = "+rollNo+", Name = "+getName()+", Age = "+getAge()+", Marks = "+marks);
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
}
