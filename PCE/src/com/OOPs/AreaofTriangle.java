package com.OOPs;

class Area2
{
float heigth;
float base;
static float Area;

public Area2(float heigth, float base) {
	this.heigth = heigth;
	
	this.base = base;

	
	}
public float disp() {
	float area = 0.5f *(base * heigth);
	return area;
}k

}

public class AreaofTriangle {
	
	public static void main(String[]args) {
		Area2 a = new Area2(5f, 16f);
		System.out.println(a.disp());
		
	}

}
