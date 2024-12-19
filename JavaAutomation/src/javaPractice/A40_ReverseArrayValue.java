package javaPractice;

import java.util.Arrays;

public class A40_ReverseArrayValue {

	public static void main(String[] args) {

		int arr[] = {1,2,3,44,66,33};
		int arr2[]=new int[arr.length];

		for(int i=0;i<=arr.length-1;i++) {
		
			arr2[i]=arr[arr.length-1-i];
			//System.out.print(arr2[i]+" ");
		}
		//System.out.println(arr1.toString());
		System.out.println(Arrays.toString(arr2));			

	}

}

/*
 * 0 1 2 3	4	5
 * 1 2 3 44 66 33 --arr
 */
