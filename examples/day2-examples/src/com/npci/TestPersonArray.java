package com.npci;

import java.util.Scanner;

public class TestPersonArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array to store objects:-");
		int size = scan.nextInt();
		// initialize the Person[] of the size
		Person[] persons = new Person[size]; // if size = 3, then persons = [null, null, null]
		int counter = 0; // to track how many elements stored in the array
		int option = 0; // to take menu option at runtime
		do {
			System.out.println("Enter option");
			System.out.println("1: Student 2: Employee 3: Customer 4: Display All 5: Exit");
			option = scan.nextInt();
			switch(option) {
			case 1: 
				System.out.println("Enter rollno");
				int rollNo = scan.nextInt();
				System.out.println("Enter name");
				String name = scan.next();
				System.out.println("Enter age");
				int age = scan.nextInt();
				System.out.println("Enter marks");
				double marks = scan.nextDouble();
				Student student = new Student(rollNo, name, age, marks);
				persons[counter++] = student;
				break;
			case 2: 
				System.out.println("Enter id");
				int id = scan.nextInt();
				System.out.println("Enter name");
				name = scan.next();
				System.out.println("Enter age");
				age = scan.nextInt();
				System.out.println("Enter salary");
				double salary = scan.nextDouble();
				Employee employee = new Employee(id, name, age, salary);
				persons[counter++] = employee;
				break;
			case 3: 
				break;
			case 4: 
				for(Person p : persons) {
					// check for null before invoking m1
					if(p != null)
					TestInheritance.m1(p);
				}
				break;
			
			
			}
		} while(option != 5 && counter < size);
		
		scan.close();
	}
}
