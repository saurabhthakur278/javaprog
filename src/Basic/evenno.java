package Basic;

public class evenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;

		for(int no=1;no<=100;no++) {
			
			
			for(int i1=2;i1<no-1;i1++)
			{
				if(no%i1==0) {
					temp=temp+1;
				}
				
				
			}
			
			if(temp==0) {
				System.out.println(no);
			}
		
	}
		

}
}