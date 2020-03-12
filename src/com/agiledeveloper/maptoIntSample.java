package com.agiledeveloper;

import java.util.Arrays;
import java.util.List;

public class maptoIntSample {
	public static int doubleIt(int number) {
		try { Thread.sleep(1000);} catch(Exception e) {}
		return number * 2;
	}
	//pure function 
	//referential transparency 
	//sequentially evaluating >> concurrency
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 5 ,4, 3, 6);
		 
		 System.out.println(
				 numbers.parallelStream()
				 		.mapToInt(maptoIntSample::doubleIt)
				 		.sum()
				 );   //reactive programming = lazy evaluation
	}

}
