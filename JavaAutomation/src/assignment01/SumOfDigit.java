//12.Write a Java method to find the sum of digits in an integer.
//Example. - 234 - Output - 9

package assignment01;

public class SumOfDigit 
{
	int number=234;
	int sum=0;
	public void sumOfDigit()
	{
		while(number>0)
		{
			int digit=number%10;
			sum+=digit;
			number=number/10;
		}
		System.out.println("Sum of three digit number: "+sum);
	}	
	public static void main(String[] args) 
	{
		SumOfDigit s=new SumOfDigit();
		s.sumOfDigit();
	}

}
