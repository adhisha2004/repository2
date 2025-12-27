package com.OOPs;
class StaticDemo2 {

	static int a;
	static int b;
	
	static {
		a = 100;
		b = 200;
	}
	
	static void disp() {
		System.out.println(a);
		System.out.println(b);
	}
	
	int x;
	int y; 
	    
	{
		a=300;
		b= 400;
		x =500;
		y=600;
	}
	void disp2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class Demo2{
	public static void main(String[]args) {
		StaticDemo2.disp();
		StaticDemo2 sd = new StaticDemo2();
		sd.disp();
	}
}
