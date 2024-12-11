//10. Write a Java program to convert all characters in a string to lowercase. Example
//Original String: The Quick BroWn FoX!
//String in lowercase: the quick brown fox!

package assignment04;

public class S10_StringLowerCase {

	public static void main(String[] args) {

		String str="The Quick BroWn FoX!";
		
		System.out.println("Original string: "+str);
		
		String lower=str.toLowerCase();
		
		System.out.println("Lower case string: "+lower);
	}

}
