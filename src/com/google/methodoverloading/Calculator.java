package com.google.methodoverloading;

public class Calculator {
	
//	public void add(int a,int b)
//	{
//		System.out.println(a+b);
//	}
	public static void add(int a,int b,int c)
	{
		
	}
	public static void add(double a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	
}
