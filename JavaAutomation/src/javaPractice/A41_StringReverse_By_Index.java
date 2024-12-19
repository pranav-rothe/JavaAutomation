package javaPractice;

public class A41_StringReverse_By_Index {

	public static void main(String[] args) {

		String name="Hi good evening";
		String rev="";
		
		System.out.println(name);
		
		String[] str=name.split(" ");
		
		for(int i=str.length-1;i>=0;i--) {
			rev=str[i];
			System.out.print(rev+" ");			
		}
		
	}

}
