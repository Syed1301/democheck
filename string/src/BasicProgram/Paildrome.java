package BasicProgram;

public class Paildrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ValaV";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		
		if(s==s1) {
			System.out.println("Is Paildrome");
		}else {
			System.out.println("Is not Paildrome");
		}

	}

}
