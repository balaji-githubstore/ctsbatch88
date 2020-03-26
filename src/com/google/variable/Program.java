package com.google.variable;

public class Program {
	public static int aS=10; //class variable
	public static int bS=20;
	public int aNS=10; //instance variable
	public int bNS=20;
	

	public static void main(String[] args) {
		
		System.out.println(Program.aS);
		System.out.println("------");
		Program.aS=89;
		
		
		Program obj1=new Program(); //L1
		
		
		Program obj2=new Program(); //L2
		
		Program obj3=new Program(); //L3
		
		obj1.bNS=98;
		
		obj2=obj1;
		
		obj1.aNS=25;
		obj2.bNS=30;
		
		obj1=obj2=obj3;
		obj1.aNS=90;
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.aNS); //10
		System.out.println(obj1.bNS); //98
		
		System.out.println(obj2.aNS); //
		System.out.println(obj2.bNS); //
		
		System.out.println(obj3.aNS); //
		System.out.println(obj3.bNS); //
		
	}

}
