package javaPractice;

public class A57_FirstCharUpper {

	public static void main(String[] args) {

		String str = "this is java script code string";

		StringBuilder sb = new StringBuilder();

		String[] words = str.split(" ");

		for (String word : words) {
			sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1) + " ");
		}

		System.out.println(sb);
	}

}
