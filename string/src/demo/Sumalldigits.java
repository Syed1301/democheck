package demo;

import java.util.Scanner;

public class Sumalldigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0,num,sum=0,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		temp=num;
		
		while(temp!=0) {
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		System.out.println("Sum number "+num+" the elements "+sum);

	}

}
