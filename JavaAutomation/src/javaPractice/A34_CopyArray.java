package javaPractice;

import java.util.Arrays;

public class A34_CopyArray {

	public static void main(String[] args) {

		String arr[]={"Hello","Java","Python", "Demo","Test"};
		String copyArr[]=new String[arr.length];
		
		for(int i=0;i<=arr.length-1;i++) {
			
			copyArr[i]=arr[i];
			System.out.println(copyArr[i]);
			
		}
		System.out.println(Arrays.toString(copyArr));
	}

}
