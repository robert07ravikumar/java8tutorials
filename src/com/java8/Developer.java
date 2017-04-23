package com.java8;

import java.math.BigDecimal;

public class Developer {
	int age;
	String name;
	BigDecimal salary;
	
	public Developer(int age, String name, BigDecimal salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Developer [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
	
}
