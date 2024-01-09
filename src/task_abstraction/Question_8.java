package task_abstraction;

abstract class Shape2D {
	  public abstract void draw();

	  public abstract void resize();
	}
	class Rectangle extends Shape2D {
	 
	  public void draw() {
	    System.out.println("Rectangle Drawing");
	  }
	  public void resize() {
	    System.out.println("Rectangle Resize");
	  }
	}
	
	class Circling extends Shape2D {
	
	  public void draw() {
	    System.out.println("Circle Drawing");
	  }

	  public void resize() {
	    System.out.println("Circle Resize");
	  }
	}
	
	public class Question_8 {
	  public static void main(String[] args) {
	     Rectangle la = new Rectangle();
	     Circling sa = new Circling();
    la.draw();
    la.resize();
    sa.draw();
    sa.resize();
	   
	  }
	}