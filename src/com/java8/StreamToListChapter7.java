package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToListChapter7 {

	public static void main(String[] args) {
		
		Stream<String> lang = Stream.of("java","javascript","python","scala");
		
		List<String> result = lang.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		Stream<Integer> numbers = Stream.of(23,34,56,78,9);
		
		List<Integer> result1 = numbers.filter( x -> x != 34).collect(Collectors.toList());
		
		result1.forEach(System.out::println);
	}

}
