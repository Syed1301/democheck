package demo;

import java.util.Scanner;

public class AlphabetsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpha = 65;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			
			System.out.println((char)alpha);
			alpha++;
			
		}
		System.out.println();
		
	}

}
