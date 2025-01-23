package javaPractice;

public class Practice {

	public static void main(String[] args) {

		// 65 to 90 ==> A-Z
		// 97 to 122 ==> a-z
		String str="australia";
		
		int[] count=new int[256];
		
		for(int i=0;i<=str.length()-1;i++) {
			char c=str.charAt(i);
			count[c]++;
		}
		String s="";
		for(int i=0;i<256;i++) {
			if(count[i]==1) {
				s+=(char)i;
			}
		}
		System.out.println(s);
	}

}
