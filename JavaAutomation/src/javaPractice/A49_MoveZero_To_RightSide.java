package javaPractice;

public class A49_MoveZero_To_RightSide {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 0, 5, 4, 6, 0, 2, 0, 0, 7 };

		// Expected Output: 1,2,5,4,6,2,5,0,0,0,0

		int nonZeroCountNumber = 0;

		int[] newarr = new int[arr.length];

		for (int num : arr) {
			if (num != 0) {
				newarr[nonZeroCountNumber] = num;
				nonZeroCountNumber++;
			}
		}
		
		for(int num2:newarr) {
			System.out.print(num2+" ");
		}

	}

}
