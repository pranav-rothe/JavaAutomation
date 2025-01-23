package javaPractice;

public class A47_NumberSeries {

	public static void main(String[] args) {

		A47_NumberSeries.series(1, 10); // Start generating the series

	}

	public static void series(int startNum, int endNum) {

		if (startNum <= endNum) { // Base condition
			System.out.println(startNum); // Print the current number
			series(startNum + 1, endNum); // Recursive call with incremented startNum
		}
	}

}
