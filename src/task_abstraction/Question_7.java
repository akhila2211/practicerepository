package task_abstraction;

abstract class Instrument {
	  public abstract void play();

	  public abstract void tune();
	}

	class Glockenspiel extends Instrument {
	  
	  public void play() {
	    System.out.println("Glockenspiel Playing ");
	  }

	  public void tune() {
	    System.out.println("Glockenspiel Tuning ");
	  }
	}

	class Violin extends Instrument {
	  @Override
	  public void play() {
	    System.out.println("Violin Playing ");
	  }
	  public void tune() {
	    System.out.println("Violin Tuning ");
	  }
	}
	public class Question_7 {
	  public static void main(String[] args) {
	     Glockenspiel ak= new Glockenspiel();
	   Violin hi = new Violin();
	   ak.play();
	   ak.tune();
	   hi.play();
	   hi.tune();

	  }
	}
