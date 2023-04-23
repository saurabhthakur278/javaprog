package recursion;

public class sumfoN {
	
	public static void sumofN(int n, int sum) {
		if(n==0) {
			System.out.println(sum);
			return;
		}
	
		sum=sum+n;
		sumofN(n-1, sum);
	
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		sumofN(5, 0);
	}

}
