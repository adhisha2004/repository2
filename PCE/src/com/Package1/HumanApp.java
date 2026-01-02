package com.Package1;

public class HumanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student5 s =new Student5();
		System.out.println("WELCOME TO HONDA SHOWROOM");
		Bike2 b= new Bike2("passion", 1234,"red");
		s.hasABike(b);
		
		System.out.println(">>>>>>>>>>>>>--******--<<<<<<<<<<<<");
		System.out.println("WELCOME TO BOOKSTORE");
		Book2 o = new Book2("FAIRY Tails", 355);
		s.hasABook2(o);

	}
}
class Human{
	Heart hr = new Heart("pump", 4);
	Brain br =  new Brain("SENCE", 140);
}
class Student5 extends Human{
	
      void hasABook2(Book2 o){
    	  System.out.println("BOOK PAGES : "+o.getPages());
  		System.out.println("BOOK NAME : : "+o.name);
      }
	void hasABike(Bike2 b) {
		System.out.println("BRAND : "+b.getBrand());
		System.out.println("PRICE : "+b.getPrice());
		System.out.println("COLOUR : "+b.getColour());
	}		
}
class Bike2{
	String brand;
	int price;
	String colour;
	public Bike2(String brand, int price, String colour) {
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
class Heart2{
	String job;
	public Heart2(String job, int weight) {
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
class Book2{
	String name;
	int pages;
	public Book2(String name, int pages) {
		super();
		this.name = name;
		this.pages = pages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
class Brain2{
	String job;
	int weight;{
		
	}

	public Brain2(String job, int weight) {
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
}
