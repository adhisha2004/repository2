package com.Package1;

public class StudentApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 s =new Student4();
		System.out.println("WELCOME TO HONDA SHOWROOM");
		Bike1 b= new Bike1("passion", 1234,"red");
		s.hasABike(b);
		System.out.println(">>>>>>>>>>>>>--******--<<<<<<<<<<<<");
		System.out.println("WELCOME TO BOOKSTORE");
		
		Book1 o = new Book1("FAIRY TELLS", 355);
		s.hasABook1(o);
	}
}
class Student4{
	Heart hr = new Heart("pump", 4);
	Brain br =  new Brain("SENCE", 140);
      void hasABook1(Book1 o){
    	  System.out.println("BOOK PAGES : "+o.getPages());
  		System.out.println("BOOK NAME : : "+o.name);
      }
	void hasABike(Bike1 b) {
		System.out.println("BRAND : "+b.getBrand());
		System.out.println("PRICE : "+b.getPrice());
		System.out.println("COLOUR : "+b.getColour());
	}		
}
class Bike1{
	String brand;
	int price;
	String colour;
	public Bike1(String brand, int price, String colour) {
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
class Heart1{
	String job;
	public Heart1(String job, int weight) {
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
class Book1{
	String name;
	int pages;
	public Book1(String name, int pages) {
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
class Brain{
	String job;
	int weight;{
		
	}

	public Brain(String job, int weight) {
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