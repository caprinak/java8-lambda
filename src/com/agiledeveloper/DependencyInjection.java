package com.agiledeveloper;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface Selector {
	public boolean pick(int value);
}

public class DependencyInjection {	
	
	/*
	 * public static int totalValues(List<Integer> numbers,
	 * Predicate<Integer>selector) { int result = 0; for (int e : numbers) {
	 * if(selector.test(e)) result += e; } return result; }
	 */
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9);
		
		System.out.println(totalValues(values, e -> true));
		System.out.println(totalValues(values, e -> e % 2 == 0));
	}

	private static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
		
		return numbers.stream()
				.filter(selector)
				.reduce(0, Math::addExact);
	}
}
