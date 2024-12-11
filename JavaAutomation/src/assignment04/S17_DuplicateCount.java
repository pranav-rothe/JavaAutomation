//17. Write a Java program to count and print all duplicates in the input string. Example :
//The given string is: JavaPythonJava
//The duplicate characters and counts are:
//J appears 2 times A appears 2 time

package assignment04;

public class S17_DuplicateCount {

	public static void main(String[] args) {
		
		String str="JavaPythonJava";
		
		str=str.toUpperCase();
		
		int count[]=new int[256];
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			count[ch]++;
		}
		
		for(int i=0;i<256;i++) {
			if(count[i]>1) {
				System.out.println((char)i+" appears "+count[i]+" times ");
			}
		}
		

		
	}

}
