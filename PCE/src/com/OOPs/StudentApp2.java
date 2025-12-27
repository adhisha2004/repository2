package com.OOPs;

import java.util.Scanner;

public class StudentApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the name of a student");
		Student3 s = new Student3();
		String name=sc.nextLine();
		System.out.println("please enter the age of a student");
		int age=sc.nextInt();
		sc.nextLine();                                                                                                                            
		System.out.println("please enter the gendeer");
		String gender=sc.nextLine();
		s.setName(name);	
		s.setAge(age);	
		s.setGender(gender);	
		System.out.println("name of student is : " + s.getName());
		System.out.println("age of student is : " + s.getAge());
		System.out.println("gender of student is : " + s.getGender());
}
}
 class Student3{
	 
	 private String name;
	 private int age;
	 private String gender;
	 
	public int getAge() {
		return age;
	}

	 public void setAge(int a) {
		 age = a;
	 }

	 public String getGender() {
		 return gender;
	 }

	 public void setGender(String g) {
		 gender = g;
	 }

	public String getName() {
		 return name;
	 }

	 public void setName(String n) {
		 name = n;
	 }
	
	
}