package javaPractice;

public class A11_NumberConsecutive {

	public static void main(String[] args) {
		
		int num1=11;
		int num2=14;
		int num3=13;
		
		if((num2-num1==1) && (num3-num2==1)) {
			System.out.println(num1+", "+num2+", "+num3+" numbers are consecutive.");
		}
		else {
			System.out.println(num1+", "+num2+", "+num3+" numbers are not consecutive.");
		}

	}

}
