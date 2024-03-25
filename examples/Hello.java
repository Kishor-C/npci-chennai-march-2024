// this is a Hello.java file
/*
	Naming conventions: 
	File names & class names first letter must be capital followed by lower case, if they have more than one word use camel case
	variables & method names first letter must be lowercase followed by lower case, if there are more than one word use camel case 
	ex for class names: HelloWorld, Employee, CustomerService
	ex for method names: register(), blockCards()
*/

class HelloWorld { 
	// main method is the entry point, it takes String as an argument, String is an inbuilt class, hence it begins with uppercase
	// to print anything in the console use System.out.println, System is also an inbuilt class, hence it starts with uppercase
	
	public static void main(String[] args) {
		System.out.println("Welcome to our first java program");
	}
}
/*
	Note: a class must have { and },  inside these { & } we can have methods & variables
		a method must also have { & }
	Note: To compile :::: javac Hello.java :::: creates ::::: HelloWorld.class :::::: To execute ::::::::::: java HelloWorld
*/


