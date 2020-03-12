package com.agiledeveloper;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class MutabilitySample {
	/*
	 * public static boolean isGreaterthan3(int number) {
	 * System.out.println("is greater than 3? " + number); return number > 3; }
	 */
	public static boolean isEven(int number) {
		System.out.println("is Even? " + number);
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9);
		int result = 0 ;
		for (int e : values) {
			if (e > 3 &&  e % 2 ==0) {
				result = e * 2;
				break;
			}
		} 
		System.out.println(result) ;
	Predicate<Integer> isGreaterThan3 = number -> number > 3;
	Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot;
	System.out.println(result) ;
	//become more expressive
	//high-order functions : give a function to a function, 
	//lazy evaluation & composition 
	//  >>>> MORE EFFIENCT, BETTER OPTIMIZATION
	Optional<Integer> a = values.stream()
		.filter(isGreaterThan.apply(4)) //METHOD REFERENCE
		.filter(MutabilitySample::isEven) // isEven
		.map(e -> 2 * e)
		.findFirst();
	System.out.println(a.get());
	// make it work, than better
	//single abstract method
	}
	

}
