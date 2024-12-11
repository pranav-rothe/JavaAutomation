//12. Write a Java program to trim leading or trailing whitespace from a given string. Example :
//Original String: Java Exercises New String: Java Exercises

package assignment04;

public class S12_StringTrim {

	public static void main(String[] args) {

		String str="                Java Exercises                 ";
		System.out.println(str);
		
		String s=str.trim();
		
		System.out.println("New String: "+s);
	}

}
