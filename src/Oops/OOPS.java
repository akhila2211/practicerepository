package Oops;


	class Student{ 
		int rollNo;
		private String name;
		private String surname; 
		Student(String studentName, String studentSurname, int studentRollNo){ 
			this.name= studentName; 
			this.surname = studentSurname; 
			this.rollNo= studentRollNo; 
		} 
		public void getStudentDetails(){ 
			System.out.println("The name of the student is "+ this.name +" "+ this.surname); 
			System.out.println("The roll no of the student is "+ this.rollNo); 
		} 
		} 
		class OOPS{ 
		public static void main(String args[]) { 
			Student ab = new Student("akhila", "reddy", 01);
			ab.getStudentDetails();
			
		} 
		}
		
