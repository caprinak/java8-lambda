package com.agiledeveloper;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		IntStream.range(1, 10)
			.skip(3)
			.forEach(System.out::println);
		
		System.out.println(
		IntStream.range(1, 5).sum()	
				); 
		
		
		Stream.of("Ava", "aka", "Albert")
				.sorted()
				.findFirst()
				.ifPresent(System.out::println);
		
	
	}

}
