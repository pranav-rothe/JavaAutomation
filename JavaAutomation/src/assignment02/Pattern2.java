// 10.Write a Java program to generate the following * triangles.

package assignment02;

public class Pattern2 {

	public static void main(String[] args) {
		
		//number of rows
		int n=5;
		
		//i for loop --> rows
		for(int i=n;i>=1;i--) {
			//j for loop --> columns
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
