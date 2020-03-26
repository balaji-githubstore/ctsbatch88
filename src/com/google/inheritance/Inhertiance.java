package com.google.inheritance;

class Father
{
	int fatherAge;
	public Father(int age)
	{
		fatherAge=age;
		System.out.println("father");
	}
	public void fatherSytle()
	{
		System.out.println("Father style - New-hjdhjjsdhsjhd");
	}
}

class Son extends Father
{
	int sonAge=15;
	public Son(int fAge,int sAge)
	{
		super(fAge);
		sonAge=sAge;
		super.fatherAge=76;
		System.out.println("Son");
	}
	public void SonStyle()
	{
		System.out.println("Son Style");
	}
}

class GrandSon extends Son
{
	int gAge;
	public GrandSon(int fAge,int sAge,int gAge)
	{
		super(fAge,sAge);
		super.fatherSytle();
		super.SonStyle();
		this.gAge=gAge;
	}
	
	public void grandSon()
	{
		System.out.println("grand son");
	}
}

class Son2 extends Father
{
	public Son2()
	{
		super(90);
	}
}


public class Inhertiance {
	public static void main(String[] args) {
//		Father father =new Father();
//		father.fatherSytle();
		
//		Son son =new Son();
//		System.out.println(son.fatherAge);
//		System.out.println(son.sonAge);
//		son.fatherSytle();
//		son.SonStyle();
		
//		GrandSon gSon=new GrandSon(80,40,20);
//		gSon.fatherSytle();
//		gSon.SonStyle();
//		gSon.grandSon();
		
		Son s1=new Son(40, 20); //s1--> (89, 20)
		s1.fatherAge=89;
		s1.fatherSytle();
		
		Son2 s2=new Son2();//s2--> (60)
		s2.fatherAge=60;
		s2.fatherSytle();
		
		
	}

}
