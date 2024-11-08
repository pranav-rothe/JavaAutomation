//5.Write a Java program that accepts four integers from the user and prints
//equal if all four are equal, and not equal otherwise.

package assignment01;

import java.util.Scanner;

public class EqualFour 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		System.out.println("Enter third number: ");
		int num3=sc.nextInt();
		System.out.println("Enter fourth number: ");
		int num4=sc.nextInt();
		
		if(num1==num2 && num2==num3 && num3==num4)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not	 Equal");
		}
		sc.close();
	}

}
