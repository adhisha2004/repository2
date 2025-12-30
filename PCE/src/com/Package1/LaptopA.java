package com.Package1;

public class LaptopA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l = new Laptop();
		Charger c = new Charger("dell", 65);
		l.hasA(c);
		System.out.println("=================================================");
		System.out.println(l.os.getBrand());
		System.out.println(l.os.getVersion());
		
	}
}
class Laptop{
	
	OS os = new OS("Win", 10);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getPower());
	}	
}
class OS{
	String brand;
	int version;
	public OS(String brand, int version) {
		super();
		this.brand = brand;
		this.version = version;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
}
class Charger{
	String brand;
	int power;
	public Charger(String brand, int power) {
		super();
		this.brand = brand;
		this.power = power;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
}