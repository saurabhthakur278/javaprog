package one;

public class Rev{

	public static void main(String[] args) {
		
		String a="saurabh";
	    String rev = "";
	    a.length();
	    
	    for(int i=a.length()-1;i>0;i--)
	    {
	    	rev=rev+a.charAt(i);
	    	
	    }
		
		System.out.println(rev);
		
	}
	}

