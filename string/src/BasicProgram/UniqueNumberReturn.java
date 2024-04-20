package BasicProgram;

import java.util.HashSet;

public class UniqueNumberReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,5,6,8,2,5};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int n:a) {
			set.add(n);
			
		}
		for(int b:set) {
			System.out.println(b);
		}
		

	}

}
