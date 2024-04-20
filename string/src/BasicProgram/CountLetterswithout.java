package BasicProgram;

public class CountLetterswithout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello 235 world 5";
		int lowercase=0;
		int uppercase=0;
		int digit = 0;
		int special=0;
	    
		for(int i=0;i<a.length();i++) {
			char c = a.charAt(i);
			
			if(Character.isLowerCase(c)) {
			     lowercase++;	
			}
			else if (Character.isUpperCase(c)) {
			     uppercase++;	
			}
			else if(Character.isDigit(c)) {
			     digit++;	
			}
			else {
				special++;
			}
		}

		
		System.out.println("LowerCase "+lowercase);
		System.out.println("Uppercase "+uppercase);
		System.out.println("Digit "+digit);
		System.out.println("Special "+special);
	}

}
