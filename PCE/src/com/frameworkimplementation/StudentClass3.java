package com.frameworkimplementation;

import java.util.HashMap;

class StudentApp3{
	@Override
	public String toString() {
		return "StudentApp3 [name=" + name + ", age=" + age + ", gender=" + gender + ", sem=" + sem + ", gmail=" + gmail
				+ ", address=" + address + ", height=" + height + ", weight=" + weight + ", BD=" + BD + "]";
	}
	String name;
	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param sem
	 * @param gmail
	 * @param address
	 * @param height
	 * @param weight
	 * @param bD
	 */
	public StudentApp3(String name, int age, String gender, int sem, String gmail, String address, float height,
			float weight, String bD) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.sem = sem;
		this.gmail = gmail;
		this.address = address;
		this.height = height;
		this.weight = weight;
		BD = bD;
	}
	public StudentApp3() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getBD() {
		return BD;
	}
	public void setBD(String bD) {
		BD = bD;
	}
	int age;
	String gender;
	int sem;
	String gmail;
	String address;
	float height;
	float weight;
	String BD;
	
}

public class StudentClass3 {
public static void main(String[] args, HashMap hs) {
	StudentApp3 st = new StudentApp3();
	HashMap s1 = new HashMap(21,"female", );
    HashMap s2 = new HashMap();
	HashMap s3 = new HashMap();
	hs.put(102,s3);
	System.out.println(hs);

	
	
}

}
