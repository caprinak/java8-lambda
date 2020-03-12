package com.agiledeveloper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams1 {

	public static void main(String[] args) throws IOException {
		//5. Stream for Array, sort, filter and print
		String[] names = {"AI", "ML", "BC", "BD", "NoSql", "CRM"};
		Arrays.stream(names)
			 .filter(x -> x.startsWith("B"))
			 .sorted()
			 .forEach(System.out::println);
		//6.average of squares of int arrays
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
				.map(x -> x*x)
				.average()
				.ifPresent(System.out::println);
		
		List<String> people = Arrays.asList("AI", "ML", "BC", "BD", "NoSql", "CRM");
		people.stream()
			//.map(String::toLowerCase)
			.filter(x -> x.toLowerCase().startsWith("a"))
			.forEach(System.out::println);
		
		//8. Stream rows from text file, sort, filter, and print
		
		Stream<String> bands = Files.lines(Paths.get("src/bands.txt"));
				bands.sorted()
					.filter(x -> x.length() > 10)
					.forEach(System.out::println);
				bands.close();
		//9. Stream rows from text file and save to list
		List<String> bands2 =  Files.readAllLines(Paths.get("src/bands.txt"))
									.stream()
									.filter(x -> x.contains("Faye"))
									.collect(Collectors.toList());
		bands2.forEach(x -> System.out.println(x));
		
		//10. Stream rows from CSV file and count
		Stream<String> rows1 = Files.lines(Paths.get("src/100 Sales Records.csv"));
		
		  int rowCount = (int)rows1 .map(x -> x.split(",")) .filter(x -> x.length ==
		  14) .count(); System.out.println(rowCount + " rows.");
		  System.out.println(rowCount + " rows.");
		  rows1.close();
		  
		  Stream<String> rows2 = Files.lines(Paths.get("src/100 Sales Records.csv"));
		int Asiancount = (int)rows2
				.map(x -> x.split(","))
				.filter(x -> x[0].contains("Asia"))
				.count();
		 System.out.println(Asiancount + " rows.");
		 rows2.close();
		
		 //12. stream rows from CSV file, store fields in HashMap
		 Stream<String> rows3 = Files.lines(Paths.get("src/100 Sales Records.csv"));
		 Map<String, Double> map = new HashMap<>();
		 try {
		 map = rows3
				 .map(x -> x.split(","))
				 .skip(1)
				 .filter(x -> Integer.parseInt(x[8]) > 3000)
				 .collect(Collectors.toMap(
						 x -> x[2],
						 x -> Double.parseDouble(x[9])
						 ));
		 rows3.close();
		 for (String key : map.keySet()) {
			 System.out.println(key + " " + map.get(key));
		 }
		 }catch(Exception e) {
			 System.out.println("error: " + e.getMessage());;
		 }
		 
		 //13. reduction - sum
		 double total = Stream.of(7.3, 1.5, 4.6)
				 .reduce(0.0, (Double a, Double b) -> a + b);
		 System.out.println("Total = " + total);
		 
		 //14 reduction - summary statistics
		 IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
				 .summaryStatistics();
		 
		 System.out.println(summary);
	
		 
		
	}

}
