package javaPractice;

public class A03_ArrayNumberSort {

	public static void main(String[] args) {

		int arr[]= {6,7,8,9,10,1,2,3,4,5};
		int arr2[]=new int[arr.length];

		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		//just sort and stored in same arr
		System.out.println("Just sort in same array");
		for(int sort: arr) {
			System.out.print(sort+" ");
		}
		
		System.out.println();
		
		//sort and copy into another arr
		System.out.println("Sorted and Copy to another array");		
		for(int i=0;i<=arr.length-1;i++) {
			arr2[i]=arr[i];
			System.out.print(arr2[i]+" ");
		}
	}

}
