//1.Write a Java program that displays the sum of n odd natural numbers.

package assignment02;

import java.util.Scanner;

public class Sum_Of_Odd_Natural_Number {

	public static void main(String[] args) {

		//Input from user
		System.out.println("Enter the n number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //n=5

		int sum=0;

		//Loop for sum of user number
		for(int i=1,j=0;j<n;i+=2) {//1st: i=1,j=0;0<5;1+=2  //2nd: i=3,j=1;1<5;3+=2
			sum+=i;				   //0=0+1=1				//sum+=i=1=1+3
			j++;				   //0++ = 1				//j++=1++ = 2
		}
		//Print output of sum
		System.out.println("Sum of first "+n+" odd natural number: "+sum);	
		sc.close();
	}

}
