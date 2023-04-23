package Basic;

import java.util.Scanner;

public class InputUser {
	public static void main(String args[]) {
	float sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		float a=sc.nextFloat();
		System.out.println("enter the second number");
		float b = sc.nextFloat();
		
	
		
		sum=a*b;
		System.out.println("sum is "+ sum);

	}

}
