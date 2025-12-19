package com.PCE;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b[][] = new int[3][];
		
		for(int i = 0 ; i < b.length;i++) {
			System.out.println("Enter the total number of students in class "+i);
			b[i]=new int[sc.nextInt()];
		}
		
		
		for(int i =0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.println("Enter the marks of class "+ i+" student "+j);
				b[i][j]= sc.nextInt();
			}
		}
		for(int i =0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
