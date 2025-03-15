package javaPractice;

public class A42_Vowels {

	public static void main(String[] args) {

		String str="Swiaeiouss";
		
		String vowel1=str.replaceAll("[aeiou]", "");		
		System.out.println(vowel1);
		
		String vowel2=str.replaceAll("[^aeiou]", "");
		System.out.println(vowel2);
		
		String str2="swis@@!*@(!&KKJASNKD!!@2133124";
		
		String op1=str2.replaceAll("[0-9a-zA-Z]", "");
		System.out.println(op1);
		
		String op2=str2.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(op2);
		
		String op3=str2.replaceAll("[^0-9]", "");
		System.out.println(op3);
	}

}
