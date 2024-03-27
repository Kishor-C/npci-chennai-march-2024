package com.npci;

/*
 * In Real time you create interfaces, sub classes in separate java files
 */
interface Vehicle { 
	void wheels(); // by default it is public abstract void wheels()
	void mileage(); // by default it is public abstract void mileage()
}
// we can provide logics for wheels but not for mileage in the Car & Bike hence we need to make 
// them abstract
abstract class Car implements Vehicle {
	public void wheels() { 	System.out.println("4 wheeler"); 	}
}
abstract class Bike implements Vehicle {
	public void wheels() { 	System.out.println("2 wheeler"); 	}
}
// create another class Bike and implement wheels
// create 3 subclasses for Car & Bike and implement mileage to print the respective values
class I20 extends Car {
	public void mileage() { System.out.println("I20 mileage: 22kmpl"); }
}
class Nexon extends Car {
	public void mileage() { System.out.println("Nexon mileage: 20kmpl"); }
}
class Brezza extends Car {
	public void mileage() { System.out.println("Brezza mileage: 24kmpl"); }
}
class KTM extends Bike {
	public void mileage() { System.out.println("KTM mileage: 40kmpl"); }
}
class Pulsar extends Bike {
	public void mileage() { System.out.println("Pulsar mileage: 45kmpl"); }
}
public class TestAbstraction {
	// Developer code at the client side
	public static void m1(Vehicle v) {
		v.mileage(); // runtime polymorphism
		v.wheels(); // runtime polymorphism
		System.out.println("------------------------");
	}
	// main method that can supply the objects to the m1 method
	public static void main(String[] args) {
		Nexon nexon = new Nexon();	I20 i20 = new I20();	Brezza brezza = new Brezza();
		KTM ktm = new KTM();		Pulsar pulsar = new Pulsar();
		m1(pulsar);		m1(ktm);	m1(brezza);		m1(i20);	m1(nexon);
	}
}
