package IntermediateProgram;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChangeStringToDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "2024-04-09 12:30:45";
        String formatPattern = "yyyy-MM-dd HH:mm:ss";
        
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern(formatPattern);
		
		LocalDateTime d = LocalDateTime.parse(inputString, dateformat);
		
		System.out.println("Change String into DateTime Format "+d);

	}

}
