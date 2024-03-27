package com.npci;

import java.sql.SQLException;
import java.util.Scanner;

public class TestExceptions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount");
		double amt = scan.nextDouble();
		try {
			debit(amt);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
			System.err.println("----------------------");
			System.err.println(e);
		}
		scan.close();
//		for(int i = 1; i <= 5; i++) {
//			// Thread.sleep(long) will make the execution to pause for the time given
//			// it has a signature public static void sleep(long ms) throws InterruptedException
//			try {
//				Thread.sleep(1000); // 1000ms = 1s
//				m1(i);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				System.out.println("This block is finally");
//			}
//			System.out.println("i = "+i);
//		}
	}
	// a method that can throw Insufficient balance exception
	public static void debit(double amount) throws InsufficientBalanceException {
		double balance = 5000;
		if(amount > balance) {
			throw new InsufficientBalanceException("Tx falied: amount = "+amount+", balance = "+balance);
		}
		balance = balance - amount;
		System.out.println("Amount debited, balance = "+balance);
	}
	// a method to manually throw the SQLException
	public static void m1(int x) throws SQLException, ArithmeticException {
		if(x >= 3) {
			throw new SQLException("DB might be down");
		}
		if(x >= 2) {
			throw new ArithmeticException("You might have divided a number by 0");
		}
	}
}
