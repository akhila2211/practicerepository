package task_abstraction;


//Abstract class representing a university person
abstract class UniversityPerson {
String name;
int id;

// Constructor
public UniversityPerson(String name, int id) {
   this.name = name;
}

// Abstract method to display information about the person
abstract void display();
}

//Concrete class representing a professor
class Professor  {
String department;

// Constructor
public Professor() {
   this.department = department;
}

// Implementation of the abstract method to display professor information
void display() {
   System.out.println("Professor - Name: " + name + ", ID: " + id + ", Department: " + department);
}
}

//Concrete class representing an administrative staff
class AdministrativeStaff extends UniversityPerson {
String role;

// Constructor
public AdministrativeStaff(int id, String name, String role) {
   super(name11);
}

// Implementation of the abstract method to display staff information
@Override
void display() {
   System.out.println("Administrative Staff - Name: " + name + ", ID: " + id + ", Role: " + role);
}
}

//Concrete class representing a student
class Student extends UniversityPerson {
String major;

// Constructor
public Student() {
   this.major2 = major;
}

// Implementation of the abstract method to display student information
void display() {
   System.out.println("Student - Name: " + name + ", ID: " + id + ", Major: " + major);
}
}

public class Debug_1 {
public static void main(String[] args) {
   // Creating objects of concrete classes
   Professor professor = new Professor();
   UniversityPerson staff = new AdministrativeStaff( 201, "Admin Assistant", "amit");
   UniversityPerson student = new Studentt();

   // Using abstraction to display information about university persons
   professor.display();
   staff.display();
   student.display();
}


}

