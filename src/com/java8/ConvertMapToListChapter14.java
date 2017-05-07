package com.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToListChapter14 {

	public static void main(String[] args) {
		Map<Integer,String> data = new HashMap<Integer,String>();
		
		data.put(1,"robert");
		data.put(2,"richie");
		data.put(3,"phoebe");
		data.put(4,"rachel");
		data.put(5,"anand");
		data.put(6,"vini");
		
		List<Integer> keyToList = data.entrySet().stream().map(x -> x.getKey()).collect(Collectors.toList()	);
		keyToList.forEach(System.out::println);
		
		List<String> ValToList = data.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
		ValToList.forEach(System.out::println);
		
	}

}
