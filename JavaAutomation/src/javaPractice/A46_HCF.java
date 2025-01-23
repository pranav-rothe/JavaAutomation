package javaPractice;

public class A46_HCF {

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 15;
		int num3 = 18;
		int num4 = 24;

		int min = num1;
		System.out.println(min);

		for (int i = min; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0 && num3 % i == 0 && num4 % i == 0) {
				System.out.println("LCM of " + num1 + " and " + num2 + " is: " + i);
				break;
			}

		}
	}

}
