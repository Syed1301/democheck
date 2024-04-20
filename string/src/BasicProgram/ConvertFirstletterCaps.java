package BasicProgram;

public class ConvertFirstletterCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder n= new StringBuilder();
		String s="hello world hi name";
		boolean next = true;
		String s1="";
		
		for(char c : s.toCharArray()) {
			if(Character.isWhitespace(c)) {
				next=true;
			}
			else if(next){
				n.append(Character.toUpperCase(c));
				next=false;
			}
			else {
				n.append(c);
			}
		}
		System.out.println(n);

	}

}
