package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {

	public static void main(String[] args) {
		
		Map<String, Integer> items = new HashMap<String , Integer>();
		
		items.put("A", 23);
		items.put("E", 93);
		items.put("B", 53);
		items.put("J", 83);
		items.put("C", 73);
		
		items.forEach((k,v) -> System.out.println("Item " + k + " value " + v));
		
		items.forEach((k,v) -> {
			System.out.println("Item " + k + " value " + v);
			if("E".equals(k)){
				System.out.println("Hello e");
			}
		});
		
		
		System.out.println("list for each");
		
		List<String> listItems = new ArrayList<String>();
		
		listItems.add("A");
		listItems.add("O");
		listItems.add("P");
		listItems.add("D");
		listItems.add("F");
		
		listItems.forEach(itm -> System.out.println(itm));
		
		listItems.forEach( itm1 -> {
			if("O".equals(itm1)){
				System.out.println("hello o");
			}
		});
		
		System.out.println("Filter example");
		
		listItems.stream().filter(s -> s.contains("D")).forEach(System.out::println);

	}

}
