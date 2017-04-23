package com.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java8.pojo.*;

public class CollectorsChapter5 {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple","banana","mango","apple","banana","apple","pears");
		
		Map<String,Long> result =  fruits.stream().collect(
				Collectors.groupingBy(Function.identity(),Collectors.counting())
			);
		
		System.out.println(result);
		Map<String,Long> finalMap = new LinkedHashMap<String,Long>();
		
		 result.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		 
		 System.out.println(finalMap);
		 
		 List<Fruit> fruitsMany = Arrays.asList(
	                new Fruit("apple", 10, new BigDecimal("9.99")),
	                new Fruit("banana", 20, new BigDecimal("19.99")),
	                new Fruit("orang", 10, new BigDecimal("29.99")),
	                new Fruit("watermelon", 10, new BigDecimal("29.99")),
	                new Fruit("papaya", 20, new BigDecimal("9.99")),
	                new Fruit("apple", 10, new BigDecimal("9.99")),
	                new Fruit("banana", 10, new BigDecimal("19.99")),
	                new Fruit("apple", 20, new BigDecimal("9.99"))
	        );
		 
		 Map<String,Long> counting = fruitsMany.stream().collect(
				 Collectors.groupingBy(Fruit::getName,Collectors.counting()));
		 
		 System.out.println(counting);
		 
		 Map<String, Integer> sum = fruitsMany.stream().collect(
				 Collectors.groupingBy(Fruit::getName,Collectors.summingInt(Fruit::getQty)));
				 
		System.out.println(sum);
		
		System.out.println("grouping by price");
		
		Map<BigDecimal, List<Fruit>> priceGroup= fruitsMany.stream().collect(Collectors.groupingBy(Fruit::getPrice));
		
		System.out.println(priceGroup);
		
		
		System.out.println("group by price, uses 'mapping' to convert List<Item> to Set<String>");
		
		Map<BigDecimal,Set<String>> result1 = fruitsMany.stream().collect(
				Collectors.groupingBy(Fruit::getPrice,Collectors.mapping(Fruit::getName, Collectors.toSet())));

		System.out.println(result1);
	}

}
