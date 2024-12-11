//8. Write a Java program to get a substring of a given string at two specified positions. Example :
//old = The quick brown fox jumps over the lazy dog.
//new = brown fox jumps

package assignment04;

public class S08_SubString {

	public static void main(String[] args) {
		
		String oldStr="The quick brown fox jumps over the lazy dog.";
		System.out.println("Old String: "+oldStr);
		
		String newStr=oldStr.substring(10, 25); //substring --> which string you want in the current string
		
		System.out.println("New String: "+newStr);

	}

}
