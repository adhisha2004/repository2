package com.collections;
//
//import java.util.Iterator;
//import java.util.concurrent.CopyOnWriteArrayList;
//
//public class CopyWrite {
//	public static void main(String[] args) {
//		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
//		al.add(100);
//		al.add(50);
//		al.add(150);
//		al.add(25);
//		al.add(75);
//		al.add(125);
//		al.add(175);
//		
//		Iterator itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			al.add(100);
//		}
//  System.out.println(al);
//	}
//
//}




//
//import java.util.TreeSet;
//import java.util.concurrent.CopyOnWriteArrayList;
//
//public class CopyWrite {
//	public static void main(String[] args) {
//		TreeSet al = new TreeSet();
//		al.add(100);
//		al.add(50);
//		al.add(150);
//		al.add(25);
//		al.add(75);
//		al.add(125);
//		al.add(175);
//		
//		
//  System.out.println(al);
//	}
//
//}




import java.util.ArrayList;
import java.util.Collections;

public class CopyWrite {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		Collections.sort(al);
		
  System.out.println(al);
	}

}




