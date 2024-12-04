package javaPractice;

public class A07_StringPalindrome {

	public static void main(String[] args) {

		String org="Mom";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			char ch=org.charAt(i);
			rev+=ch;
		}
		if(org.equalsIgnoreCase(rev)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not Palindrome");
		}
	}

}
