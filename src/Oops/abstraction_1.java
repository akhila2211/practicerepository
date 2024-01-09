package Oops;



	
	 
    //if a method  doesn't contain any body is called Abstraction method
	// It is not possible  to create an object in Abstract method
	//If a method contains at least one Abstract method ,Then it is called Abstract class
	
	abstract class FoodApp
	{
		abstract void typeofFood();
		abstract void menu();
		abstract void listOfResturant();
	}
	class Italian extends FoodApp
	{
		public void typeofFood()
		{
			System.out.println("Italian Food");
		}
		public void menu()
		{
			System.out.println("Italian Menu");
		}
		public void listOfResturant()
		{
			System.out.println("Italian Resturant");
		}
		
	}
	public class abstraction_1
	{
		public static void main(String args[])
		{
			Italian l1=new Italian();
			l1.typeofFood();
			l1.menu();
			l1.listOfResturant();

	}

}