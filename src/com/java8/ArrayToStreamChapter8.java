package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStreamChapter8 {

	public static void main(String[] args) {
		
		String[] arr = {"java","python","javascript","scala"};
		
		Stream<String> stream1 = Arrays.stream(arr);
		
		stream1.forEach(System.out::println);
		
		Stream<String> stream2 = Stream.of(arr);
		
		stream2.forEach(System.out::println);
		
		
		System.out.println(" int stream");
		
		
		int[] arr2 = {1,2,3,4,5,6,5,7};
		
		IntStream str1 = Arrays.stream(arr2);
		
		str1.forEach(System.out::println);
		
		Stream<int[]> str2 = Stream.of(arr2);
		
		IntStream intstr2 = str2.flatMapToInt(x -> Arrays.stream(x));
		
		intstr2.forEach(x -> System.out.println(x));
		
	}

}
