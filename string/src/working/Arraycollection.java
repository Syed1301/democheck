package working;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Arraycollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		/*
		 * int arr[]= {1,2,3,4,1,2,3};
		 * 
		 * Set<Integer> obj = new HashSet<Integer>();
		 * 
		 * for(int i=0;i<arr.length;i++) { obj.add(arr[i]); }
		 * 
		 * Iterator<Integer> it = obj.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(12);
		num.add(34);
		num.add(3);
		num.add(21);
		
		
		
		/*
		 * for(int i=0;i<num.size();i++) { System.out.println(num.get(i)); }
		
		 */
		//using stream for the iteration of value
		num.stream().forEach(x -> System.out.println(x));
		
		num.stream().filter(x -> x%2 ==0).forEach(x -> System.out.println(x));
		
		
		Long a = num.stream().filter(x -> x%2 !=0).count();
		
		System.out.println(a);
		
		
		List<Integer> ab = num.stream().filter(x -> x%2 ==0).collect(Collectors.toList());
		ab.forEach(x -> System.out.println(x));

	}

}
