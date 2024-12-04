package javaPractice;

public class A22_Calculator {

	public static void main(String[] args) {

		System.out.println(additon(10.18, 10.36));
		System.out.println(modulus(25, 2));

	}

	public static double additon(double num1, double num2) {
		return num1+num2;
	}

	public static double multiplication(double num1, double num2) {
		return num1*num2;
	}

	public static double substraction(int num1, int num2) {
		return num1-num2;
	}

	public static double divsion(int num1, int num2) {
		return num1/num2;
	}

	public static double modulus(int num1, int num2) {
		return num1%num2;
	}

}
