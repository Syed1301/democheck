package BasicProgram;

public class ArrayEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,7,9,3};
		int b=0;
		int d;
		int c[]= new int[a.length];
		
		
		for(int i=0;i<a.length;i++) {
			d=a[i]%2;
			if(d==0) {
				c[b++]=a[i];
			}
		}
		
		for(int i=0;i<c.length;i++) {
			if(c[i]>0) {
		  System.out.println(c[i]);
			}
		}

	}

}
