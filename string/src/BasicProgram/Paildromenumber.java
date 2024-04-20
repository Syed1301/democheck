package BasicProgram;

public class Paildromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12321;
		int rem=0;
		int res=0;
		int temp=num;
		
		while(num!=0) {
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		
		
		if(temp==res) {
			System.out.println("Is PaildromeNumber ");
		}
		else {
			System.out.println("Is not PaildromeNumebr ");
		}

	}

}
