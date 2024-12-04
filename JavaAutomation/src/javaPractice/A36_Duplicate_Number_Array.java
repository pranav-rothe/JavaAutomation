package javaPractice;

public class A36_Duplicate_Number_Array {

	public static void main(String[] args) {

		int arr[] = {1,2,4,5,6,3,66,33,22,1,4,66,77,3};
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
