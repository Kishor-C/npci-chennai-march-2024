package com.npci;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {
	public static void main(String[] args) {
		
		// anonymous implementation
		Comparator<Employee> salaryAsc = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o1.getSalary(), o2.getSalary());
			}
		};
		// copy the above anonymous class to sort the salary in descending order
		// copy the above anonymous class to sort the dob in descending order
		Comparator<Employee> dobDesc = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getDob().compareTo(o1.getDob());
			}
		};
		Set<Employee> employees = new TreeSet<>(dobDesc);
		employees.add(new Employee(10, "Raj", 300, LocalDate.parse("2001-10-12")));
		for(int i = 1; i <= 5; i++) {
			// LocalDate.parse("yyyy-MM-dd")
			Employee employee = new Employee(i, "Alex"+i, i*250, LocalDate.parse("2000-11-1"+i));
			employees.add(employee); // now set will have 5 employees
		}
		
		printEmployees(employees);
	}
	public static void printEmployees(Set<Employee> set) {
		for(Employee e : set) {
			System.out.println(e);
		}
		System.out.println("------------------------");
	}
}
