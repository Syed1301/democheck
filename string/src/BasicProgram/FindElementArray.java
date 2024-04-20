package BasicProgram;

import java.util.Scanner;

public class FindElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,4,6,7,1};
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(n==a[i]) {
				System.out.println("This Elements of index "+i);
			}
		}

	}

}
