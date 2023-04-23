package Basic;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("even number");
		
		}
		else 
			System.out.println("odd number");
		
		System.out.println();
	}

}
