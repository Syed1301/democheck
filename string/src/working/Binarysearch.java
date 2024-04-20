package working;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,4,5,7,9,4};
		int target= 890;
		int res=binary(arr,target);
		
		if(res!=0) {
			System.out.println("The Index of Value "+res+" Value "+arr[res]);
		}
		else {
			System.out.println("Element not found");
		}

	}

	public static int binary(int[] arr, int target) {
		// TODO Auto-generated method stub
		int left=0;
		int rigth=arr.length-1;
		
		while(left<=rigth) {
			
			int mid=(left+rigth)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			else if (arr[mid]<target) {
				left=mid+1;
			}
			else {
				rigth=mid-1;
			}
		}
		return 1;
	}

}
