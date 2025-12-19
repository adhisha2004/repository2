package com.PCE;

import java.util.*;

public class NameofStd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size of a array :");
		int size = sc.nextInt();
		String []names = new String[size];
		
		for(int i=0; i<names.length; i++) {
			System.out.println("Enter the student name :" +i);
			names[i] = sc.next();
		}
			for(int j=0; j<names.length; j++) {
				System.out.println("student name is :" + names[j]);
		
			}
		
		
	}

}
