package IntermediateProgram;

public class CalculateLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="HEllo World";
		
		int lower=0;
		int upper=0;
		
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			
			if(Character.isUpperCase(c)) {
				upper++;
			}else if(Character.isLowerCase(c)) {
				lower++;
			}
		}
         
		System.out.println(" Lower "+lower);
		System.out.println(" Upper "+upper);
		
		
	}

}
