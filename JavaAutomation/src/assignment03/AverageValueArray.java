//5.Write a Java program to calculate the average value of array elements.
//int test [] ={1,2,355,664}; 

package assignment03;

public class AverageValueArray {

	public static void main(String[] args) {
		
		int test [] ={1,2,355,664}; 
		int sum=0;
		int count=0;
		int avg=0;
		
		for(int i=0;i<=test.length-1;i++) {
			sum+=test[i];
			count++;
		}
		avg=sum/count;
		
		System.out.println("Sum of array: "+sum);
		System.out.println("Total element is array: "+count);
		System.out.println("Average of array: "+sum+"/"+count+" = "+avg);
	}

}
