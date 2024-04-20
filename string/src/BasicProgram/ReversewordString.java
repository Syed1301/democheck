package BasicProgram;

public class ReversewordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World";
		int n=s.length();
		StringBuilder x = new StringBuilder();
		String a []=s.split("");
		
		
		for(String b:a) {
			StringBuilder y = new StringBuilder(b);
			System.out.println(y.reverse());
		}
		System.out.println();
		
		String s1="";
		
		for(int i=n-1;i>=0;i--) {
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
		

	}

}
