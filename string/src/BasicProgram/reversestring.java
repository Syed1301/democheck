package BasicProgram;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Syed";
		
		StringBuffer s = new StringBuffer(name);
		System.out.println(s.reverse());
		
		
		String d="";
		int n =name.length();
		
		for(int i=n-1;i>=0;i--) {
			d+=name.charAt(i);
		}
		System.out.println(d);

	}

}
