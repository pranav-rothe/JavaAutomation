package javaPractice;

import java.util.Arrays;

public class A35_Anagram {

	public static void main(String[] args) {
		
		String str1="Cafe";
		String str2="Face";
		
		String s1=str1.toLowerCase(); //convert into lower case
		String s2=str2.toLowerCase(); //convert into lower case
		
		char ch1[]=s1.toCharArray(); //Converts this string to a new character array.
		char ch2[]=s2.toCharArray(); //Converts this string to a new character array.
		
		Arrays.sort(ch1); //sort by ascending order
		Arrays.sort(ch2); //sort by ascending order
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		//check the both character are equals or not 
		if(Arrays.equals(ch1, ch2)) { //equals method from Arrays class
			System.out.println("It is an Anagram.");
		}
		else {
			System.out.println("It is not an Anagram");
		}
		

	}

}
