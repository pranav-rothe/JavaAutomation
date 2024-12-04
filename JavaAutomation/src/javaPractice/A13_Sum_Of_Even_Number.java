package javaPractice;

public class A13_Sum_Of_Even_Number {

	public static void main(String[] args) {

		int num=5;
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("Sum of even number: "+sum);
	}

}
