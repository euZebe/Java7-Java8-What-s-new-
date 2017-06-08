package _99_utils;

import _06_interfaces.MyInterface;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Person(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "]";
	}

	public void print(String str) {
		System.out.println("youhou");
	}
}
