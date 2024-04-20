package demo;

public class Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {9,4,2,1,6};
		int b[]=new int[a.length];
		int c=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[i+1]) {
				b[c++]=a[i];
			}
			
		}
		b[c++]=a[a.length-1];
		
		for(int k=0;k<b.length;k++) {
			System.out.println(b[k]);
		}

	}

}
