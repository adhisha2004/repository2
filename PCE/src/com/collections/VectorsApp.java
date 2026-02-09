package com.collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorsApp {
	public static void main(String[] args) {
	Vector v = new Vector();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);
	 Enumeration eu = v.elements();
	 while(eu.hasMoreElements()) {
		 System.out.println(eu.nextElement() + " ");
	 }


}
}
