package one;

public class Countno {
	
	
	public static void  printDigits4(int num) {
	    char[] digits = Integer.toString(num).toCharArray();
	    for (int i = 0; i < digits.length; i++) 
	    {
	        System.out.println("digit: " + digits[i]);
	    }
	
	
	}
	public static void main(String[] args) {
		
		int num =2345009;
		
		printDigits4(num) ;
		    

}
}