package javaPractice;

public class A15_Swap_Two_Numbers_WithoutThird {

	public static void main(String[] args) {

		int num1=15;
		int num2=20;
		
		System.out.println("Before swap: "+num1);
		System.out.println("Before swap: "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("===============");

		System.out.println("After swap: "+num1);
		System.out.println("After swap: "+num2);
	}

}
