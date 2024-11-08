//6.Write a program to calculate the sum of first 15 number using for and while loop.

package assignment01;

public class ForLoop 
{
	public void forMethod()
	{
		int number=15;
		int sum=0;
		//By using for loop
		for(int i=1;i<=number;i++)
		{
			sum+=i;
		}
		System.out.println("By using for Loop--> Sum of first "+number+" number: "+sum);		
	}
	public static void main(String[] args) 
	{
		ForLoop f=new ForLoop();
		f.forMethod();
	}

}
