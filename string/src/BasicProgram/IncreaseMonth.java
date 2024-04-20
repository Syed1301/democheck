package BasicProgram;

import java.time.YearMonth;

public class IncreaseMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		YearMonth y = YearMonth.now();
		
		YearMonth s=y.plusMonths(3);
		
		System.out.println(" "+y);
		
		System.out.println(" "+s);
	}

}
