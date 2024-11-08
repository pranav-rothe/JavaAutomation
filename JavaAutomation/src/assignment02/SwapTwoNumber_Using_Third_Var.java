// 4. Write a program to swap a two number
package assignment02;

public class SwapTwoNumber_Using_Third_Var {

	public static void main(String[] args) {

		//taking a two hard-coded integer variable 
		int A=10;
		int B=20;

		System.out.println(">>>> BEFORE SWAPPING <<<<");
		System.out.println("Numbers are "+A+" "+B);

		//taking a third temporary variable to store a value
		int temp;

		//this a formula of swapping two variable using third variable
		temp=A;
		A=B;
		B=temp;

		System.out.println();

		System.out.println(">>>> AFTER SWAPPING <<<<");
		System.out.println("Numbers are "+A+" "+B);
	}

}
