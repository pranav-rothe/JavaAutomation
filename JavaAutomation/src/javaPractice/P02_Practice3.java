package javaPractice;

import java.util.HashMap;
import java.util.Set;

public class P02_Practice3 {

	public static void main(String[] args) {

		String str = "aabbccdd";
		
		HashMap<Character, Integer>hs=new HashMap<>();
		
		for(int i=0;i<=str.length()-1;i++) {
			char c=str.charAt(i);
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);				
			}
			else {
				hs.put(c, 1);
			}
		}
		System.out.println(hs);
		
		Set<Character> ch=hs.keySet();
		for(Character x:ch) {
			System.out.print(x.toString());
		}
		
	}

}
