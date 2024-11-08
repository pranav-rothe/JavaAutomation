// 8. Write a Java program to generate the following * triangles

package assignment02;

public class Pattern4 {

	public static void main(String[] args) {
		
		//number of rows
		int n=5;
		
		//i for loop --> rows
		for(int i=n;i>=1;i--) {
			//j for loop --> columns spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");				
			}
			//k for loop --> to print
			for(int k=1;k<=i;k++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
	}
}