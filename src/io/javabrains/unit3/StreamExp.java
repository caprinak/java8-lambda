package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.Person;

public class StreamExp {
	//Stream a sequence of elements supporting sequential 
	//and parallel aggregate operations
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "CVes", 49),
				new Person("Matt", "Arnold", 12)
			);
		
		people.stream()
		//filter takes a Predicate
		.filter(p -> p.getLastname().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstname()));
		
		long count = people.stream()
		.filter(p -> p.getLastname().startsWith("D"))
		.count();
		
		System.out.println(count);
		
		//parallel processing
		long count1 = people.parallelStream()
				.filter(p -> p.getLastname().startsWith("C"))
				.count();
		
		System.out.println(count1);
		
	}
	
}
