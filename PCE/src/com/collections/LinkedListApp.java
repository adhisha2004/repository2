package com.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListApp {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
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
		 System.out.println("iterator..........");
		 Iterator it =  a.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			System.out.println("Listiterator..........");
			 ListIterator li =  a.listIterator();
				
				while(li.hasNext()) {
					System.out.println(li.next());
				}
				System.out.println("enum.........");
//				 Enumeration eu = a.elements();
//				 while(eu.hasMoreElements()) {                         not support
//					 System.out.println(eu.nextElement() + " ");
//				 }


		
	}

}
