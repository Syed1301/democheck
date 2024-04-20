package pack;

import java.util.HashSet;
import java.util.Set;

public class PrintCommonvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="c,java,sql,mysql,go,kotlin";
		String b="sql,.net,c++,go,kotlin";
		
	    Set<String> set1=new HashSet<>();
	    Set<String> set2=new HashSet<>();
	    
	    String c[]=a.split(",");
	    String d[]=b.split(",");
	    
	    for(String value1:c) {
	    	set1.add(value1.trim());
	    }
	    for(String value2:d) {
	    	set2.add(value2.trim());
	    }
	    
	    set1.retainAll(set2);
	    
	    StringBuilder result = new StringBuilder();
	    for(String demo:set1) {
	    	result.append(demo).append(", ");
	    }
	    System.out.println(result);

	}

}
