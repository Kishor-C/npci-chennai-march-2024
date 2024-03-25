package com.npci;

import java.util.Scanner;

public class TestInput {
	public static void main(String[] args) {
		// Type Scan and control + space to import Scanner from java.util
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username:");
		String username = scan.next();
		System.out.println("Enter phone:");
		long phone = scan.nextLong();
		System.out.println("Username = "+username+", Phone = "+phone);
		System.out.println("Enter some comments:-");
		// nextLine() can accept enter key or multiple strings with enter key both
		scan.nextLine();
		String comments = scan.nextLine();
		System.out.println("Comments: "+comments);
		// at the end scan.close() must be called to release the resource from the memory
		// this is done only for objects that uses external resources like Scanner 
		scan.close();
	}
}
