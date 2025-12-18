package com.PCE;
import java.util.*;
class Pce{
	
	String name,gender, mobno, address, collegename, email ;
	int rollno ;
	long addharno;
}

public class CollegeForm {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER YOUR COLLEGE DETAILS");
		System.out.println("please enter your Name :");
		String name = sc.nextLine();
		System.out.println("please enter your Gender :");
		String gender = sc.nextLine();
		System.out.println("please enter your MobNO :");
		String mobno = sc.nextLine();
		System.out.println("please enter your Address :");
		String address = sc.nextLine();
		System.out.println("please enter your CollegeName :");
		String collegename = sc.nextLine();
		System.out.println("please enter your email :");
		String email = sc.nextLine();
		System.out.println("please enter your rollno :");
		int rollno = sc.nextInt();
		System.out.println("please enter your addharno :");
		long addharno = sc.nextLong();
		
		System.out.println("\n\nYour Name is :" + name);
		System.out.println("Your gende is :" + gender);
		System.out.println("Your MOb no is :" + mobno);
		System.out.println("Your Address is :" + address);
		System.out.println("Your CollegeName is :" + collegename);
		System.out.println("Your Email is :" + email);
		System.out.println("Your Rollno. is :" + rollno);
		System.out.println("Your Addharno is :" + addharno);
		
		System.out.println("THANKYOU");
	
	}

}
