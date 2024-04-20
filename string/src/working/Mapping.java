package working;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String , String> obj = new HashMap<String , String>();
		
		obj.put("hello", "display");
		obj.put("Welcome", "here");
		
		System.out.println(obj.get("hello"));
		
		String n="here";
		
		
		
		List<String> keys = obj.entrySet().stream()
                .filter(entry -> entry.getValue().equals(n))
                .map(Map.Entry::getKey)
                .toList();
		
		System.out.println(keys);
		
	    
	}
}
