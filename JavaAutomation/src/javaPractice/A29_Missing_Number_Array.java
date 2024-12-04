package javaPractice;

public class A29_Missing_Number_Array {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 5, 6, 4, 8, 9, 10, 11};
		
		int total=arr.length+1;
		
		int expected_total=total*(total+1)/2;
		
		int actual_total=0;
		for(int i=0;i<=arr.length-1;i++) {
			actual_total=actual_total+arr[i];
		}
		
		int missingNumber=expected_total-actual_total;
		System.out.println("Missing number in array: "+missingNumber);
		
	}

}
