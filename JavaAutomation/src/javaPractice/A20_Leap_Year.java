package javaPractice;

public class A20_Leap_Year {

	public static void main(String[] args) {

		int year=2024;
		
		if(year%4==0 || year%100==0 || year%400==0) {
			System.out.println(year+" leap year");
		}
		else {
			System.out.println(year+" not an leap year");
		}
	}

}
