//5. Write a Java program to compare a given string to another string, ignoring case considerations.
//|Example:
//Stephen Edwin King" equals "Walter Winchell"? false
//Stephen Edwin King" equals "stephen edwin king"? true

package assignment04;

public class S05_StringEqualIgnoreCase {

	public static void main(String[] args) {

		String str1="Stephen Edwin King";
		String str2="Walter Winchell";
		
		System.out.println((str1+" equals "+str2+"? ")+str1.equalsIgnoreCase(str2));
		
		String str3="Stephen Edwin King";
		String str4="stephen edwin king";
		
		System.out.println((str3+" equals "+str4+"? ")+str3.equalsIgnoreCase(str4));
		
	}

}
