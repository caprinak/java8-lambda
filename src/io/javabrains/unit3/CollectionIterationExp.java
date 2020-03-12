package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.Person;

public class CollectionIterationExp {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "CVes", 49),
				new Person("Matt", "Arnold", 12)
			);
		// forEach need consumer arg, consume each element
		System.out.println("foreach printing loop");
		people.forEach(System.out::println);
		
		System.out.println("Classic printing loop");
		for (int i =0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
	}

}
