package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java","spring","struts");
		
		List<String> result = words.stream().filter(word -> !"java".equals(word)).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		
		System.out.println("filter by name");
		
		List<Developer> devs = getDevelopers();
		
		Developer devsByName = devs.stream().filter(dev -> dev.getName().equals("richie")).findAny().orElse(null); 
		
		System.out.println(devsByName);
		
		System.out.println("for mulitple condition");

		Developer devsByNameandage = devs.stream().filter(dev -> {
				if(dev.getName().equals("richie") && dev.getAge() == 21)
				{
					return true;
				}else{
					return false;
				}
			}).findAny().orElse(null); 
		
		System.out.println(devsByNameandage);
		
		
		System.out.println("map example");
		
		String name = devs.stream().filter(dev -> dev.getName().equals("richie")).map(Developer::getName).findAny().orElse(null);
		
		System.out.println(name);
		
		System.out.println("map to list");
		
		List<Integer> nameList = devs.stream().filter(dev -> dev.getName().equals("richie")).map(Developer::getAge).collect(Collectors.toList());
		
		System.out.println(nameList);

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
