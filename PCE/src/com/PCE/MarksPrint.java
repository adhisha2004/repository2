package com.PCE;
import java.util.*;

public class MarksPrint {
    public static void main(String[]args) {
	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("please enter the no.of.students :");
    	int size =sc.nextInt();
    	int Marks[] = new int[size];
    	
    	for(int i=0; i<Marks.length; i++) {
    		System.out.println("Enter the marks of a student " +i );
    		Marks[i] = sc.nextInt();
    	}
    	for(int j=0; j<Marks.length; j++) {
    		System.out.println("your marks arr :" + Marks[j]);
    	}
    	
   }
}
