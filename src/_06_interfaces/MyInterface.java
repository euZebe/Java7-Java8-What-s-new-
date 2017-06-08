package _06_interfaces;

import _99_utils.Employee;

public interface MyInterface {
	
	
	default void print(String str) {
		System.out.println("This is a default behaviour." + str);
	}


	static void isNull(String str) {
		System.out.println("This is a default behaviour.");
	}
	
	
	public static void main(String[] args) {
		Employee p = new Employee("", 1);
		p.print("truc");
	}
	
}
