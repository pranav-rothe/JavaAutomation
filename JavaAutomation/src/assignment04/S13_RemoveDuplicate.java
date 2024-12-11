//13. Write a Java program to print the result of removing duplicates from a given string.
//Example
//The given string is: JavaPython
//After removing duplicates characters the new string is: JvPython

package assignment04;


public class S13_RemoveDuplicate {

	public static void main(String[] args) {

		String str="JavaPython";
		String str1="";
		
		str1=str.replaceAll("a", "");
		System.out.println(str1);	
		
	}

}
