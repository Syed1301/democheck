package demo;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {9,9,8,7,7,5,3,6,6};
		int len=a.length;
		int b[] = new int[a.length];
		int c=0;
		
		
		
		/*
		 * for(int i=0;i<a.length;i++) {
		 * 
		 * for(int j= i+1;j<a.length;j++) {
		 * 
		 * if(a[i]==a[j]) {
		 * 
		 * System.out.println(a[i]); } } }
		 */
		for(int i=0;i<len-1;i++) {
			if(a[i]!=a[i+1]) {
				b[c++]=a[i];
			}
		}
		 b[c++]=a[len-1];
		 
		 for(int k=0;k<c;k++) {
			 System.out.println(" "+b[k]);
		 }
		 
		
	}	
		


	}

