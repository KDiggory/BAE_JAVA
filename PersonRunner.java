package com.bae.person;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person mum = new Person("Mum", 33, "everything");
		Person dad = new Person("Dad", 33, "playing X-box mainly");
		Person dog = new Person("dog", 5, "eating things I shouldn't");
		System.out.println(Person.people.size());
		System.out.println(Person.getPeople());
		Person.searchName(dad);
		
		
		

		

	}

}
