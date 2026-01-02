package com.Package1;

public class ParentaApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c =  new Child2();
   c.disp();
	}

}
class Parent2{
 int x =10;

	void disp() {
		System.out.println("this is parent method");
	}
}
class Child2 extends Parent2{
	int x =20;
	void disp() {
		super.disp();
		System.out.println("this si child method");
	
}
}