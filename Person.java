package com.bae.oop;

public class Person {
	
	public String name;
	public float height;
	public int shoeSize;
	public int age;
	public String jobTitle;
	public String favouriteAnimal;
	
	public Person(String name, float height, int shoeSize, int age, String jobTitle, String favouriteAnimal) {
		super();
		this.name = name;
		this.height = height;
		this.shoeSize = shoeSize;
		this.age = age;
		this.jobTitle = jobTitle;
		this.favouriteAnimal = favouriteAnimal;
	}

	public Person(String name, float height) {
		super();
		this.name = name;
		this.height = height;
	}
	
	public void methodOne() {
		System.out.println("Hello there " + name + ", I hear your favourite animal is the " + favouriteAnimal);
		
	}
	
	public void methodTwo() {
		age = age +10;
		System.out.println(name + ", In 10 years you will be " + age + " years old!!");
	}
}
