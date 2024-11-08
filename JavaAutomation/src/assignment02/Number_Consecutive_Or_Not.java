//3.Check whether the three numbers are consecutive or not

package assignment02;

import java.util.Scanner;

public class Number_Consecutive_Or_Not {

	//create public static boolean return type method with three parameter
	public static boolean areConsecutive(int num1, int num2, int num3) {

		//create a two variable to check which number is maximum & minimum by using max & min method
		int max=Math.max(num1, (Math.max(num2, num3)));
		int min=Math.min(num1, (Math.min(num2, num3)));

		//create a one variable to find middle value
		int middle=num1+num2+num3-max-min;

		//return the boolean value
		return (middle-min==1 ) && (max-middle==1);		
	}
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

		//we called a static boolean method in static main and check if number are consecutive or not
		if(areConsecutive(num1,num2,num3)) {
			System.out.println("Number "+num1+", "+num2+", "+num3+" are consecutive numbers.");
		}
		else {
			System.out.println("Number "+num1+", "+num2+", "+num3+" are not consecutive numbers.");
		}
		sc.close();
	}

}
