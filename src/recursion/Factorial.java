package recursion;


public class Factorial {
	
	public static void fact1(int n, int fact) {
		if(n==0) {
			System.out.println(fact);
			return;
		}
		
		
		fact*=n;
		fact1(n-1, fact);
		//System.out.println(n);
	}
	
	

	public static void main(String[] args) {
		
		fact1(4, 1);

	}

}
