package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class A56_RemoveDuplicateChar {

	public static void main(String[] args) {

		String str = "ZeennsarTechZenn";

		Set<Character> s = new HashSet<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (!s.contains(c)) {
				s.add(c);
				sb.append(c);
			}
		}

		System.out.println("After removing duplicate: " + sb);

	}

}
