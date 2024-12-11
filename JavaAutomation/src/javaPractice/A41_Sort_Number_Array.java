package javaPractice;

public class A41_Sort_Number_Array {

	public static void main(String[] args) {

		int arr[] = {4, 1, 3, 2}; //{0, 1, 2, 3}

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}

}
