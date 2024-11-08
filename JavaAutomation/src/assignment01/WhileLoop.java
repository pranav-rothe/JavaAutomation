package assignment01;

public class WhileLoop
{
	public void methodWhile()
	{
		int num=15;
		int i=1;
		int sum=0;
		//by using while loop
		while(i<=num)
		{
			sum+=i;
			i++;
		}
		System.out.println("By using while Loop--> Sum of first "+num+ " number: "+sum);
	}

	public static void main(String[] args) 
	{
		WhileLoop wl=new WhileLoop();
		wl.methodWhile();
	}

}
