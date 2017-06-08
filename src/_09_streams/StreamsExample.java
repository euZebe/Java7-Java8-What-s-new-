package _09_streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import _99_utils.Person;

public class StreamsExample {

	public static double getAverage(List<Person> population) {
		if (population == null || population.isEmpty()) {
			throw new IllegalArgumentException("empty list");
		}
		double averageAge = 0;
		int counter = 0;
		for (Person p : population) {
			if (p.getAge() >= 18) {
				averageAge += p.getAge();
				counter++;
			}
		}
		averageAge /= counter;

		return averageAge;
	}

	
	public static double getAverageWithLambdas(List<Person> population) {
		if (population == null || population.isEmpty()) {
			throw new IllegalArgumentException("empty list");
		}
		
		OptionalDouble averageAge = population.stream() //
				.filter(p -> p.getAge() >= 18) //
				.mapToInt(Person::getAge) //
				.average();

		return averageAge.getAsDouble();
	}

	
	
	public static void main(String[] args) {
		List<Person> population = Arrays.asList( //
				new Person("Jean", 35), //
				new Person("Niobé", 3), //
				new Person("Xavier", 31), //
				new Person("Tania", 18) //
		);

		System.out.println(StreamsExample.getAverage(population));
		System.out.println(StreamsExample.getAverageWithLambdas(population));
	}
}
