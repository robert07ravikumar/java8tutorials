package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.pojo.Student;



public class FlatMapChapter13 {

	public static void main(String[] args) {
		
		String data[][] = new String[][]{{"a","b"},{"c","d"},{"e","f"}};
		
		Stream<String[]> temp = Arrays.stream(data);
		
		//temp.forEach(m -> System.out.println(Arrays.toString(m)));
		
		Stream<String []> stream = temp.filter(m -> "a".equals(m));
		System.out.println("firt 0ut");
		stream.forEach(System.out::println);
		
		//Flat map to convert stream of String[] to stream of string
		System.out.println("second output");
		String[][] data1 = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		
		Stream<String[]> temp1 = Arrays.stream(data1);
		
		Stream<String> stringStream = temp1.flatMap(x -> Arrays.stream(x));
		
		Stream<String> filteredStream = stringStream.filter(x -> "a".equals(x));
		
		filteredStream.forEach(System.out::println);
		
		
		System.out.println("Flat map and set example");
		Student obj1 = new Student();
		obj1.setName("robert");
		obj1.addBook("pythn");
		obj1.addBook("maths");
		obj1.addBook("c");
		
		
		Student obj2 = new Student();
		obj2.setName("anand");
		obj2.addBook("maths");
		obj2.addBook("physics");
		obj2.addBook("chemistry");
		
		List<Student> college = new ArrayList<Student>();
		college.add(obj1);
		college.add(obj2);
		
		List<String> collect = 	college.stream().map(x -> x.getBook()).flatMap(x -> x.stream()).distinct().collect(	Collectors.toList());
		
		System.out.println(collect);
		
	}

}
