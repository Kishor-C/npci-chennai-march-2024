package com.npci;


public class TestTypesAndOperators {
	public static void main(String[] args) {
		int employeeId = 12345;
		double salary = 45000;
		char gender = 'M';
		double salaryAfterIncrease = (salary * 1.1); //salaryAfterIncrease = 49500
		System.out.println("Employee id = "+employeeId);
		System.out.println("Gender = "+gender);
		System.out.println("Salary before increase = "+salary);
		System.out.println("Salary after increase = "+salaryAfterIncrease);
		// printing multiple values in a single line
		System.out.println("Id = "+employeeId+", Salary = "+salary);
		// you can use inbuilt class String to store multiple characters
		String username = "user1234";
		System.out.println("Username = "+username);
		// int, double, char are primitives, String is a class
		// you can always access inbuilt methods from the class on its object
		char ch = username.charAt(3);
		System.out.println("Char At 3: "+ch);
		int size = username.length(); // returns the number of characters in a string
		System.out.println("Size of characters in username: "+size);
		// long values can take almost 19 digits
		long phone = 9988998844L;
		System.out.println("Phone = "+phone);
	}
}
