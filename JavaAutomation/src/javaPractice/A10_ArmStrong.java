package javaPractice;

public class A10_ArmStrong {

	public static void main(String[] args) {

		int num=153;
		int sum=0;
		int org=num;
		
		while(num!=0) {//changes here 
			int digit=num%10;
			sum=sum+(digit*digit*digit); //changes here
			num=num/10;
		}
		System.out.println(sum);
		if(org==sum) {
			System.out.println(sum+" number is ArmStrong");
		}
		else {
			System.out.println(sum+" number is not ArmStrong");
		}
	}

}
