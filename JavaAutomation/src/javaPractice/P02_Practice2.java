package javaPractice;

import java.util.HashMap;
import java.util.Set;

public class P02_Practice2 {

	public static void main(String[] args) {

		String str="There is 10 pens is and 10 is rupees cost is @#$%of each is pen!";
		
		String[] arr=str.split(" ");
		HashMap<String, Integer> hs=new HashMap<>();
		for(int i=0;i<=arr.length-1;i++) {
			String c=arr[i];
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);
			}
			else {
				hs.put(c, 1);
			}
		}
		
		System.out.println(hs);
		
		Set<String> s=hs.keySet();
		for(String x:s) {
			if(hs.get(x)==5) {
				System.out.println(x);
			}
		}
		
	}

}
