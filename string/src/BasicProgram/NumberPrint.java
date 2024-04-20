package BasicProgram;

public class NumberPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Odd number print 1to 10 
		
		/*
		 * for(int i=1;i<=10;i++) { if(i%2==1) {
		 * System.out.println("This is Odd Number :"+i); } }
		 */
		
		//Even number Print 1 to 600
		
		/*
		 * for(int i=1;i<=600;i++) { if(i%2==0) {
		 * System.out.println("This is Even Number :"+i); } }
		 */
		//Odd number print 1 to 100
		
		/*
		 * for(int i=1;i<=100;i++) { if(i%2==1) {
		 * System.out.println("This is Odd Number :"+i); } }
		 */
		
		//Even Number 1 to 100
		
		/*
		 * for(int i=1;i<=100;i++) { if(i%2==0) {
		 * System.out.println("This is Even Number :"+i); } }
		 */
		
		//Even sum 1 to 90
		int sum=0;
		/*
		 * for(int i=1;i<=90;i++) { if(i%2==0) { sum=sum+i;
		 * System.out.println("Even Number "+ i +" Sum of "+sum); } }
		 * System.out.println("This is Even Number Sum of  :"+sum);
		 */
		
		//Odd Sum 1 to 80
		
		for(int i=1;i<=80;i++) {
			if(i%2==1) {
				sum=sum+i;
				System.out.println("Odd Number "+ i +" Sum of "+sum);
			}
		}
		System.out.println("This is Odd Number Sum of  :"+sum);
		

	}

}
