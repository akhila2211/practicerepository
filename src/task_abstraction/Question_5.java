package task_abstraction;

abstract class Vehicle {
	  public abstract void startEngine1();
	  public abstract void stopEngine1();
	}
	abstract class Car extends Vehicle {
	  public void startEngine() {
	    System.out.println("Car Starting  engine");
	  }
	  public void stopEngine() {
	    System.out.println("Car Stopping  engine");
	  }
		abstract class motorcycle extends Vehicle {

	  public void startEngine1() {
	    System.out.println("Motorcycle Starting the engine.");
	  }
	  public void stopEngine1() {
	    System.out.println("Motorcycle: Stopping the engine...");
	  }
	}
	public class Question_5 {
	  public static void main(String[] args) {
	     car xy= new Car();
	     motorcycle uv= new Vehicle();

	    xy.startEngine1();
	    xy.stopEngine1();

	   uv.startEngine1();
	   uv.stopEngine1();
	  }
	}
	}

