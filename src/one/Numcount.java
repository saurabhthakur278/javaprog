package one;

import java.util.Scanner;

public class Numcount {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the numner");
		Scanner s = new Scanner(System.in);
		int n1=s.nextInt();
		
		int count=0;
		
		while(n1>0)
		{
			n1=n1/10;
			count = count+1;
			
			
			
		}
System.out.println(count);
	}

}
