// 7. Write a program to find the given number is prime or not

package assignment02;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) { //count equals two because prime number is only divisible by 1 & self number
			System.out.println(number+" is prime number.");
		}
		else {
			System.out.println(number+" is not prime number.");
		}
		sc.close();
	}
}
