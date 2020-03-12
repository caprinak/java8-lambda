package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "CVes", 49),
				new Person("Matt", "Arnold", 12)
				);
		// Step 1: Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				 
				return o1.getLastname().compareTo(o2.getLastname());
			}
		});
		
		// Step 2: Create method that prints all elements 
		System.out.println("Print all Persons");
		printAll(people);
			

		
		//Step 3: Create a method that prints all people that have last name begin with C
		System.out.println("Print all Persons begin lastname with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				 
				return p.getLastname().startsWith("C");
			}
		
		});
		System.out.println("Print all Persons whose age more than 40");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				 
				return p.getAge() > 40 ;
			}
		
		});
	
		}
		private static void printConditionally(List<Person> people, Condition condition) {
			for (Person p : people) {
				if(condition.test(p)) {
					System.out.println(p);
				}
			}
		
	}
		private static void printAll(List<Person> people) {
			for (Person p : people) {
				System.out.println(p);
			}
		}

}
interface Condition {
	boolean test(Person p);
}
