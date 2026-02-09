package com.frameworkimplementation;
import java.util.ArrayList;

class PassengerApp{
	int idno;
	String medium;
	String name;
	String to;
	
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public PassengerApp(int idno, String medium, String i, String to) {
		super();
		this.idno = idno;
		this.medium = medium;
		this.name = i;
		this.to = to;	
	}
	public int compareto()
}

public class PassengerDetails {
	public static void main(String args[]) {
		
		PassengerApp p = new PassengerApp(1000, "jhon deo", "nagpur", "mumbai");
		PassengerApp p1 = new PassengerApp(1004, "jhon deo1", "nagpur", "mumbai");
		PassengerApp p2 = new PassengerApp(1003, "jhon deo2", "nagpur", "mumbai");
		PassengerApp p3 = new PassengerApp(1008, "jhon deo3", "nagpur", "mumbai");
		
		ArrayList al = new ArrayList();
		al.add(p);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
				
	}

}
