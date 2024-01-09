package task_abstraction;

abstract class Person {
	  public abstract void eat();

	  public abstract void exercise();
	}

	
	class Athlete extends Person {
	  public void eat() {
	    System.out.println("Athlete eat");
	  }

	  public void exercise() {
	    System.out.println("Athlete excercise");
	  }
	}
	
	class LazyPerson extends Person {
	  
	  public void eat() {
	    System.out.println("LazyPerson eat");
	  }

	  public void exercise() {
	    System.out.println("LazyPerson excercise");
	  }
	}
	
	public class Question_6 {
	  public static void main(String[] args) {
	    Person athlete = new Athlete();
	    Person lazyPerson = new LazyPerson();
	    athlete.eat();
	    athlete.exercise();
	    lazyPerson.eat();
	    lazyPerson.exercise();
	  }
	}


