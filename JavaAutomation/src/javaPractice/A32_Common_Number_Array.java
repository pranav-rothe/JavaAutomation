package javaPractice;

public class A32_Common_Number_Array {

	public static void main(String[] args) {
		int arr1[] = {1,2,4,5,6,7,66,86,52};
		int arr2[] = {1,2,43,5,66,73};
		
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
