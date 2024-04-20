package BasicProgram;

public class ReversewithremoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n ="Hello world";
		String s="";
		
		
		
		for(int i=n.length()-1;i>=0;i--) {
			
		for(int j=i+1;j>0;j--) {
			if(n.charAt(i)==n.charAt(j)) {
				s+=n.charAt(i);
			}
		}
		}
		System.out.println(s);
		
	}

}
