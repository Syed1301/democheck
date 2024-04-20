package BasicProgram;

public class CountLetterwith {
	public static void main(String[] args) {
		int count=0;
		String n="Hello1234 World98@";
		// TODO Auto-generated method stub
		int uppercase=countupper(n,count);
		int lowercase=countlower(n,count);
		int digit = countdigit(n,count);
		int special=countspecial(n,count);
		
		System.out.println("the Upper Case Count "+uppercase);
		System.out.println("the Lower Case Count "+lowercase);
		System.out.println("the digit  Count "+digit);
		System.out.println("the Special Count "+special);
		
	}

	
	public static int countupper(String n,int count) {
		
		for(int i=0;i<n.length();i++) {
			if(Character.isUpperCase(n.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	public static  int countlower(String n,int count) {
		
		for(int i=0;i<n.length();i++) {
			if(Character.isLowerCase(n.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	public static int countdigit(String n,int count) {
		
		for(int i=0;i<n.length();i++) {
			if(Character.isDigit(n.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	public static int countspecial(String n,int count) {
		
		for(int i=0;i<n.length();i++) {
			if(!Character.isLetterOrDigit(n.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
