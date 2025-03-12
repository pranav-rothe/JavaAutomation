package javaPractice;

public class A55_FirstCharPrint {

	public static void main(String[] args) {
		
		String str="Pranav Aman Nishant Tejas";
		
		String[] s=str.split(" ");
		
		for(String x:s) {
			char c=x.charAt(0);
			System.out.println(c);
		}
	}

}
