package task_abstraction;

abstract class Shape {
     abstract void CalculateArea();
     abstract void CalculatePerimeter();

}

abstract class Circle extends Shape {
double x=3;
	public void calculateArea(){
		System.out.println("Calculate the Area of Circle="+3.14*x*x);
		
	}
	
		public void CalculatePerimeter(){
			System.out.println("CalculatePerimeter of circle="+2*3.14*x);
			} 
		
		}
   


abstract class Triangle extends Shape {
    
	double r=2;
	 public void calculateArea(){
		System.out.println("Calculate the Area of Triangle ="+1/2*r*r);
		
	}
	
		public void CalculatePerimeter(){
			System.out.println("CalculatePerimeter of Triangle="+3*r);
			} 
		
		}
public class Question_2 {
    public static void main(String[] args) {
    	Circle ab =new Circle();
    	Triangle cd = new Triangle();
ab.calculateArea();
ab.CalculatePerimeter();
cd.calculateArea();
cd.CalculateArea();
    }
}
