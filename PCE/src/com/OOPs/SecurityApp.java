package com.OOPs;

public class SecurityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a = new Army();
		System.out.println("-----------------------------------");
		a.job();
		a.protect();
		a.UseTank();
		Navy n = new Navy();
		System.out.println("-------------------------------------");
		n.job();
		n.UseShip();
		n.protect();
		AirForce j = new AirForce();
		System.out.println("------------------------------------");
		j.job();
		j.protect();
		j.UseJet();
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
	void UseTank() {
		System.out.println("2. Army force uses tanks");
	}
}
class Navy extends SecurityForce{
	void protect() {
		System.out.println("* Navy protects water");
	}
	void UseShip() {
		System.out.println("3. navy uses tanks");
	}
}
class AirForce extends SecurityForce{
	void protect() {
		System.out.println("* airforce protects air way");
	}
	void UseJet() {
		System.out.println("4. airforce uses jet");
	}
}