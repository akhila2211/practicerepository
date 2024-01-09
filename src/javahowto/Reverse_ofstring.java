package javahowto;

public class Reverse_ofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalStr = "Akhila";
	    String reversedStr = "";
	    System.out.println("Original string: " + originalStr);
	        
	    for (int i = 0; i < originalStr.length(); i++) {
	      reversedStr = originalStr.charAt(i) + reversedStr;
	    }
	    
	    System.out.println("Reversed string: "+ reversedStr);

	}

}
