package com.npci;

public class Customer extends Person {
	private int customerId;
	private String bankName;
	public Customer(int customerId, String name, int age, String bankName) {
		super(name, age);
		this.customerId = customerId;
		this.bankName = bankName;
		System.out.println("Customer(int, String, int, String) called");
	}
	public Customer() {
		super();
		System.out.println("Customer() called");
	}

	@Override
	public void display() {
		System.out.println("---- Customer Display ----");
		System.out.println("Id = "+customerId+", Name = "+getName()+", Age = "+getAge()+", Bank = "+bankName);
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
}
