package com.npci;

public class TestInheritance {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println("___________________________");
		Employee emp2 = new Employee(123, "Alex", 35, 40000);
		Student s1 = new Student(1, "Ajay", 18, 80);
		Customer c1 = new Customer(100, "Charles", 40, "SBI");
		Person p1 = new Person("Sachin", 49);
		m1(emp2); // p = emp2 >> p.display() calls on Employee
		m1(s1); // p = s1 >> p.display() calls on Student
		m1(c1); // p = c1 >> p.display() calls on Customer
		m1(p1); // p = p1 >> p.display() calls on Person
//		// accessing the inheritted methods in Employee like getters, setters & display
//		emp1.display(); // calls Person display if Employee has not overridden display
//		emp2.display(); // calls Person display if Employee has not overridden display
//		s1.display();
//		c1.display();
	}
	// calls display() on a Person reference
	public static void m1(Person p) {
		p.display(); // runtime polymorphism occur here - gives multiple results
	}
}
