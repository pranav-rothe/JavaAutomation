//13. Write a Java program to get a number from the user and print whether it
//is positive or negative.

package assignment01;

import java.util.Scanner;

public class PostiveOrNegative 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		
		if(number>0)
		{
			System.out.println(number+ " Postive Number.");
		}
		else if(number<0)
		{
			System.out.println(number+ " Negative Number.");
		}
		else
		{
			System.out.println(number+ " Invalid Number.");
		}
		sc.close();
	}

}
