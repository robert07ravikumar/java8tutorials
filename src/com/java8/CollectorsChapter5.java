package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsChapter5 {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple","banana","mango","apple","banana","apple");
		
		Map<String,Long> result =  fruits.stream().collect(
				Collectors.groupingBy(Function.identity(),Collectors.counting())
			);
		
		System.out.println(result);

	}

}
