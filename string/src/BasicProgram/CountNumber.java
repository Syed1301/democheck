package BasicProgram;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1235;
		int count=0;
		
		while(num!=0) {
			count++;
			num=num/10;
		}
		System.out.println("Total number Count "+count);
		

	}

}
  