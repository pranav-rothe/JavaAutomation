package javaPractice;

import java.util.HashMap;
import java.util.Set;

public class P01_Practice {

	public static void main(String[] args) {

		int arr[]= {15, 25, 10, 15, 25, 30};

		int count[]=new int[20000];

		for(int i=0;i<=arr.length-1;i++) {
			int c=arr[i];
			count[c]++;
		}
		for(int i=0;i<count.length;i++) {
			//			if(count[i]==1) {
			//				System.out.println(i);
			//			}

			//			if(count[i]>1) {
			//				System.out.println(i);
			//			}

			//			if(count[i]>0) {
			//				System.out.println(i+":"+count[i]);
			//			}

		}

		HashMap<Integer, Integer> hs=new HashMap<>();

		for(int i=0;i<=arr.length-1;i++) {

			int c=arr[i];
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);
			}
			else {
				hs.put(c, 1);
			}
		}
		System.out.println(hs);

		Set<Integer> allkeys=hs.keySet();

		for(Integer k:allkeys) {
			if(hs.get(k)==2) {
				System.out.println(k);
			}
		}





	}

}
