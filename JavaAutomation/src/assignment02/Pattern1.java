// 9.Write a Java program to generate the following * triangles.

package assignment02;

public class Pattern1 {

	public static void main(String[] args) {
		
		//number of rows
		int number=5;
		
		//i for loop --> to print a rows
		for(int i=1;i<=number;i++) {
			//j for loop --> to print a columns
			for(int j=1;j<=i;j++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
	}
}
