package com.frameworkimplementation;

import java.util.ArrayList;
import java.util.Collections;

class Empclass1{
	String name ;
	int id;
	int salary;
	
	public Empclass1(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return  name + " " + id + " " + salary;
	}
	
}




public class EmployeeClass {

	public static void main(String[] args) {
		Empclass1 e1= new Empclass1("Adhisha", 2, 100000);
		Empclass1 e2 = new Empclass1("John", 3, 150000);
		Empclass1 e3 =new Empclass1("Will", 1, 50000);
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
