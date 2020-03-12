package io.javabrains.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.Person;

public class StandardFunctionalInterfaceExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "CVes", 49),
				new Person("Matt", "Arnold", 12)
				);
		// Step 1: Sort list by last name
		Collections.sort(people, (o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));
			
		
		// Step 2: Create method that prints all elements 
		System.out.println("Print all Persons");
		//printAll(people);
		printConditionally(people, p -> true, p -> System.out.println(p));	

		
		//Step 3: Create a method that prints all people that have last name begin with C
		System.out.println("Print all Persons begin lastname with C");
		printConditionally(people, p -> p.getLastname().startsWith("C"), p -> System.out.println(p));
		
			
		System.out.println("Print all Persons whose age more than 40");
		printConditionally(people, p -> p.getAge() > 40,  p -> System.out.println(p) );
		
	
		}
		private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
			for (Person p : people) {
				if(predicate.test(p)) {
					consumer.accept(p);
				}
			}
		
	}
		private static void printAll(List<Person> people) {
			for (Person p : people) {
				System.out.println(p);
			}
		}
}

