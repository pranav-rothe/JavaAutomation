package javaPractice;

public class A02_StringWordReverse {

	public static void main(String[] args) {

		String name="Hi good evening"; //answer: iH doog gnineve 
		String s1="";
		
		System.out.println(name);
		
		String[] index=name.split(" ");
		
		for(String word: index) {
			String rev="";
			for(int i=word.length()-1;i>=0;i--) {
				char ch=word.charAt(i);
				rev+=ch;
			}
			s1=rev+" ";
			System.out.print(s1);
		}
		
		
	}

}
