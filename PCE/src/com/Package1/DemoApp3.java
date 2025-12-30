package com.Package1;

public class DemoApp3 {
           
	public int a;
	protected int b;
	int c;
	private int d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DemoApp3 d = new DemoApp3();
           System.out.println(d.a);
           System.out.println(d.b);
           System.out.println(d.c);
           System.out.println(d.d);
	}

}
class Demo3{
	void disp1() {
		DemoApp3 d = new DemoApp3();
        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(d.c);
//        System.out.println(d.d);
	}
}
class Demo4 extends DemoApp3{
	void disp2() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d.d);
	}
}
