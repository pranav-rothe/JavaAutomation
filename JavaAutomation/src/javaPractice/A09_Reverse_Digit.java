package javaPractice;

public class A09_Reverse_Digit {

	public static void main(String[] args) {

		int num=123;
		int rev=0;
		int org=num;
		
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;//changes here
			num=num/10;
		}
		System.out.println(org);
		System.out.println(rev);
	}

}
