package com.PCE;

public class DemoIntern {
	
	public static void main(String[]args) {
		String s1 = new String("aadhisha");
		String s2 = s1.intern();
		String s3 = s1.intern();
		
		if(s2==s3) {
			System.out.println("refrences ate equal");
		}
		else {
			System.out.println("refrences ate nott equal");
		}
		
//----------------------------------------------------------------------------------------------		
//		
		String s1 = "SACHIN";
		String s2 = "SAURAV";
		
		String s1 = "VIRUT";
		String s2 = "VIRA";
				String s1 = "VIRAT";
		String s2 = "VIRU";
		int res = s1.compareTo(s2);
		if(res > 0) {
			System.out.println("s1 is greatrer");
		}
		else if(res< 0) {
			System.out.println("s2 is greatrer");		}
		else {
			System.out.println("both are greatrer");
	
//		
//---------------------------------------------------------------------------------------------------------		
		String s1 = "SAchiN";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		s1.indexOf('A');
		s1.substring(2);
		System.out.println(s1.substring(2,3));
		System.out.println(s1.substring(2));
		System.out.println(s1.toLowerCase());

		
//		-----------------------------------------------------------------------------------------------------------------------
		
		
	StringBuffer sb = new StringBuffer("ms ");
		sb.append("adhisha");
		System.out.println(sb);
	
		
//		--------------------------------------------------------------------------------------------------------------
//		
		StringBuilder sb = new StringBuilder("ms ");
		System.out.println(sb.capacity());
		sb.append("adhisha");
////		
		
		StringBuilder sb = new StringBuilder();
//		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("adhisha");

		sb.ensureCapacity(31);
		sb.trimToSize();
		System.out.println(sb.capacity());
		

		
		
		
		
		
		
		
		
		
		
	}
	}


