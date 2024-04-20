package demo;

import java.util.Scanner;

public class MeanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0,i,num,n;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number ");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter value  ");
		
		for(i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		num=sum/n;
		System.out.println("This mean value of is "+num);

	}

}
