package recursion;

public class pla1toN {
	
	public static void print1ton(int n) 
	{
		if(n==6) {
			return;
				}
		
		System.out.println(n);
		print1ton(n+1);
	
		
		
		
		
	}

	public static void main(String[] args) {
	int n=1;
	print1ton(n);

	}

}
