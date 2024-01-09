package javahowto;

import java.util.Scanner;

public class Addition_of2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
	    int b = 6;
	    int add = a + b;
	    System.out.println(add);
	    
	    // scanner method
	    int c, d, sum;
	    Scanner num1 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("enter a number:");
	    c = num1.nextInt(); // Read user input

	    System.out.println("enter another number:");
	    d = num1.nextInt(); // Read user input

	    sum = c + d;
	    System.out.println("Sum is: " + sum);
	    
	    
	    
	}

}
