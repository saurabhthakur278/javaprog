package array;

public class longestelementinArray {

	public static void main(String[] args)
	{
		int[] a= {1,3,9,4,5,6};
		int max =a[0];
		int min;
		for(int i=1;i<a.length;i++){
			if(a[i] > max)
			{
			max=a[i];
		  }
		
		
		}System.out.print(max);
	}

}
