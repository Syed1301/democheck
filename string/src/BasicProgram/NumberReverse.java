package BasicProgram;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123;
		int rem=0;
		int res=0;
		
		while(num!=0) {
			 
			rem=num%10;
			res=res*10+rem;
			num=num/10;
			
		}
		System.out.println("After number Reverse "+ res);
		

	}

}
