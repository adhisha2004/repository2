package com.PCE;

public class MainStudentApp {
	public static void main(String[]args) {
		
		
		Student2 s1= new Student2();
		System.out.println("Before assignint the values");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.gender);
		
		System.out.println("After assignint the values");
		s1.name = "aadhisha";
		s1.age = 21;
		s1.gender ="female";
		
		System.out.println("name is " + s1.name);
		System.out.println(s1.age);
		System.out.println(s1.gender);
		
	}

}
