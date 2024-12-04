package javaPractice;

public class A28_MinArray {

	public static void main(String[] args) {

		int arr[]= {20,10,50,30,90,15,45};
		int min=arr[0];
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min number in array: "+min);
	}

}
