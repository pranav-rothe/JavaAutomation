package javaPractice;

public class A19_SmallestNumber {

	public static void main(String[] args) {

		int num1=25;
		int num2=6;
		int num3=90;
		
		if(num1<num2 && num1<num3) {
			System.out.println(num1+" is a smallest number");
		}
		else if(num2<num3 && num2<num1) {
			System.out.println(num2+" is a smallest number");
		}
		else {
			System.out.println(num3+" is a smallest number");
		}
	}

}
