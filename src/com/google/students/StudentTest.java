package com.google.students;

public class StudentTest {

	public static void main(String[] args) {
		
		Student.schoolName="SBOA";
		
		Student std1=new Student("John");
		
		std1.name="john";
		std1.percentage=78;
		//std1-->L1-->(101,john,78)
		
		std1.displayStudentDetailsNS();
		
		Student.displayStudentDetails(std1);
		
		
		Student std2=new Student("ort");//102
		
		std2.name="peter";
		std2.percentage=88;
		
		std2.displayStudentDetailsNS();
		
		
		Student.displayStudentDetails(std2);
		
		Student std3=new Student("",89);//103
		
		
		
		
		Student hStd=Student.getHighestPercentageStudentDetails(std1, std2);
		
		System.out.println("Highest Percentage");
		Student.displayStudentDetails(hStd);
		
		
		//get highestsal (std1,std2,std3)
		

	}

}
