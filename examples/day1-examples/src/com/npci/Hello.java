package com.npci;

public class Hello {
	public static void main(String[] args) {
		// sysout
		System.out.println("Welcome to eclipse");
		
		// command line argument is optional
		// args can have any other name also
		for(String s : args) {
			System.out.println(s);
		}
	}
}
