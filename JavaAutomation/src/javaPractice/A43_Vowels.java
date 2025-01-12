package javaPractice;

public class A43_Vowels {

	public static void main(String[] args) {

		String str="Swaeiouss";
		
		System.out.println("//1st way");
		//1st way
		String vowel1=str.replaceAll("[aeiou]", "");
		System.out.println("non vowels: "+vowel1);
		
		String vowel2=str.replaceAll("[^aeiou]", "");
		System.out.println("vowels: "+vowel2);
		
		System.out.println("Concat vowel and non vowels: "+vowel2+vowel1);
		
		System.out.println();
		System.out.println("//2nd way");
		//2nd way
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			
			if(!(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')) {
				System.out.print(ch);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("//3rd way");
		//3rd way
		StringBuilder vowels=new StringBuilder(); //to store vowels
		StringBuilder nonVowels=new StringBuilder(); //to store no vowels
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels.append(ch);
			}
			else {
				nonVowels.append(ch);
			}
		}
		
		String result=vowels.toString()+nonVowels.toString();
		System.out.println(result);
		
		
	}

}
