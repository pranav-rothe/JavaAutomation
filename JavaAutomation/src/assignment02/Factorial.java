// 6. Write a java program to find a factorial of a given number

package assignment02;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		int fact=1;
		
		//Loop iterate to input number
		for(int i=1;i<=number;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+number+" is: "+fact);
		sc.close();
	}
}
