package com.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.List;
import java.util.Objects;

public class FilterNullChapter6 {

	public static void main(String[] args) {
		
		Stream<String> lang = Stream.of("java","python",null,"scala",null,"javascript");

		List<String> result = (List<String>)lang.collect(Collectors.toList());
		
		System.out.println(result);
		
		Stream<String> lang1 = Stream.of("java","python",null,"scala",null,"javascript");
		
		List<String> result1 = lang1.filter(x -> x != null).collect(Collectors.toList());
		
		System.out.println(result1);
		
		System.out.println("object :: non null");
		
		Stream<String> lang2 = Stream.of("java","python",null,"scala",null,"javascript");
		
		List<String> result3 = lang2.filter(Objects::nonNull).collect(Collectors.toList());
		
		System.out.println(result3);
		
	}

}
