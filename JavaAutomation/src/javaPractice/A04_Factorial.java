package javaPractice;

public class A04_Factorial {

	public static void main(String[] args) {

		int n=5;
		int fact=1; //initialize with 1
		
		for(int i=1;i<=n;i++) { //loop start with 1 and goes to nth number
			fact*=i;
		}
		System.out.println(fact);
	}

}
