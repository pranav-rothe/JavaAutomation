package javaPractice;

import java.util.HashSet;

public class A48_MissingMultipleNumberInArray {

	public static void main(String[] args) {
		
		int[] arr= {1, 3, 5, 6, 10};
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(int num:arr) {
			hs.add(num);	//adding a array number in hashset because it does not accept duplicate values
		}
		
		System.out.println(hs);
		
		int max=arr[arr.length-1]; //it gives max index number
		
		//for(int i=10;i<=max;i+=10)
		for(int i=1;i<=max;i++) {
			if(!hs.contains(i)) { //here checks the which number is not present in hashset
				System.out.print(i+" ");
			}
		}
	}

}
