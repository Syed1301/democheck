package BasicProgram;

public class PrintNumberCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "The value of Number";
		int count=0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("The total number of Value "+count);
		

	}

}
