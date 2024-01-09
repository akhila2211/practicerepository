package task_abstraction;
abstract class Bird {
	  public abstract void fly();

	  public abstract void makeSound();
	}

	class Eagle extends Bird {
	  @Override
	  public void fly() {
	    System.out.println("Eagle Fly");
	  }

	
	  public void makeSound() {
	    System.out.println("Eagle yyy");
	  }
	}
	class Hawk extends Bird {
	  @Override
	  public void fly() {
	    System.out.println("Hawk fly.");
	  }

	  public void makeSound() {
	    System.out.println("Haw ssss");
	  }
	}
	public class Question_9 {
	  public static void main(String[] args) {
	    Eagle a = new Eagle();
	     Hawk b = new Hawk();
a.fly();
a.makeSound();
b.fly();
b.makeSound();

	   
	  }
	}
