package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {
		
		List<Developer> developers = getDevelopers();
		
		System.out.println("before sorting");
		
		for (Iterator iterator = developers.iterator(); iterator.hasNext();) {
			Developer developer = (Developer) iterator.next();
			System.out.println(developer);
		}
		
		developers.sort((Developer o1,Developer o2) -> o1.getAge()-o2.getAge());
		
		System.out.println("After sorting");
		
		developers.forEach((dev)->System.out.println(dev));
		
		System.out.println("sort by name ");
		
		developers.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
		
		developers.forEach((dev)->System.out.println(dev));
		
		System.out.println("reversed sorting");
		
		Comparator<Developer> salaryComp = (o1,o2) -> o1.getSalary().compareTo(o2.getSalary());
		developers.sort(salaryComp.reversed());
		
		developers.forEach(System.out::println);
		
	}
	
	private static List<Developer> getDevelopers(){
		
		List<Developer> devs = new ArrayList<Developer>();
		
		devs.add(new Developer(31, "robert", new BigDecimal(5523)));
		devs.add(new Developer(23, "ravi", new BigDecimal(3231)));
		devs.add(new Developer(46, "kumar", new BigDecimal(2314)));
		devs.add(new Developer(52, "anand", new BigDecimal(8231)));
		devs.add(new Developer(21, "richie", new BigDecimal(7398)));
		
		return devs;
	}

}
