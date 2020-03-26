package com.google.students;

//3 students 
//101, john, 78
//102, peter, 98
//103, paul, 88
public class Student //type
{
	public int rollNumber;
	public String name;
	public double percentage;
	public static String schoolName;
	
	public static int counter=101;
	
	public Student(String name)
	{
		rollNumber=counter;
		counter=counter+1;
		this.name=name;
		
	}
	public Student(int per)
	{
		rollNumber=counter;
		counter=counter+1;
		
		
	}
	
	public Student(String name,double per)
	{
		rollNumber=counter;
		counter=counter+1;
		this.name=name;
		
	}
	public Student(double name,String per)
	{
		rollNumber=counter;
		counter=counter+1;
		
		
	}
	
	
	public void displayStudentDetailsNS()
	{
		System.out.println(rollNumber);
		System.out.println(name);
		System.out.println(percentage);
		System.out.println(Student.schoolName);
	}
	
	//method to display student details
	public static void displayStudentDetails(Student x)
	{
		System.out.println(x.name);
		System.out.println(x.rollNumber);
		System.out.println(x.percentage);
		System.out.println(Student.schoolName);
		System.out.println("--------------------");
	}
	
	
	
	//method to check highest percentage and to return that student details
	public static Student getHighestPercentageStudentDetails(Student st1,Student st2)
	{
		if(st1.percentage>st2.percentage)
		{
			return st1;
		}
		else {
			return st2;
		}
	}
	
	//
	public static Student getHighestPercentageStudentDetails(Student st1,Student st2,Student st3)
	{
		return null;
	}
}
	

