//1.Write a Java program to print the sum of two numbers.

package assignment01;

public class SumOfTwoNumbers 
{
	int num1;
	int num2;
	int sum;
	public SumOfTwoNumbers(int a,int b)
	{
		num1=a;
		num2=b;
		sum=num1+num2;
	}
	public static void main(String[] args) 
	{
		SumOfTwoNumbers s=new SumOfTwoNumbers(20, 60);
		System.out.println("Sum of two number: "+s.sum);
	}

}
