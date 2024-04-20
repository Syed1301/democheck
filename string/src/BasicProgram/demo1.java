package BasicProgram;

public class demo1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10, 8,26,36,64,10,26,8};
		int n=arr.length;
		int a[]=new int[n];
		int b[]=new int[n];
		
		for(int i=0;i<=arr.length;i++) {
			if(a[i]>b[i]) {
				b[i]=a[i];
				System.out.println(a[i]);
			}
			
		}
		
	}

	
	

	

}
