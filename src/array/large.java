package array;

public class large {

	public static void main(String[] args) {
		
		int []a= {4,5,3,2,1};
		
		int max=a[0];
		for(int i=1; i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
				
			}
		  
		}

		System.out.println(max);

	}

}
