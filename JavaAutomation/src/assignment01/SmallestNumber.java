//10.Write a Java method to find the smallest number among three numbers.
package assignment01;

public class SmallestNumber 
{
	int num1=55;
	int num2=35;
	int num3=50;
	public void smallestNumber()
	{
		if(num1<num2 && num1<num3)
		{
			System.out.println(num1+ " is a Smallest Number.");
		}
		else if(num2<num1 && num2<num3)
		{
			System.out.println(num2+ " is a Smallest Number.");
		}
		else
		{
			System.out.println(num3+ " is a Smallest Number.");
		}
	}
	public static void main(String[] args) 
	{
		SmallestNumber sn=new SmallestNumber();
		sn.smallestNumber();
	}

}
