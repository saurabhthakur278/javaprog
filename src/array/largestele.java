package array;


import java.util.Arrays;

public class largestele {
	
	public static int  m1(int []a) {
	
		
		Arrays.sort(a);
		return a[a.length-1];
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {5,7,9,2,1,4};
		System.out.println(m1(a));
		
	}

}
