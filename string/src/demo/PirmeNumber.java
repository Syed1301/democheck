package demo;

import java.util.Scanner;

public class PirmeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = sc.nextInt();
	    boolean flag = false;
	    
	    for(int i = 2; i<a/2; i++) {
	    	if(a%i==0) {
	    		flag = true;
	    		break;
	    	}
	    }
	    if(!flag) {
	    	System.out.println("This pirme Number  " + a);
	    }else {
	    	System.out.println("This is not Prime Number "+ a);
	    }
	

	}

}
