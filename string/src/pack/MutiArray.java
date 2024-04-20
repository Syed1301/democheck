package pack;

public class MutiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2,3},{2,3,4},{5,4,1}};
		int b[][]= {{2,3,4},{4,1,5},{6,4,2}};
		
		int c[][]=new int [3][3];
		
		System.out.println("Addtion ");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
              System.out.print(c[i][j]+",");
			}
			System.out.println();
		}

		
		System.out.println("Subraction");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]-b[i][j];
              System.out.print(c[i][j]+",");
			}
			System.out.println();
		}
		
		System.out.println("Muti");
		for(int i=0;i<3;i++) {
			
		}
		
	}

}
