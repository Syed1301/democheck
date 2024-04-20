package demo;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,5,7};
		int len=a.length;
		int b[]=new int[len];
		
		for(int i=len-1;i>=0;i--) {
			b[i]=a[i];
			//System.out.println(b[i]);
		}
		
       int num=345679;
       int total=0;
       while(num!=0) {
    	   num=num/10;
    	   total++;
       }
       System.out.println("The total number count"+total);
	}

}
