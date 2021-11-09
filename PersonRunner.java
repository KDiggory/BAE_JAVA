package com.bae.oop;
import com.bae.oop.Person;

public class PersonRunner {

	public static void main(String[] args) {
		Person katie = new Person("Katie", 1.64f, 5, 33, "Software Engineer", "Ferret");
		Person george = new Person("George", 1.84f, 10, 33, "GP", "Dragon");
		Person huxley = new Person("Huxley", 0.98f, 7, 3, "Threenager", "Llama");
		Person oswin = new Person("Oswin", 1.64f, 4, 1, "Cutie of the year", "Cat");
		
		katie.methodOne();
		george.methodTwo();
		huxley.methodOne();
		oswin.methodTwo();
	

	}

}
