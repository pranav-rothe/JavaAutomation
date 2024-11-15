//4. Write a Java program to copy an array by iterating the array.
// int arr[] = {1,2,3,44,66,33}; 

package assignment03;

public class CopyArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,44,66,33}; 
		int copyArr[]=new int[arr.length];
		
		for(int i=0;i<=arr.length-1;i++) {
			copyArr[i]=arr[i];
		}
		for(int sort: copyArr) {
			System.out.print(sort+" ");
		}

	}

}
