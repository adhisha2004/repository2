package com.OOPs;

	class Employee2 extends Object{
		private String name;
		private int age;
		private int salary;
		
		public Employee2(String name, int age, int salary) {
		this.name = name;
	this.age = age;
		this.salary= salary;
		
	}
		public Employee2() {
			
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

	public class EmployeeApp2 extends Object {
		public static void main(String[]args) {
			
			Employee2 e = new Employee2();
			System.out.println(e.getName());
			System.out.println(e.getAge());
			System.out.println(e.getSalary());
			
			Employee2 e1 = new Employee2("adhisha", 21, 59844395);
			System.out.println(e1.getName());
			System.out.println(e1.getAge());
			System.out.println(e1.getSalary());
		}

	}


///////////////////////////////////////////////////////////////////////////////////////////
/// 
/// 
/// 
	class Employee2 extends Object{
		private String name;
		private int age;
		private int salary;
		
		public Employee2(String name, int age, int salary) {
		this.name = name;
	    this.age = age;
		this.salary= salary;
	
	}
		public Employee2() {
		this("adhisha", 21, 59844395);
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

	public class EmployeeApp2 extends Object {
		public static void main(String[]args) {
			
			Employee2 e = new Employee2();
			System.out.println(e.getName());
			System.out.println(e.getAge());
			System.out.println(e.getSalary());
		
		}

	}


