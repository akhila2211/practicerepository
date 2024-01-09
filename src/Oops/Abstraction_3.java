package Oops;

//abstract class Animal {
//	  
//	  //public abstract void animalSound11();
//	  abstract void lion();
//	  abstract void tiger();
//	}
//	abstract class animalSound1 extends Animal
//	{
//		public void lion()
//		{
//			System.out.println(" animalSound1rrrrr");
//		
//		}
//			public void tiger()
//			{
//				System.out.println(" animalSound1wwwww");
//			}
//		
//		
//	}
//	public class Abstraction_3
//	{
//		public void main(String args[])
//		{
//			animalSound1 my=new animalSound1();
//			
//		}
//
	//}
	
abstract class Animal{  
abstract void Sound();

public void lion() {

	
}  
}  
 
abstract class lion extends Animal{  
void sound(){
	System.out.println("lion rrrrr");
	}  
}  
class tiger extends Animal{  
void Sound(){
	System.out.println("tiger wwwww");}  
}  

public class Abstraction_3{
 
public static void main(String args[]){  
Animal s=new Animal();
s.lion();  
s.Sound();
}  
}  
