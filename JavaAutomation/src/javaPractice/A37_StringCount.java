package javaPractice;

public class A37_StringCount {

	public static void main(String[] args) {
		
		String str="There is 10 pens and 10 rupees cost @#$%of each pen!";
		
		int digit=0;
		int character=0;
		int specialChar=0;
		int space=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			
			if(Character.isLetter(ch)) {
				character++;
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else if(Character.isWhitespace(ch)) {
				space++;
			}
			else {
				specialChar++;
			}
		}
		
		System.out.println("Character: "+character);
		System.out.println("Digit: "+digit);
		System.out.println("Space: "+space);
		System.out.println("Special Character: "+specialChar);		

	}

}
