package javahowto;

import java.util.Scanner;

public class Area_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length = 16;  
	    int width = 8;  
	    int area = length * width;  
	    System.out.println("Area of rectangle: " + area);
	    
	    //scanner method
	    
	    int c, d, rec;
	    Scanner num1 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("enter a number:");
	    c = num1.nextInt(); // Read user input

	    System.out.println("enter another number:");
	    d = num1.nextInt(); 

	    rec = c * d;
	    System.out.println("area is: " + rec);
	}

}
