package demo;

public class pailndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12321; int reverse=0 ; int rem ; 
		
		int originalnum = num;
		
		while(num!=0) {
			rem = num%10;	
			reverse =reverse*10+rem;
			num/=10;
			
		}
		
		if(originalnum==reverse) {
			System.out.println("Pailndrome "+ originalnum);
		}else {
			System.out.println("Pailndrome not "+originalnum);
		}

	}

}
