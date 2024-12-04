package javaPractice;

import java.util.Scanner;

public class A23_Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the operator (+,-,*,/,%)");
		String op=sc.next();
		
		System.out.println("Enter first number: ");
		double num1=sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double num2=sc.nextDouble();
		
		double result;
		
		switch(op) {
		case "+":
			result=num1+num2;
			System.out.println(num1+" + "+num2+" = "+result);
			break;
			
		case "-":
			result=num1-num2;
			System.out.println(num1+" - "+num2+" = "+result);
			break;
			
		case "*":
			result=num1*num2;
			System.out.println(num1+" * "+num2+" = "+result);
			break;
			
		case "/":
			try {
				result=num1/num2;
				System.out.println(num1+" / "+num2+" = "+result);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case "%":
			result=num1%num2;
			System.out.println(num1+" % "+num2+" = "+result);
			break;
			
		default:
			System.out.println("Invalid operator");
		}
		sc.close();

	}

}
