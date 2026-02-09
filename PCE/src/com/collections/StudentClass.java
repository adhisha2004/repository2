package com.collections;

public class StudentClass {
	String name;
	String mobno;
	String gender;
		public StudentClass(String name, String mobno, String gender) {
		this.name = name;
		this.mobno = mobno;
		this.gender = gender;
	}
		public String getName() {
			return name;
		}
		public String getMobno() {
			return mobno;
		}
		public String getGender() {
			return gender;
		}
	public String toString() {
		return this.name +" "+ this.gender+" " + this.mobno;
	}
	

}
