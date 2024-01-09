package Oops;

abstract class Shape3d{  
	abstract void calculateVolume();  
	abstract void calculateSurfacearea();  

	}  
	 
	 abstract class Sphere extends Shape3d{ 
		int x=3;
	void calculateVolume(){
		System.out.println("Calculate the Volume of Sphere="+4/3*3.14*x*x*x);
		
	}
	
		void Surfacearea(){
			System.out.println("Calculate the Surfacearea of sphere="+4/3*3.14*x*x);
			} 
		
		}
	abstract class Cube extends Shape3d{ 
		int r=4;
	void calculateVolume(){
		System.out.println("Calculate the Volume of Cube="+r*r*r);
		
	}
	
		void Surfacearea(){
			System.out.println("Calculate the Surfacearea of Cube="+6*r*r);
			} 
		
		}
public class Abc {
	public static void main(String args[]) {
		Sphere sa=new Sphere();
		Cube de=new Cube();
		sa.calculateSurfacearea();
		sa.calculateVolume();
		de.calculateSurfacearea();
		de.calculateVolume();
	}
	}