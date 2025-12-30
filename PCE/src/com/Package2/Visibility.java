package com.Package2;

public class Visibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             ChildA c = new ChildA();
//             c.disp();
             System.out.println(c.disp());
	}

}
//
//class ParentA{
//	void disp() {
//		System.out.println("this is parent class");
//	}
//}
//class ChildA extends ParentA{
//	protected void disp() {
//		System.out.println("this is child methhod");
//	}
//}


//////////////////////////////////////////////////////////////////////

//class ParentA{
//	public void disp() {
//		System.out.println("this is parent class");
//	}
//}
//class ChildA extends ParentA{
//	public void disp() {   
//		System.out.println("this is child methhod");
//	}
//}
//////////////////////////////////////////////////////////////////////////////
//
//class ParentA{
//	protected public void disp() {
//		System.out.println("this is parent class");
//	}
//}
//class ChildA extends ParentA{
//	public void disp() {   
//		System.out.println("this is child methhod");
//	}
//}

//////////////////////////////////////////////////////////////

//
//class ParentA{
//	void disp() {
//		System.out.println("this is parent class");
//	}
//}
//class ChildA extends ParentA{
//	int disp() {       //////////////////////////the return type of the over  ridden child method should be same as parent method//////////
//		System.out.println("this is child methhod");
//		return 0;
//	}
//}

///////////////////////////////////////////////////////////////////////////


class ParentA{
	Animal disp() {
		Animal a = new Animal();
		return a;
	}
}
class ChildA extends ParentA{
        Dog disp() {              
		Dog d = new Dog();
		return d;
	}
}
class Animal{
	
}
class Dog extends Animal{

	
}





