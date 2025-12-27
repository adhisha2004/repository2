package com.OOPs;

class Area1{
	
 int radius;
	float area;
	static float pi;
	
	public Area1(int radius, float pi) {
		this.radius = radius;
		this.pi = pi;
		
		}
	public float disp() {
		float area = radius * radius * pi;
		return area;
	}
	
}
public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area1 a = new Area1(3, 3.14f);
	     System.out.println(a.disp());	

	}

}
