package demo;

public class ErrorException extends Exception {
	
	public ErrorException(String string) {
		// TODO Auto-generated constructor stub
	}

	static int vote(int age) throws ErrorException {
		
			if(age>18) {
				throw new ErrorException("Allowing");
			}else {
				System.out.println("Not allowing");
			}
			return age;
		
		
	}

	public static void main(String[] args) throws ErrorException {
		// TODO Auto-generated method stub
		vote(19);
		

	}

}
