package BasicProgram;

public class MaximunNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		int a[]= {2,9,7,1,8};
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[j];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
	     System.out.println(a[1]);
	     
	     //Mininum number
	     /*for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[j];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
	     System.out.println(a[1]);
	      * */

	}

}
