package javaPractice;

public class A27_MaxArray {

	public static void main(String[] args) {
		
		int arr[]= {20,10,50,30,90,15,45};
		int max=arr[0];
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max number in array: "+max);
	}

}
