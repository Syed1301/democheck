package BasicProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {23,4,6,98,1,0};
		int temp=0;
		
		//Arrays.sort(array);
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		

	}

}
