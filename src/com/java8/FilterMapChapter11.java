package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapChapter11 {

	public static void main(String[] args) {
		
		Map<Integer,String> Hosting = new HashMap();
		Hosting.put(1, "robert");
		Hosting.put(2, "ravikumar");
		Hosting.put(3, "rachel");
		Hosting.put(4, "anand");
		
		String result ="";
		
		result = Hosting.entrySet().stream().filter(map -> "rachel".equals(map.getValue())).map(map -> map.getValue()).collect(Collectors.joining());
		
		System.out.println(result);
		
		String result1 = "";
		
		/*Map<Integer,String> collect1= Hosting.entrySet().stream().filter(map -> (map.getValue() == 2)
									.collect(Collectors.toMap(p->p.getKey(),p -> p.getValue()));
		*/
		Map<Integer, String> collect = Hosting.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

		
		System.out.println(collect);
		
	}

}
