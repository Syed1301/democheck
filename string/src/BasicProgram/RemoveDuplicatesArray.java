package BasicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]= {2,2,4,5,5,8,2,4,8,5};		
		int k=-1;
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			if(a[i]!=-1) {
				for(int j=i+1;j<n;j++) {
					if(a[i]==a[j]) {
						a[i]=k;
					}
				}
				if(a[i]!=-1) {
				System.out.println(a[i]);
				}
			}
			
		}
		
		
		List <Integer> li = Arrays.asList(a);
		
		Set <Integer> set = new HashSet<Integer>(li);
		
		for(int value : set) {
			//System.out.println(value);
		}
		
		
	}

}
