package working;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudent {
	
	public static void main(String[] args) {
		
		Studentdetails s1 = new Studentdetails(23 , "Syed" , "Male",23,false);
		Studentdetails s2 = new Studentdetails(25, "Ali","Male",21,true);
		Studentdetails s3 = new Studentdetails(29, "Mushraf","Male",25,false);
		Studentdetails s4 = new Studentdetails(26, "saroja","Female",28,true);
		Studentdetails s5 = new Studentdetails(27, "hari","Male",23,false);
		
		
		ArrayList<Studentdetails> student = new ArrayList<>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		
		
		HashMap<Integer,Studentdetails> std = new HashMap<>();
		std.put(s1.getId(), s1);
		std.put(s2.getId(), s2);
		std.put(s3.getId(), s3);
		std.put(s4.getId(), s4);
		std.put(s5.getId(), s5);
		
		
		
		Map<Integer,Studentdetails> map = std.values().stream().filter(x -> x.getId() > 21)
				.collect(Collectors.toMap(x ->x.getId(), z->z));
		map.values().forEach(x-> System.out.println(x));
		
	}

}
