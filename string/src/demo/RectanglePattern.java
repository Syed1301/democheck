package demo;

public class RectanglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i==1||i==n) {
					System.out.print(" "+" *");
				}
				
			}
			System.out.println("  ");
			
		}

	}

}
