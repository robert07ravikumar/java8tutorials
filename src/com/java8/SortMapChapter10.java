package com.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortMapChapter10 {

	public static void main(String[] args) {
		
		Map<String,Integer> unsortMap = new HashMap<String,Integer>(); 
		unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("j", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        
        System.out.println("unsorted original");
        System.out.println(unsortMap);
        
        Map<String,Integer> result = new LinkedHashMap<String,Integer>();
        
        unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
        	.forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
        
        System.out.println("sorted by key");
        System.out.println(result);
        
        Map<String,Integer> result1 = new LinkedHashMap();
        
        unsortMap.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
        	.forEachOrdered(x -> result1.put(x.getKey(),x.getValue()));
        
        System.out.println("sorted by value reveresed test");
        System.out.println(result1);
        
	}

}
