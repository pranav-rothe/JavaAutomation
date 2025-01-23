package newPatternLogic;

public class AllPatterns {

	public static void main(String[] args) {

		int n = 5;

		// 1. Simple Triangle Pattern
		System.out.println("1. Simple Triangle Pattern");
		for (int i = 1; i <= n; i++) {
			System.out.println("* ".repeat(i));
		}

		System.out.println();

		// 2. Inverted Triangle Pattern
		System.out.println("2. Inverted Triangle Pattern");
		for (int i = n; i >= 1; i--) {
			System.out.println("* ".repeat(i));
		}

		System.out.println();

		// 3. Right-Aligned Triangle Pattern
		System.out.println("3. Right-Aligned Triangle Pattern");
		for (int i = 1; i <= n; i++) {
			System.out.print("  ".repeat(n - i)); // not new line, 2 spaces and n-i
			System.out.println("* ".repeat(i));
		}

		System.out.println();

		// 4. Right-Aligned Inverted Triangle Pattern
		System.out.println("4. Right-Aligned Inverted Triangle Pattern");
		for (int i = n; i >= 1; i--) {
			System.out.print("  ".repeat(n - i)); // not new line, 2 spaces and n-i
			System.out.println("* ".repeat(i));
		}

		System.out.println();

		// 5. Pyramid Pattern
		System.out.println("5. Pyramid Pattern");
		for (int i = 1; i <= n; i++) {
			System.out.print(" ".repeat(n - i)); // not new line, 2 spaces and n-i
			System.out.println("*".repeat(2 * i - 1));
		}

		System.out.println();

		// 6. Inverted Pyramid Pattern
		System.out.println("6. Inverted Pyramid Pattern");
		for (int i = n; i >= 1; i--) {
			System.out.print(" ".repeat(n - i)); // not new line, 2 spaces and n-i
			System.out.println("*".repeat(2 * i - 1));
		}

		System.out.println();

		// 7. Diamond Pattern
		System.out.println("7. Diamond Pattern");
		for (int i = 1; i <= 2 * n - 1; i++) {
			int row = (i <= n) ? i : (2 * n - i);
			System.out.print(" ".repeat(n - row)); 
			System.out.println("*".repeat(2 * row - 1));
		}
	}

}
