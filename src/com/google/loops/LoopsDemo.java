package com.google.loops;

public class LoopsDemo {

	public static void main(String[] args) {
		
		
		
		
//		byte percent=127; //8 bits 
		
		//byte --> 1000* 8 = 8000 bits
		//int --> 1000*32 =32000 bits
		
		//String[] colors=new String[3]; 


		
//		long value1 = 128245545454L; //32 into 64 bit
		
//		float value =10.0f; //64 into 32 bit
		
		/*
		 * double a =1.123456789; //64 bit System.out.println(a);
		 * 
		 * float b = (float) a; // explicit conversion System.out.println(b);
		 */
		
		/*
		 * String name = "balaji"; //6*16 bits int size = name.length();
		 * System.out.println(size);
		 */
		
		  String[] colors=new String[5]; 
		  colors[0]="red";
		  colors[1]="blue";
		  colors[4]="green";
		  
//		  int size = colors.length;
//		  System.out.println(size);
//		  for(int i=0;i<size;i++)
//		  {
//			  System.out.println(colors[i]);
//		  }
//		  
//		  for(String color  : colors)
//		  {
//			  System.out.println(color);
//		  }
		 
		  int[] numbers = {45,85,65,89,89,25,55,58,59,60};
		  //print number less than 50 using for each
		  
		  for(int num : numbers)
		  {
			  if(num>50 && num<60)
			  {
				  System.out.println(num);
			  }  
		  }
		  
		 
		
		
	}

}
