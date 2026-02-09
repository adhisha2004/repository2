package com.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListApp {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		 for( int i=0; i< a.size(); i++) {
			 System.out.println(a.get(i));
		 }
	 System.out.println("For each Loop");
		 for(Object n:a) {
			 System.out.println(n);
		 }
		
		 
		 Iterator it =  a.iterator();
		
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			ListIterator li = a.listIterator();
		
			 while(li.hasNext()) {
				 System.out.println(li.next() + " ");
			 }
			  Iterator i = a.de
}
}
