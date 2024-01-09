package task_abstraction;



abstract class BankAccount {
    public abstract void Deposit();
    public abstract void Withdraw();

}

abstract class SavingsAccount extends BankAccount  {
	
	public void Deposit(){
		System.out.println("Calculate the deposit");
		
	}
	
		public void Withdraw(){
			System.out.println("Calculate Withdraw");
			} 
		
		}
   


abstract class CurrentAccount extends BankAccount {
    
	
	 public void Deposit(){
		System.out.println("Calculate the Deposit");
		
	}
	
		public void Withdraw(){
			System.out.println("Calculate Withdraw");
			} 
		
		}
public class Question_3 {
    public static void main(String[] args) {
    	SavingsAccount  a = new SavingsAccount(); 

    }
}

