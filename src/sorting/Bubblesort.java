package sorting;

public class Bubblesort {
	public static void main(String [] args) {

	int a[]={12,32,34,55,98};
	int temp;
	for(int i=0;i<a.length;i++) {
		
		int flag=0;
		
		for(int j=0;j<a.length-1-i;j++) {
			if(a[i]<a[j+1]) {
				temp=a[i];
				a[i]=a[j+1];
				a[j+1]=temp;
				
			}
		}
		if(flag==0) {break;}
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	}
}
 