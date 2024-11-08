//9.Write a Java Program to Check Whether a Given Year is a Leap Year(using
//if-else and if-else-if ladder statement)
package assignment01;

public class LeapYear1 
{

	public static void main(String[] args) 
	{
		//Using if-else statement
		int year=2024;
		if(year%4==0 || year%100==0 || year%400==0)
		{
			System.out.println(year+ " is a Leap Year.");
		}
		else
		{
			System.out.println(year+ " is not Leap Year.");
		}
	}

}
