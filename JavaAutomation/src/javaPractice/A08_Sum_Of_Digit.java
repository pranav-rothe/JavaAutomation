package javaPractice;

public class A08_Sum_Of_Digit {

	public static void main(String[] args) {
		
		int num=325;
		int sum=0;
		
		while(num!=0) {
			int digit=num%10;
			sum=sum+digit; //changes here
			num=num/10;
		}
		System.out.println(sum);
	}

}
