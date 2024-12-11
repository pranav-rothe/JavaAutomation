//7. Write a Java program to get the last index of a string within a string. 
//Example :
//Hello good evening o/p — g

package assignment04;

public class S07_LastIndexOf_String {

	public static void main(String[] args) {

		String str="Hello good evening";

		//System.out.println(str.indexOf('g',str.indexOf('g')+1));

		int i=str.lastIndexOf("g");
		System.out.println("Output: "+str.charAt(i));

	}

}
