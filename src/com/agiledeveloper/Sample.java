package com.agiledeveloper;

import java.util.stream.IntStream;

public class Sample {

	public static void main(String[] args) {
		System.out.println(isPrime(1));
		System.out.println(isPrime(50));
		System.out.println(isPrime(17));
		System.out.println(isPrime(1933));
		
	}

	private static boolean isPrime(final int number) {
		 
		
		return number > 1 && 
				IntStream.range(2, number)
				.noneMatch(index -> number % index == 0);
	//declarative: tell how to do, not what to do or imperative
	//immutability
	}
	
}
