//11.Write a Java method to find the average of three numbers.
package assignment01;

public class AverageOfNumbers 
{
	int num1=200;
	int num2=200;
	int num3=200;
	int avg;
	public void average()
	{
		avg=num1+num2+num3/3;
		System.out.println("Average of three number is: "+avg);
	}
	public static void main(String[] args) 
	{
		AverageOfNumbers a=new AverageOfNumbers();
		a.average();
	}

}
