package assignment03;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFrom_Array {

	public static void main(String[] args) {

		Integer arr1[] = {1,2,43,5,66,73,43,5,1};
		
		HashSet<Integer> h=new HashSet<>(Arrays.asList(arr1));
		
		System.out.println(h);
	}

}
