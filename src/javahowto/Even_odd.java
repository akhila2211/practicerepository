package javahowto;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int number = 6;
//	    
//	    if (number % 2 == 0) {
//	      System.out.println(number + " is even.");
//	    } else {
//	      System.out.println(number + " is odd.");
//	    }
	    
		
		//scanner method
	    int c;
	    Scanner num1 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("enter a number:");
	    c = num1.nextInt();
	    
	    if (c % 2 == 0) {
	      System.out.println(c + " is even.");
	    } else {
	      System.out.println(c + " is odd.");
	    
	    
	}
	}
}
