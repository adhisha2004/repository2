
//-------------------------METHODS---------------------------


////////////////////////// 1. NO PARAMETER NO RETURNTYPE/////////////////////

package com.PCE;
class Calculator{
	void add(int i, int j) {
		int a =10;
		int b =20;
		int c =a+b;
		System.out.println(c);
	}
}
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.add();
	}

}

/////////////////////////// 2. NO PARAMETER BUT RETURN ///////////////////////

class Calculator{
	int add() {
		int a =10;
		int b =20;
		int c =a+b;
	
		return c;
	}
}
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int ret = c.add();
		System.out.println(ret);
	}

}

/////////////////////////// 3. PARAMETER BUT NO RETURN TYPE /////////////////////////
 
class Calculator{
	void add(int a, int b) {
		int c = a +b;
		System.out.println(c);
	}
}
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.add(10,20);
		
	}

}

////////////////////////// 4. PARAMETER AND RETURN TYPE /////////////////////////////////

class Calculator{
	int add(int a, int b) {
		int c = a +b;
		return (c);
	}
}
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int ret =c.add(10,20);
		System.out.println(ret);
	}

}

