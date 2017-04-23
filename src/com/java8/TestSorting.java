package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
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
		
	}
	
	private static List<Developer> getDevelopers(){
		
		List<Developer> devs = new ArrayList<Developer>();
		
		devs.add(new Developer(31, "robert", new BigDecimal(1231231423)));
		devs.add(new Developer(23, "ravi", new BigDecimal(1231231423)));
		devs.add(new Developer(46, "kumar", new BigDecimal(1231231423)));
		devs.add(new Developer(52, "anand", new BigDecimal(1231231423)));
		devs.add(new Developer(21, "richie", new BigDecimal(1231231423)));
		
		return devs;
	}

}
