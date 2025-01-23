package javaPractice;

public class A45_LCM {

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 15;
		int num3 = 18;
		int num4 = 24;

		int max = num4;
		System.out.println(max);

		for (int i = max;; i++) {
			if (i % num1 == 0 && i % num2 == 0 && i % num3 == 0 && i % num4 == 0) {
				System.out.println("LCM of " + num1 + " and " + num2 + " is: " + i);
				break;
			}

		}
	}

}
