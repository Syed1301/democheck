package BasicProgram;

import java.util.Scanner;

public class CheckOddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		
		
		if(n%2==0) {
			System.out.println("This Even Number:");
		}
		else {
			System.out.println("This odd Number");
		}

	}

}
