package BasicProgram;

import java.util.Scanner;

public class ConsonantValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word");
		String s = sc.next();
		s=s.toLowerCase();
	    int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u'){
				System.out.println("The vowel present "+s.charAt(i)+" That Index "+i);
			}
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				
				System.out.println("The Consonant Value "+s.charAt(i)+" Count of "+count++); 
			}
		}

	}

}
