package javaPractice;

public class A44_SubString {

	public static void main(String[] args) {
		
		A44_SubString.getsubString("Test");

	}
	
	public static void getsubString(String str) {
		
		for(int i=0;i<=str.length();i++) {
			
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i, j)+",");
			}
		}
	}

}
