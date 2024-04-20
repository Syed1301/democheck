package BasicProgram;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1235;
		int count=0;
		int tem;
		
		while(num!=0) {
			tem=num%10;
			count+=tem;
			num=num/10;
		}
		System.out.println("Total number sum "+count);
		
	}

}
