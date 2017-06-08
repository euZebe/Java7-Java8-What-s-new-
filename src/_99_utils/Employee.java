package _99_utils;

import java.util.Optional;

import _06_interfaces.MyInterface;

public class Employee extends Person implements MyInterface  {

	public Employee(String firstName, int age) {
		super(firstName, age);
	}

	public Address getAddress() {
		return null;
	}

	public Optional<Address> getOptAddress() {
		return Optional.empty();
	}

}
