//9. Write a Java program to create a character array containing a string.

package assignment04;

public class S09_CharacterArray {

	public static void main(String[] args) {

		String str="Pranav Rothe";
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<=str.length()-1;i++) {
			System.out.print(ch[i]+" ");
		}
		
	}

}
