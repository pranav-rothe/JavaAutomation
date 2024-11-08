// 5. Write a program to swap the numbers without using third variable.

package assignment02;

public class SwapTwoNumber_Without_Using_Third_Var {

	public static void main(String[] args) {
		
		//taking a two hard-coded integer variable 
		int A=50;
		int B=20;

		System.out.println(">>>> BEFORE SWAPPING <<<<");
		System.out.println("Numbers are "+A+" "+B);
		
		//this a formula of swapping two variable without using third variable
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println();

		System.out.println(">>>> AFTER SWAPPING <<<<");
		System.out.println("Numbers are "+A+" "+B);
	}

}
