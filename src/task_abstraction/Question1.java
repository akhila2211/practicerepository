package task_abstraction;

abstract class Animal {
    public abstract void sound();
}


class Lion extends Animal {
    
    public void sound() {
        System.out.println("Lion rrrrr");
    }
}

class Tiger extends Animal {
    
    public void sound() {
        System.out.println("Tiger wwww");
    }
}

public class Question1 {
    public static void main(String[] args) {
         Lion ab= new Lion();
       ab.sound();
       

         Tiger cd = new Tiger();
        cd.sound();
    }
}