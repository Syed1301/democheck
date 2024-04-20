package demo;

import java.util.Scanner;

public class ArmstrongnumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,n2,i,temp,rem,count=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First Number");
		n1=sc.nextInt();
		System.out.println("Enter the second Number");
		n2=sc.nextInt();
		
		for(i=n1+1;i<n2;i++) {
			temp=i;
			n=0;
			while(temp!=0) {
				rem=temp%10;
				n=n+rem*rem*rem;
				temp=temp/10;
				
			}
			if(i==n) {
				if(count==0) {
					System.out.println("ArmStrong are number is \n");
					
				}
				System.out.print(i+" ,");
				count++;
			}
			if(count==0) {
				System.out.println("The are have not in Armstrong");
			}
		}

	}

}
