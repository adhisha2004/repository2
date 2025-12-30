package com.OOPs;

//public class ParentApp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Child c = new Child();
//		System.out.println(c.b);
//		System.out.println("----------------------------------------");
//		c.disp();                 //due to private field of disp() it is not accseble in the main class//
//	}
//}
//class Parent{
//	private int a = 10;
//	int b = 20;
//	private void disp() {
//		System.out.println(a);
//		System.out.println(b);
//	}
//}
//
//
//class Child extends Parent{
//	
//}


//------------------------------------------------------------------------------------------------//



//public class ParentApp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Child c = new Child();	            
//  }
//}
//class Parent{
//	public Parent() {
//	
//		System.out.println("thid is parent constructor");
//	}
//}
//class Child extends Parent{
//	public Child() {
//		System.out.println("these is child constructor");
//	}
//	
//}


//---------------------------------------------------------------------------------------------------------------//

//public class ParentApp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Child c = new Child();	            
//  }
//}
//class Parent1{
//	int a=10;
//	public Parent1() {
//	
//		System.out.println("thid is parent constructor");
//	}
//}
//class Parent2{
//	int a=20;
//	public Parent2() {
//	
//		System.out.println("thid is parent constructor");
//	}
//}
//class Child extends Parent1,Parent2{           
//	////////////////////////////////////Sytax ERROR/////////////////////////////////////////////////////
//	public Child() {
//		System.out.println("these is child constructor");
//	}
//	
//}



//-------------------------------------------------------------------------------------------------------------------------//


//
//public class ParentApp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Child c = new Child();	  
//		System.out.println(c.a);
//		System.out.println(c.b);
//  }
//}
//class GrandParent{
//	int a=10;
//	
//}
//class Parent extends GrandParent{
//	int b=20;
//	
//}
//class Child extends Parent{           
	
//	public Child() {
//		System.out.println("these is child constructor");
//	}
	
//}


//////////////////////////////////-------------------------------------------------------------------------/////



//public class ParentApp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Child c = new Child();	  
//		System.out.println(c.a);
//		System.out.println(c.b);
//  }
//}
//class Parent{
//	int a;
//	int b;
//	public Parent()
//	{
//		a=10;
//		b=20;
//}
//public Parent(int a,int b) {
//	this.a=a;
//	this.b=b;
//	
//}
//}
//class Child extends Parent{   
//	public Child() {
//	        a=30;
//			b=40;
//}
//	public Child(int a, int b) {
//		this.a=a;
//		this.b=b;
//	}
//}



//////////////////////---------------------------------------------------------------//////

public class ParentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child(100,99);	  
		System.out.println(c.a);
		System.out.println(c.b);
  }
}
class Parent{
	int a;
	int b;
	public Parent()
	{
		this(99,100);
		a=10;
		b=20;
		System.out.println("1.  gghjioihoyhy");
}
public Parent(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("2.  gurighijerifnrjnfrj");
	
}
}
class Child extends Parent{   
	public Child() {
	        a=30;
			b=40;
			System.out.println("3.  ygfrufhruefhfeijei");
}
	public Child(int a, int b) {
		this();
		this.a=a;
		this.b=b;
		System.out.println("4.  nknekjoekoekeoe");
	}
}













