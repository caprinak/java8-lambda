package io.javabrains.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "CVes", 49),
				new Person("Matt", "Arnold", 12)
			);
		
		// Step 2: Create method that prints all elements 
		System.out.println("Print all Persons");
		//printAll(people);
		printConditionally(people, p -> true, System.out::println);	

	
		}
		private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
			for (Person p : people) {
				if(predicate.test(p)) {
					consumer.accept(p);
				}
			}
	}
}
