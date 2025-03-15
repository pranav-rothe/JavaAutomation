package javaPractice;

public class A26_Second_Largest_Number {

	public static void main(String[] args) {

		int arr[] = { 26, 43, 33, 17, 66, 56 };
//		int[] arr = { 25, 42, 32, 16, 65, 55 };
		int largest = 0;
		int secondLarge = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > largest) {
				secondLarge = largest;
				largest = arr[i];
			} 
			else if (arr[i] > secondLarge && arr[i] != largest) {
				secondLarge = arr[i];
			}
		}
		System.out.println("Second largest number in array: " + secondLarge);
	}

}
