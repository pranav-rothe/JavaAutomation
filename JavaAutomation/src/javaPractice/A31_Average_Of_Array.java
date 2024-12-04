package javaPractice;

public class A31_Average_Of_Array {

	public static void main(String[] args) {

		int arr[]= {1, 2, 3, 5, 6, 4, 8, 9, 10, 11,31};
		int sum=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of array: "+sum);
		
		int len=arr.length;
		System.out.println("Length of array: "+len);
		int average=sum/len;
		System.out.println("Average of array: "+average);
	}

}
