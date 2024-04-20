package demo;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method

		
		StringBuilder s1 = new StringBuilder("hello");
		System.out.println(s1.reverse());

		String s = "Hello";
		String s2 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			s2 += s.charAt(i);
		}
		System.out.println(s);
		System.out.println(s1);

	}

}
