package BasicProgram;

import java.util.Scanner;

public class ConsontatStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word");
		String s = sc.next();
		s=s.toLowerCase();
		int count=0,con=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u'){
				count++;
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				con++;
			}
		}
		System.out.println("The number vowel "+count);
		System.out.println("The number Consontat "+con);

	}

}
