package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorJava {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		Iterator itr1 = al.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
	}
}
}