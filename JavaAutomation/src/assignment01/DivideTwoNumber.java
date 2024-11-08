package assignment01;

public class DivideTwoNumber 
{
	int num1=25;
	int num2=5;
	public void divide()
	{
		float div=num1/num2;
		System.out.println("Division of two number: "+div);
	}

	public static void main(String[] args) 
	{
		DivideTwoNumber d=new DivideTwoNumber();
		d.divide();
	}

}
