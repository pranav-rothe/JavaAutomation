package javaPractice;

public class A52_StringSecLarge {

	public static void main(String[] args) {

		String str = "Pra1234nav";

		int large = 0;
		int seclarge = 0;

		char[] c = str.toCharArray();

		for (char ch : c) {
			if (Character.isDigit(ch)) {
				int num = Integer.parseInt(String.valueOf(ch));

				if (num > large) {
					seclarge = large;
					large = num;
				}
			}
		}
		System.out.println("second large: "+seclarge);
	}

}
