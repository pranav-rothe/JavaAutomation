//3. Write a Java program to test if a given string contains the specified sequence of char values.
//Example
//Original String: Java Exercises and Python Exercises
//Specified sequence of char values: and true

package assignment04;

public class S03_StringContains {

	public static void main(String[] args) {

		String str="Java Exercises and Python Exercises";
		
		boolean b=str.contains("and");
		
		System.out.println("Specified sequence of char values: "+str.substring(15, 18)+" "+b);
	}

}
