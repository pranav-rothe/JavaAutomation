package javaPractice;

public class A26_Second_Largest_Number {

	public static void main(String[] args) {

		int arr[]= {4,1,6,5,9,10,3};
		int largest=0;
		int secondLarge=0;

		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>largest) {
				secondLarge=largest;
				largest=arr[i];
			}			
		}
		System.out.println("Second largest number in array: "+secondLarge);
	}

}
