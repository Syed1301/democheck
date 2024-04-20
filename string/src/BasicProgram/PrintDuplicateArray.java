package BasicProgram;

import java.util.Arrays;

public class PrintDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array []= {3,3,9,9,2};
		int n=0;
		int n1=array.length;
		int array1[]=new int[n1];
		
		//wrong program
		
		for(int i=0;i<n1-1;i++) {
			if(array[i]!=array[i+1]) {
				array1[n++]=array[i];
			}
		}
		array1[n++]=array[n];
		
		for(int i=0;i<n;i++) {
			//if(array1[i]!=0) 
			System.out.println(array1[i]);
		
		}
         
	}

}
