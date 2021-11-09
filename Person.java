package com.bae.person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class Person {
	
	
	private String name;
	private int age;
	private String jobTitle;
	static ArrayList<Person> people = new ArrayList<>();
	private int numPeople = 0;
	
	
	public static ArrayList<Person> getPeople() {
		return people;
	}

	public static void setPeople(ArrayList<Person> people) {
		Person.people = people;
	}

	public int getNumPeople() {
		return numPeople;
	}

	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		people.add(this);
		 numPeople ++;
	}
	
	public static void searchName(Person name) {
		int index = people.indexOf(name);
		System.out.println(index);
		System.out.println(people.get(index));
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "\nPerson [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}

	
}
