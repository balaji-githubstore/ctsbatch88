package com.google.abstractdemo;


 abstract class Employee {
	 public Employee()
	 {
		 
	 }
	public abstract double salary();
 
	public final String getEmpName()
	{
		return "Hari";
	}
}

class PermanentEmployee extends Employee {

	public double salary() {
		
		return 2000*30;
	}
}

class ContractEmployee extends Employee
{
	public double salary() {
		// TODO Auto-generated method stub
		return 8*200;
	}
	
}


public class AbstractClassDemo {

	public static void printTalk(Employee a)
	{
		System.out.println(a.salary());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee ad=new PermanentEmployee();
		ad.getEmpName();
		AbstractClassDemo.printTalk(ad);
		
		Employee ac=new ContractEmployee();
		AbstractClassDemo.printTalk(ac);
		
	}
}
