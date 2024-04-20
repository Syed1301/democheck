package BasicProgram;

import java.time.Year;

public class IncreaseYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Year y = Year.now();
		
		Year m = y.plusYears(10);
		
		System.out.println(" "+y);
		
		System.out.println(" "+m);

	}

}
