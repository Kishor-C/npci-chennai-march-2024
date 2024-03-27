package com.npci;

import java.time.LocalDate;

public class TestInbuiltClasses {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate another = LocalDate.parse("1970-10-25");
		System.out.println("Today = "+today); // invokes today.toString() 
		System.out.println("Another = "+another); // invokes another.toString()
		
		Employee employee1 = new Employee(123, "Alex", 45000.35);
		Employee employee2 = new Employee(144, "Brad", 65000.35);
		System.out.println(employee1); // employee1.toString()
		System.out.println(employee2); // employee2.toString()
		
		System.out.println("--- Comparing two numbers -----");
		System.out.println("10 with 20 = "+Integer.compare(10, 20));
		System.out.println("10.0 with 10.0 = "+Double.compare(10.0, 10.0));
		String s1 = "hello";
		String s2 = "Hello";
		System.out.println("hello with Hello = "+s1.compareTo(s2)); // 104 - 72 +ve
		System.out.println("hello with hello = "+s1.compareTo(s1)); // 104 - 104 = 0
 		System.out.println("Hello with hello = "+s2.compareTo(s1)); // 72 - 104 = -ve
 		System.out.println("----Comparing two dates ------");
 		System.out.println("today with another: "+today.compareTo(another)); // 2022 - 1970 +ve 
 		System.out.println("today with today: "+today.compareTo(today)); // 0
 		System.out.println("another with today: "+another.compareTo(today)); // 1970 - 2022 -ve
	}
}
