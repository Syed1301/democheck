package BasicProgram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class increaseCurrentdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//by 10 
		LocalDate t = LocalDate.now();
		
		LocalDate t1 = t.plusDays(10);
		
		
		System.out.println(" "+t);
		System.out.println(" "+t1);

	}

}
