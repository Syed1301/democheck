package demo;

public class FindNumberOfArray {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,2,1,4,5,6,2};
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		int b[] = new int[max+1];
		
		for(int i =0;i<a.length;i++) {
			b[a[i]]++;
		}
		
		for(int i=0;i<=max;i++) {
			if(b[i]<1) {
				System.out.println(i+"-"+b[i]);
			}
		}

	}

}
