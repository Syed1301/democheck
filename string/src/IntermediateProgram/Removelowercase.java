package IntermediateProgram;

public class Removelowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n ="HELLO WORLD";
		
		String substring = n.substring(6);
		
		String lower = substring.toLowerCase();
		
		System.out.println(n);
		System.out.println(substring);
		System.out.println(lower);

	}

}
