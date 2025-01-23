package javaPractice;

import java.util.HashMap;
import java.util.Set;

public class P02_Practice {

	public static void main(String[] args) {

		String[] arr= {"Hello","Java","Test","Python","Demo","Test","Java"};
		
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
			if(hs.get(x)==1) {
				System.out.println(x);
			}
		}
		
	}

}
