package com.polymorphism;

public class TendulkarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Tendulkar t= new ArjunTendulkar();
		t.job();
		t.proffesion();
//		t.smoke();    ///////////////// smoke method is not accesseble by parent class reference bcoz specialized method of child class is not inheret by parent class/////////////////
		((ArjunTendulkar)t).smoke(); 
	
	}
}

class Tendulkar{
	void job() {
		System.out.println("play cricket");
	}
	void proffesion() {
		System.out.println("he is batsman");
	}
}

class ArjunTendulkar extends Tendulkar{
	void proffesion() {
		System.out.println("he is baller");
	}
	void smoke() {
		System.out.println("he smoke sometimes");
	}
}