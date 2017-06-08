package _07_lambdas;

import java.util.Comparator;

import _99_utils.Employee;
import _99_utils.Person;

public class ComparatorExample {

	private static Comparator<Person> sortByAge;
	
	
	private static Comparator<Person> sortByAgeWithLambdas;

	public static void main(String[] args) {

		Employee julia = new Employee("Julia", 13);
		Person ernest = new Person("Ernest", 5);

		System.out.println(sortByAge.compare(julia, ernest));
		System.out.println(sortByAgeWithLambdas.compare(julia, ernest));
	}

}


























// private static Comparator<Person> sortByAge = new Comparator<Person>() {
// @Override
// public int compare(Person o1, Person o2) {
// return o1.getAge() - o2.getAge();
// }
// };

//private static Comparator<Person> sortByAgeWithLambdas = (p1, p2) -> p2.getAge() - p1.getAge();

