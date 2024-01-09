package Oops;


	
	 abstract class MyTest 
	{ 
	   abstract void calculate(int a, int b); // No body. 
	} 
 class Addition extends MyTest 
	{ 
	   void calculate(int a, int b)
	   { 
	      int x = a + b; 
	      System.out.println("sum:" +x); 
	   } 
	} 
	 class Subtraction extends MyTest 
	{ 
	   void calculate(int a, int b)
	   { 
	      int y = a - b; 
	      System.out.println( "Subtract:" +y); 
	   } 
	} 
	 class Multiplication extends MyTest 
	{ 
	   void calculate(int a, int b)
	   { 
	      int z = a * b; 
	      System.out.println("Multiply:" +z); 
	   } 
	} 
	public class Abstract_c { 
		public static void main(String args[])

	{ 
	 // Creating objects of classes. 
	    Addition a = new Addition(); 
	    Subtraction s = new Subtraction(); 
	    Multiplication m = new Multiplication(); 
	    
	 // Calling methods by passing argument values.
	    a.calculate(20, 30); 
	    s.calculate(10, 5); 
	    m.calculate(10, 20); 
	 } 
	}