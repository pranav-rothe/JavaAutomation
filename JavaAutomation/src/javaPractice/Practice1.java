package javaPractice;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {

		int[] arr= {12, 10, 12, 15, 10, 25, 30};
		
		int count[]=new int[20000];
		
		for(int i=0;i<=arr.length-1;i++) {
			int c=arr[i];
			count[c]++;
		}
		int[] arr2=new int[20000];
		for(int i=0;i<20000;i++) {
			if(count[i]==1) {
				//System.out.println(i+":"+count[i]);
				arr2[i]=i;
				System.out.println(arr2[i]);
			}
		}
		
	}
	

}
