package com.google.methods;

public class Area {
	//accessmodifier static returntype methodname(parameter)
	public static double areaOfCircle(int rad)
	{	
		double result= 3.14*rad*rad;	
		return result;
	}
	
	//non-static
	public double areaOfTriangle(int b, int h)
	{
		//double res=b*h/2.0;
		return b*h/2.0;
	}
	//areaofrectangle
	//areaofsquare
	//4
	public void printAreaOfCircle()
	{
		
	}
	
}
