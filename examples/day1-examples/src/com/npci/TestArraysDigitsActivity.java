package com.npci;

import java.util.Scanner;

public class TestArraysDigitsActivity {
	public static void main(String[] args) {
		// finding sum, max and min from an array
		int[] items = {5, 10, 4, 3, 8, 9};
		int sum = 0;	int max = 0;	int min = items[0];
		for(int i : items) {
			sum = sum + i;
			if(i > max) { max = i; 	}
			if(i < min) { min = i;  }
		}
		System.out.println("Sum = "+sum+", Max = "+max+", Min = "+min);
		// digits in words
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 digits");
		String digits = scan.next();
		for(int i = 0; i < digits.length(); i++) {
			char value = digits.charAt(i);
			switch(value) {
			case '0' : System.out.println("Zero"); break;
			case '1' : System.out.println("One"); break;
			case '2' : System.out.println("Two"); break;
			case '3' : System.out.println("Three"); break;
			case '4' : System.out.println("Four"); break;
			case '5' : System.out.println("Five"); break;
			case '6' : System.out.println("Six"); break;
			case '7' : System.out.println("Seven"); break;
			case '8' : System.out.println("Eight"); break;
			case '9' : System.out.println("Nine"); break;
			}
		}
		scan.close();
	}
}
