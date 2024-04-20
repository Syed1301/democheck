package demo;

public class TwoArrayadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,5,3,6};
		int b[] = {4,1,7,6,9};
		int a1 = a.length;
		int b1 = b.length;
		int c1 = a1+b1;
		
		int c[] = new int[c1];
		
		for(int i=0;i<a1;i++) {
			c[i]=a[i];
		}
		
		int j=0;
		for(int i=a1;i<c1;i++) { 
			c[i]=b[j];
			j++;
		}
		for(int i=0;i<c.length;i++) {
			System.out.println("Add Two Array "+c[i]);
		}
		
		

	}

}
