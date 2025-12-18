package com.PCE;
 class FanApp{
	
	String brand;
	String colour;
	float price;

}
public class Fan {
	
	public static void main(String[]args) {
		FanApp f1 = new FanApp();
		System.out.println("Before assignint the values");
		System.out.println(f1.brand);
		System.out.println(f1.price);
		System.out.println(f1.colour);
		
		System.out.println("After assignint the values");
		f1.brand = "Surya";
		f1.colour ="Red";
		f1.price = 345.76f;
		System.out.println(f1.brand);
		System.out.println(f1.price);
		System.out.println(f1.colour);
		
		FanApp f2 = new FanApp();
		System.out.println("Before assignint the values");
		System.out.println(f2.brand);
		System.out.println(f2.price);
		System.out.println(f2.colour);
		
		System.out.println("After assignint the values");
		f2.brand = "Orient";
		f2.colour ="voilet";
		f2.price = 675f;
		System.out.println(f2.brand);
		System.out.println(f2.price);
		System.out.println(f2.colour);
		
		
	}

}
