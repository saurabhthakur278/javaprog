package recursion;

public class Fibonnacci {
	public static void fibbonaci(int a, int b, int n) {
	if(n==0) {return;
	}
	System.out.print(a);
	fibbonaci(b,a+b,n-1);
	
	
	}

	public static void main(String[] args)
	{
		fibbonaci(0,1,7);

	}

}
