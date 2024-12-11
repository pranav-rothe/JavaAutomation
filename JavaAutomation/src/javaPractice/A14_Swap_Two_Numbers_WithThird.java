package javaPractice;

public class A14_Swap_Two_Numbers_WithThird {

	public static void main(String[] args) {

		int num1=11;
		int num2=12;

		System.out.println("Before swap: "+num1);
		System.out.println("Before swap: "+num2);

		int temp=num1;
		num1=num2;
		num2=temp;

		System.out.println("===============");

		System.out.println("After swap: "+num1);
		System.out.println("After swap: "+num2);

	}

}
