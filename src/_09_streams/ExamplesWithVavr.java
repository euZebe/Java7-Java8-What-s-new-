package _09_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import io.vavr.collection.List;

public class ExamplesWithVavr {

	private static java.util.List<String> getFilteredList(java.util.List<String> myList) {
		java.util.List<String> result = myList //
				.stream() // removed in vavr
				.filter(s -> s.startsWith("c")) //
				.map(String::toUpperCase) //
				.sorted() //
				.collect(Collectors.toList()); // clearer in vavr

		return result;
	}

	private static List<String> getFilteredVavrList(List<String> myList) {
		return myList //
				.filter(s -> s.startsWith("c")) //
				.map(String::toUpperCase) //
				.sorted() //
				.toList();
	}

	public static void main(String[] args) {
		
		/**
		 * see implementation methods for syntax differences
		 */
		java.util.List<String> originalList = new ArrayList<>(Arrays.asList("a1", "a2", "b1", "c2", "c1"));
		java.util.List<String> javaUtilList = getFilteredList(originalList);
		
		List<String> originalVavrList = List.of("a1", "a2", "b1", "c2", "c1");
		List<String> vavrList = getFilteredVavrList(originalVavrList);
		
		System.out.println("filtered javaUtilList: " + javaUtilList);
		System.out.println("filtered vavrList: " + vavrList);
		
		
		/**
		 * Note: java.util.List is mutable while vavr List is immutable
		 */
//		System.out.println("\nbefore add: " + originalList);
//		originalList.add(0, "bidule");
//		System.out.println("after add: " + originalList);
//		
//		System.out.println("\nbefore add: " + originalVavrList);
//		List<String> outputVavrList = originalVavrList.prepend("truc");
//		System.out.println("after add: " + originalVavrList);
//		System.out.println("after add (output): " + outputVavrList);
		
	}
}
