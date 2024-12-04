package javaPractice;

public class A01_StringReverse {

	public static void main(String[] args) {

		String name="Hi good evening";
		String rev="";
		
		System.out.println(name);
		
		int size=name.length()-1;
		
		for(int i=size;i>=0;i--) {
			char ch=name.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}

}
