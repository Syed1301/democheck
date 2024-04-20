package working;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NameSearchArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> listname = new ArrayList<String>();
		
	   listname.add("Ravi");
	   listname.add("Velu");
	   listname.add("Rahul");
	   listname.add("Siva");
	   listname.add("Azar");
	   
	  // Scanner sc = new Scanner(System.in);
	 //  System.out.println("Enter the char ");
	  // String s =sc.next();
	 
	   
	  for(int i=0;i<listname.size();i++) {
		  if(listname.get(i).equals("Velu")) {
			  System.out.println(listname.get(i));
		  }
	  }
	  for(int i=0;i<listname.size();i++) {
		  if(listname.get(i).startsWith("S")) {
			  System.out.println(listname.get(i));
		  }
	  }
	    
	   
	   
	   
	    
	   

	}

}
