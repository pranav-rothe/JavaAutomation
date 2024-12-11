//14. Write a Java program to reverse words in a given string.
//Example:
//The given string is: Reverse words in a given string
//The new string after reversed the words: string given a in words Reverse

package assignment04;

import java.util.Arrays;

public class S14_ReverseStringIndex {

	public static void main(String[] args) {

		String org="Reverse words in a given string";
		System.out.println("The given string is:\n"+org);

		String rev="";		
		String s[]=org.split(" ");

		for(int i=s.length-1;i>=0;i--) {
			rev=rev+(s[i]+" ");
		}
		
		System.out.println("=========================================");
		System.out.println("The new string after reversed the words:\n"+rev);
	}

}
