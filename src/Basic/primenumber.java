package Basic;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int n=1; n<=100; n++) {
		//vary imp to here to right temp in the loop 
		// if you write outside it will get run only 3 time 4 comes it breack	
			int temp = 0;
		for(int i=2 ;i<n;i++) 
		{
			
			if(n%i==0)
			{
				temp=temp+1;
			}
			
		}
		if(temp ==0 )
		{
			System.out.println(n);
		}
		
	}

}
}