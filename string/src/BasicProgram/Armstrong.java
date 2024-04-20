package BasicProgram;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=370;
		int total=0;
		int a;
		int temp=num;
		
		while(num!=0) {
			a=num%10;
			total=total+a*a*a;
			num=num/10;
			
		}
		
		  if(total==temp) { 
			  System.out.println("This Armstrong is "+total); }
		  else {
		  System.out.println("is Not Armstrong "+total); }
		 

	}

}
