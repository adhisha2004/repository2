package com.frameworkimplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionInbuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(75);
		al.add(175);
		System.out.println(al);
//		Comparator c= Collections.reverseOrder();
		Collections.sort(al);
	
		System.out.println(Collections.binarySearch(al, 75));
		System.out.println(Collections.binarySearch(al, 999));
		Collections.rotate(al,3);
		System.out.println(al);
		
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		System.out.println(Collections.frequency(al, 75));
		System.out.println(Collections.replaceAll(al, 75, 0));
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);

	}

}
