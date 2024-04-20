package BasicProgram;

public class AscendingOrder {
	
	
	
	
	public static void main(String[] args) {
		
		int []a= {5,3,2,6,2};
		int n=a.length;
		int temp=0;
		
		//Ascending order
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<n;i++) {
			//System.out.println(a[i]);
		}
		//Dscending order
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		 
	}

}
