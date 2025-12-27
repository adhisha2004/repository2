package com.OOPs;
class Employeeee{
	private String name;
	private int age;
	private int salary;
	
	public Employeeee(String name, int age, int salary) {
	this.name = name;
this.age = age;
	this.salary= salary;
	
}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
}

public class EmployeeeApp {
	public static void main(String[]args) {
		
		Employeeee e = new Employeeee("adhisha", 21, 3456777);
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSalary());
	}

}
