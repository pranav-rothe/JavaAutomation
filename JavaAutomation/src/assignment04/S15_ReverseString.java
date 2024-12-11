//15. Write a Java program to reverse in a given string. Example:
//The given string is: Reverse words in a given string

package assignment04;

public class S15_ReverseString {

	public static void main(String[] args) {

		String org="Reverse words in a given string";
		
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			char ch=org.charAt(i);
			rev=rev+ch;
		}
		System.out.println("Original String: "+org);
		System.out.println();
		System.out.println("Reverse String: "+rev);
		
	}

}
