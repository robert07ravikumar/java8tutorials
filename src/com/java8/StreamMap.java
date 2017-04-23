package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		
		List<String> alpha = Arrays.asList("a","b","c","d");
		
		System.out.println(alpha);
		
		List<String> alphaUpper = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(alphaUpper);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		
		System.out.println(numbers);
		
		List<Integer> numbers2 = numbers.stream().map(n -> n*2).collect(Collectors.toList());
		
		System.out.println(numbers2);
		
		List<Developer> devs = getDevelopers();
		
		List<String> devNames = devs.stream().map(x -> x.getName()).collect(Collectors.toList());
		
		System.out.println(devNames);
		
		List<DeveloperPublic> devPublic = devs.stream().map(temp -> {
				DeveloperPublic devP =new DeveloperPublic();
				devP.setAge(temp.getAge());
				devP.setName(temp.getName());
				return devP;
			}).collect(Collectors.toList());
		
		System.out.println(devPublic);

	}
	
	private static List<Developer> getDevelopers(){
		
		List<Developer> devs = new ArrayList<Developer>();
		
		devs.add(new Developer(31, "robert", new BigDecimal(5523)));
		devs.add(new Developer(23, "ravi", new BigDecimal(3231)));
		devs.add(new Developer(46, "kumar", new BigDecimal(2314)));
		devs.add(new Developer(52, "anand", new BigDecimal(8231)));
		devs.add(new Developer(23, "richie", new BigDecimal(7398)));
		devs.add(new Developer(21, "richie", new BigDecimal(7308)));
		
		return devs;
	}

}
