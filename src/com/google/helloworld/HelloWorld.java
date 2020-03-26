package com.google.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		//System.out.println("Hello 12344");
		
		String sal1="$162,700";
		String sal2="$1,200,000";
		
		sal1=sal1.replace("$", "");
		sal1=sal1.replace(",", "");
		
		sal2=sal2.replace("$", "").replace(",", "");
		
		
		int salary1=Integer.parseInt(sal1);
		int salary2=Integer.parseInt(sal2);
		
		System.out.println(salary1+salary2);

	}
}

// area of triangle 
// b* h/2
//b = 1, height = 25

//array of string with size 3 and store red, yellow, green
//use for loop to print all the stored value in array