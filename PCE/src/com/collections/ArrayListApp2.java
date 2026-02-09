package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListApp2 {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i)+ " ");
//			al.add(i);
		}
		System.out.println("iteratoerrrrrrrrrrrr........./n" );
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			al.add(it);
			
		}

	}

}
