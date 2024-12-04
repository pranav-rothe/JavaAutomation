package javaPractice;

public class A05_Prime_Or_Not {

	public static void main(String[] args) {

		int n=29;
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
	}

}
