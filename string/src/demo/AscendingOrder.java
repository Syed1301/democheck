package demo;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,5,9,1,};
		int b;
		int c;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j = i+1; j<a.length;j++) {
				
				
				 if(a[i]>a[j]) {
				  
				  b=a[i]; 
				  System.out.println("This Ascending Order"+b);
				  
				 }
				 
			
			}
		}
		

	}

}
