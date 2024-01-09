package Javastringmethods;



public class Ends_with {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String str = "Welcome to november";  
		String s1="akhila";
		String s2="akhila";
		String s3="Akhila";

		
		//Java String endsWith()
		System.out.println("Java String endsWith");
		System.out.println(str.endsWith("r"));  
		System.out.println(str.endsWith("november"));
		
		//Java String equals()
		System.out.println("Java String equals");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(str));//false because case is not same  

		//Java String equalsIgnoreCase()
		System.out.println("Java String equalsIgnoreCase");
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//Java String replace
		System.out.println("Java String replace");
		String replaceString=s1.replace('a','e');
		System.out.println(replaceString);  

		//Java String split()
		System.out.println("Java String split");
		String[] words=str.split("\\s");
		for(String w:words){  
			System.out.println(w);  
			}  
		//Java String trim() 
		System.out.println("Java String trim");
		 
		  System.out.println(str.trim());
	}

}
