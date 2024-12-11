//1. Write a Java program to get the character at the given index within the string. Sample Output:
//The Original String = Java Python!
//The character at position 0 is J
//character at position 3 is a

package assignment04;

public class S01_IndexString {

	public static void main(String[] args) {

		String str="Java Python";
		
		char s1=str.charAt(0);
		char s2=str.charAt(3);
		System.out.println("The character at position 0 is "+s1);
		System.out.println("The character at position 3 is "+s2);
		
		
	}

}
