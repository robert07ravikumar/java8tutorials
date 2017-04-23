package com.java8;

public class DeveloperPublic {
	
	int age;
	String name;
	int salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "DeveloperPublic [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

}
