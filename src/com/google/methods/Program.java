package com.google.methods;

public class Program {

	public static void main(String[] args) {

		int radius = 10;
		
		double area= Area.areaOfCircle(90);
		//System.out.println(area);
		
		
		Area obj=new Area(); //allocate the memory
		
		int b =1;
		int h=25;
		double res= obj.areaOfTriangle(b, h);
		System.out.println(res);
		
		obj.printAreaOfCircle();
		
	}

}
