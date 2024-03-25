package com.npci;

public class TestLoops {
	public static void main(String[] args) {
		int[] items = {20, 10, 50, 30, 40};
		// another way to create array: int[] items = new int[5]; // items = {0, 0, 0, 0, 0}
		// you must initialize one by one using items[0] = 20, items[1] = 10 and so on
		System.out.println("Items length: "+items.length);
		for(int index = 0; index < items.length; index++) {
			System.out.println("item at "+index+" is: "+items[index]);
		}
		System.out.println("---- for each ----");
		for(int element : items) {
			System.out.println("Element: "+element);
		}
		System.out.println("---- do while loop -----");
		int counter = 5;
		do {
			counter++;
			System.out.println("do while is iterating");
		} while(counter < 5);
	}
}
