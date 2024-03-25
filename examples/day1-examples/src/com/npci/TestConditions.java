package com.npci;

import java.util.Scanner;

public class TestConditions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = scan.nextInt();
		if(marks >= 70) {
			System.out.println("A+");
		} else if(marks < 70 && marks >= 60) {
			System.out.println("A");
		} else if(marks < 60 && marks >= 50) {
			System.out.println("B");
		} else {
			System.out.println("D");
		}
		// for switch you can pass int, char or string
		System.out.println("Enter a name");
		String name = scan.next();
		System.out.println("Enter a gender");
		char gender = scan.next().toUpperCase().charAt(0);
		switch(gender) {
			case 'M': System.out.println("Hello Mr."+name); 
			break;
			case 'F': System.out.println("Hello Ms."+name);
			break;
			default: System.out.println("Enter gender either M or F with uppercase");
		}
		scan.close();
	}
}
