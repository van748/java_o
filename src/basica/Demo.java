package basica;

class Person {
	String name;
	String email;
	String phone;

	void walk() {
		System.out.println(name + " is walking");
	}

	void sleep() {
		System.out.println(name + " is sleeping");
	}

	void eat() {
		System.out.println(name + " is eating");
	}

}

public class Demo {

	public static void main(String[] args) {

		// Instantiating an object
		// Create a variable and point to the CLASS Person which we define up this code
		// This NEW key word (operator) that we use is java allocating space for the
		// variable person1
		Person person1 = new Person();

		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7897897894";

		// This we call ABSTRATION because we only want the elements that is necessary
		// for us this time
		person1.walk();

		// Maybe we dt care now and later we call this methods
		// So we can abstract or extract the parts that we do not need
		person1.sleep();
		person1.eat();

		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@testemail.com";
		person2.phone = "3213216548";
		person2.sleep(); // We can call by ABSTRATION only what we want

		/*
		 * Person
		 * 
		 * // Attributes, variables, adjective, descriptors String name = "Joe"; String
		 * email = "joe@testemail.com"; String phone = "7897897894";
		 * 
		 * // Action, activity, behavior // System.out.println(name + " is walking");
		 * walking(name); System.out.println(name + " is eating");
		 * 
		 * // What if we wanted to do this for another person? String name2 = "Sarah";
		 * String email2 = "sarah@testemail.com"; String phone2 = "3213216548";
		 * 
		 * // Action, activity, behavior // System.out.println(name2 + " is walking");
		 * walking(name2); System.out.println(name2 + " is eating");
		 * 
		 * // What about binding Attributes (name,email,phone) and Properties (person)
		 * // together? // Create a CLASS
		 */
	}

	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
	}

}
