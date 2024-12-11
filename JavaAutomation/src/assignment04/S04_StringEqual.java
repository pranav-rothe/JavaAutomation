//4. Write a Java program to check whether two String objects contain the same data.Example
//Hello good evening" equals “Hi good evening" false
//Hello good evening" equals "Hello good evening" True

package assignment04;

public class S04_StringEqual {

	public static void main(String[] args) {

		String str1="Hello good evening";
		String str2="Hi good evening";
		
		String str3="Hello good evening";
		String str4="Hello good evening";
		
		boolean b1=str1.contains(str2);
		System.out.println("By using (contains) method: "+b1);
		
		boolean b2=str3.contains(str4);
		System.out.println("By using (contains) method: "+b2);
		
		System.out.println("=================================");
		
		boolean b3=str1.equals(str2);
		System.out.println("By using (equals) method: "+b3);
		
		boolean b4=str3.equals(str4);
		System.out.println("By using (equals)) method: "+b4);
	}

}
