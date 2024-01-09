package Oops;

class Person {
	private String name; // private = restricted access

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String newName) {
		this.name = newName;
	}

	public void setz(String string) {
		// TODO Auto-generated method stub
		
	}

	public char[] getz() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Encapsulation_java {
	public static void main(String[] args) {
		Person myObj = new Person();
		myObj.setName("John");
		System.out.println(myObj.getName());
	}
}
