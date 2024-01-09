package task_abstraction;
class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employee(double name, int employeeId, float salary) {
        this.name = name;
        this.employeeId = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }


    public double getSalary() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Derived class representing a Manager
class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String department) {
        this.department = department;
    }

    // Additional method specific to managers
    public void manageTeam() {
        System.out.println("Manager " + getName() + " is managing the " + department + " team.");
    }
}

// Derived class representing a Developer
class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(double salary, z programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
        
    }

    // Additional method specific to developers
    public void code() {
        System.out.println("Developer " + getName() + " is coding in " + programmingLanguage + ".");
    }
}

public class Debug_11 {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        Manager manager = new Manager(John Manager,"101, 80000", "Engineering");
        Developer developer = new Developer();

        // Using inheritance to access methods and properties of the superclass
        System.out.println("Manager Information:");
        manager.displayInfo();

        System.out.println("\nDeveloper Information:");
        developer.code();
    }
}



