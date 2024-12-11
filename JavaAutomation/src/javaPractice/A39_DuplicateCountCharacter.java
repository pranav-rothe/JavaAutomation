package javaPractice;

public class A39_DuplicateCountCharacter {

	public static void main(String[] args) {

		String str="There is 10 pens and 10 rupees cost @#$%of each pen!";
		int[] count=new int[256];
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<256;i++) {
			if(count[i]>1) {
				System.out.println((char)i+" appears "+count[i]+" times");
			}
		}
	}

}
