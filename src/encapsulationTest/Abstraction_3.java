package encapsulationTest;



abstract class Animal{  
abstract void Sound();

public void lion() {
	// TODO Auto-generated method stub
	
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
Sound s=new Sound();
s.lion();  

}  
}  


