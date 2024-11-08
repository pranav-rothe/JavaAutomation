package assignment01;

public class Calculator 
{
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int multiply(int a, int b)
	{
		int c=a*b;
		return c;
	}
	public int subtract(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public float divide(int a, int b)
	{
		float c=a/b;
		return c;
	}
	public float remainder(int a, int b)
	{
		float c=a%b;
		return c;
	}
	public static void main(String[] args) 
	{
		Calculator c1=new Calculator();
		System.out.println("Addition: "+c1.sum(23, 65));
		System.out.println("Subtraction: "+c1.subtract(65, 8));
		System.out.println("Multiplication: "+c1.multiply(25, 5));
		System.out.println("Division: "+c1.divide(89, 3));
		System.out.println("Remainder: "+c1.remainder(89, 3));
	}

}
