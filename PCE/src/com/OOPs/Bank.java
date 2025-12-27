package com.OOPs;
import java.util.*;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the amount to deposite");
		Banks b = new Banks();
		int bal=sc.nextInt();
		b.setBalance(bal);
		System.out.println("ENTER YOUR CURRENT BALANCE : "+b.getBalance());
		
		System.out.println("please enter aamount of withdraw");
		int w = sc.nextInt();
	int upd_bal = b.getBalance()-w;
	b.setBalance(upd_bal);
		System.out.println("your current balance is : "+b.getBalance());

}
	}

class Banks{
//	public int balance;
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}