package com.Package1;

public class StudentApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s = new Student3();
		s = null;
		System.out.println("WELCOME TO HONDA SHOWROOM");
		Bike b= new Bike("passion", 1234,"red");
		
		System.out.println("Brand :"+b.getBrand());
		System.out.println("COLOUR :"+b.getColour());
		/////////////////////////////////////////////////////////////////////////////////////////
//		s.hasA(b);
//		System.out.println(">>>>>>>>>>>>>>>>>>>....<<<<<<<<<<<<<<<<<<<");
//		System.out.println("\nHEART HAS PROPERTY");
//		System.out.println("WEIGHT : "+s.hr.getWeight());
//		System.out.println("JOB : "+s.hr.getJob());	
	}
}
class Student3{
	Heart hr = new Heart("pump", 4);
      
	void hasA(Bike b) {
		System.out.println("BRAND : "+b.getBrand());
		System.out.println("PRICE : "+b.getPrice());
		System.out.println("COLOUR : "+b.getColour());
	}		
}
class Bike{
	String brand;
	int price;
	String colour;
	public Bike(String brand, int price, String colour) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
class Heart{
	String job;
	public Heart(String job, int weight) {
		super();
		this.job = job;
		this.weight = weight;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	int weight;
	
}