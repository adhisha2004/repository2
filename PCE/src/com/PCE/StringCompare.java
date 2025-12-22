package com.PCE;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "Adhisha";
//		String s2 = "Adhisha";
		
//		String s1 = new String("Adhisha");
//		String s2 = new String("Adhisha");
		
//		String s1 = "Adhisha";
//	    String s2 = "adhisha";
		
	    String s1 = "Adhisha";
		String s2 = new String("Adhisha");
		
		
		if(s1==s2) {
			System.out.println("references are equal");
		}
		else {
			System.out.println("Refrences are no equal");
		}
		if(s1.equals(s2)) {
			System.out.println("valiiues are equal");
			
		}
		else {
			System.out.println("valiiues are no equal");
		}
	}

}
