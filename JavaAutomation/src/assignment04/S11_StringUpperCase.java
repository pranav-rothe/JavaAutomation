//11. Write a Java program to convert all characters in a string to uppercase. Example :
//Original String: The Quick BroWn FoX!
//String in uppercase: THE QUICK BROWN FOX!

package assignment04;

public class S11_StringUpperCase {

	public static void main(String[] args) {

		String str="The Quick BroWn FoX!";

		System.out.println("Original string: "+str);

		String upper=str.toUpperCase();

		System.out.println("Lower case string: "+upper);
	}

}
