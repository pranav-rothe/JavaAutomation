//9.Write a Java Program to Check Whether a Given Year is a Leap Year(using
//if-else and if-else-if ladder statement)
package assignment01;

public class LeapYear2 
{
	static int year=2024; //Static Global variable declared
	public static void main(String[] args) 
	{
		//Using if-else-if ladder		
		if(year%4==0)
		{
			System.out.println(year+ " is a Leap Year.");
		}
		else if(year%100==0)
		{
			System.out.println(year+ " is a Leap Year.");
		}
		else if(year%400==0)
		{
			System.out.println(year+ " is a Leap Year.");
		}
		else
		{
			System.out.println(year+ " is not a Leap Year.");
		}

	}

}
