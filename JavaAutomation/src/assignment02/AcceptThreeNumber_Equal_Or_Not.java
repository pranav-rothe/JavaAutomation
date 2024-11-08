/* 2.Write a Java program that accepts three numbers and prints "All numbers are equal"
if all three numbers are not equal, print "All numbers are different”.*/
package assignment02;

import java.util.Scanner;

public class AcceptThreeNumber_Equal_Or_Not {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//First user input
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		//Second user input
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		//Third user input
		System.out.println("Enter third number: ");
		int num3=sc.nextInt();

		//Checking the statement all numbers are equal or not
		if(num1==num2 && num2==num3 && num1==num3) {
			System.out.println("All numbers are equals");
		}
		else {
			System.out.println("All numbers are different");
		}
		sc.close();
	}
}
