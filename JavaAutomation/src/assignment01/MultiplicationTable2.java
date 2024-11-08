//8.Write a Java program to print multiplication table of 9 - - Expected o/p -> 9*1 = 9
package assignment01;

public class MultiplicationTable2 
{

	public static void main(String[] args) 
	{
		int num=9;
		int mul;
		for(int i=1;i<=10;i++)
		{
			mul=num*i;
			System.out.println(num+ " * " +i+ " = "+mul);
		}

	}

}
