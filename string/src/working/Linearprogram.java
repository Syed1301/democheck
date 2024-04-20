package working;

public class Linearprogram {
	
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,12,4,5,8};
		int target = 4;
		int res =0;
		//char b;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
	      res=i;
		}
		}
		System.out.println(res);
		}	
		
		

}

