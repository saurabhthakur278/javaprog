package Basic;

import java.util.Scanner;

public class Gcdlcm {
	
	
public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gcd=0;
		int lcm=0;
		
		while(n1%n2!=0)
		 { 
			int rem=n1%n2;
			n1=n2;
			n2=rem;
			 
			 
			 
		 }
		
		
		System.out.print(n2);
}

}