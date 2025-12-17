package com.PCE;

public class Main {
	public static void main(String[]args) {
		
		Roboat r1 = new Roboat();
		r1.brand = "HP";
		r1.os= "UBUNTO";
			System.out.println("Specification of brand :"+ r1.brand);
			System.out.println("Specification of os :" + r1.os);

		r1.move();
		r1.run();
		
		Roboat r2 = new Roboat();
		r2.os = "LINUX";
		r2.brand= "ASUSS";
		System.out.println("Specification of brand :"+ r2.brand);
		System.out.println("Specification of os :" + r2.os);
		r2.move();
		r2.run();
	}

}
