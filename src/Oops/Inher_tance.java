package Oops;

public class Inher_tance {

	class Employee {
	    int salary = 60000;
	}
	 
	
	class Engineer extends Employee {
	    int benefits = 10000;
	}
	 
	
	class abc {
	    public void main(String args[])
	    {
	        Engineer E1 = new Engineer();
	        System.out.println("Salary : " + E1.salary
	                           + "\nBenefits : " + E1.benefits);
	    }

		public void run() {
			// TODO Auto-generated method stub
			
		}
	}
	
}
