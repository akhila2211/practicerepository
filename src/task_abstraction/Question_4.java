package task_abstraction;

abstract class Animal1 {
    public abstract void eat();
    public abstract void sleep();

}


abstract class Lion1 extends Animal1 {
    
    public void eat() {
        System.out.println("Lion eat");
    }
        public void sleep() {
            System.out.println("Lion sleep");
    }
}

abstract class Tiger1 extends Animal1 {
    
    public void eat() {
        System.out.println("Tiger eat");
    }
    public void sleep() {
        System.out.println("tiger sleep");
    }
}

public class Question_4 {
    public static void main(String[] args) {
         Lion1 ab= new Lion1();
       ab.eat();
       ab.sleep();
       

         Tiger1 cd = new Tiger(1);
        cd.eat();
        cd.sleep();
    }
}
