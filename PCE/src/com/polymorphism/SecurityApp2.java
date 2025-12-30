package com.polymorphism;

public class SecurityApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp(new Army());
		System.out.println("-----------------------------------");
	
		disp(new Navy());
		System.out.println("-------------------------------------");
		
		disp(new AirForce());
		System.out.println("------------------------------------");
	}
		static void disp(SecurityForce f) {
		f.protect();
		f.job();
	}
}
class SecurityForce{
	void job() {
		System.out.println("* To protect Nation");
	}
	void protect() {
		System.out.println("1. protect country");
	}
	
}
class Army extends SecurityForce{
	void protect() {
		System.out.println("* army protects land");
	}
	
}
class Navy extends SecurityForce{
	void protect() {
		System.out.println("* Navy protects water");
	}
	
}
class AirForce extends SecurityForce{
	void protect() {
		System.out.println("* airforce protects air way");
	}
	
}