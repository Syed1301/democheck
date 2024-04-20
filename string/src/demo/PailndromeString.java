package demo;

public class PailndromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "level";
		char b[]=s.toCharArray();
		String s1="";
		
		for(int i=b.length-1;i>=0;i--) {
			s1+=b[i];
		}
		if(s.equals(s1)) {
			System.out.println("PaildromeString is ");
		}
		else {
			System.out.println("Is not PaildromeString ");
		}
		 

	}

}
