package demo;

public class Tree {

	public static void main(String[] args) {
		//first
		for(int i=0;i<=5;i++) {
			for(int k=1;k<=5-i+1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//second
		for(int i=0;i<=4;i++) {
			for(int k=1;k<=4-i+1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//third
		for(int i=0;i<=4;i++) {
			for(int k=1;k<=3-i+1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i+3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//fourth
		for(int i=0;i<=2;i++) {
			for(int k=1;k<=5;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
