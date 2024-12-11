//2. Write a Java program to concatenate a given string to the end of another string. Example
//String 1: Java Exercises and
//String 2: Python Exercises
//The concatenated string: Java Exercises and Python Exercises

package assignment04;

public class S02_StringConcatenate {

	public static void main(String[] args) {
		
		String str1="Java Exercises and";
		String str2="Python Exercises";
		
		//1st approach is using concat method
		System.out.println("1st approach is using (concat) method "+str1.concat(" "+str2)); 
		
		System.out.println();
		
		//2nd approach is using + operator
		System.out.println("2nd approach is using (+) operator "+str1+" "+str2);
		
	}

}
