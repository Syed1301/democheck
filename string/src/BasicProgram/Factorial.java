package BasicProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int i,sum=1;
		
		for(i=0;i<n;i++) {
		   sum+=sum*i;
		   System.out.println(sum);
		}

	}

}
