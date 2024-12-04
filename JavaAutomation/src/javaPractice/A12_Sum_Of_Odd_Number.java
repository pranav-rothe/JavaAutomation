package javaPractice;

public class A12_Sum_Of_Odd_Number {

	public static void main(String[] args) {

		int num=5;
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("Sum of odd number: "+sum);
	}

}
