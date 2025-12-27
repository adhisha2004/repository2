package com.PCE;


class MethodOver{

	int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	float add(int a, float b) {
		float sum = a+b;
		return sum;
	}
	float add(float a, int b) {
		float sum = a+b;
		return sum;
}
	double add(double a, double b) {
		double sum = a+b;
		return sum;

}
	double add(float a, int b, double c) {
		double sum = a+b+c;
		return sum;

  }
}

public class CalculatorA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOver m = new MethodOver();
		System.out.println(m.add(10,20,10));
		
}
}