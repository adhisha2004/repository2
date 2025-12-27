package com.OOPs;

class Employee2{
	int emp_id;
	String name;
	int salary;
	
	public Employee2() {
		this.(101,"adhisha",3934);
		System.out.println("0  parametrize constructor is called");
	}
	public Employee2(int emp_id) {
		System.out.println("1 parametrize contructoris called");
		
	}
	public Employee2(int emp_id, String name)
	{
	this(101);
	System.out.println("2 parametrize contructoris called");
	
}
	public Employee2(int emp_id, String name, int salary)
	{
	this(101, "adhisha");
	System.out.println("3 parametrize contructoris called");
	
}
	class Program {
	
	public static void main(String args[]) {
		Employee2 e = new Employee2();
	}
		
	}

}
