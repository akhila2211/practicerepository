package Oops;


	abstract class Shape{  
		abstract void area();  
		abstract void perimeter();  

		}  
		 
		class circle extends Shape{  
		void draw(){
			System.out.println("drawing circle");
			}

		@Override
		void area() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void perimeter() {
			// TODO Auto-generated method stub
			
		}  
		}  
		class triangle extends Shape{  
		void draw(){
			System.out.println("drawing triangle");
			}

		@Override
		void area() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void perimeter() {
			// TODO Auto-generated method stub
			
		}  
		}  
		
		class Abstraction_shape{  
		public static void main(String args[]){  
		circle c= new circle();
		}
		}
		
