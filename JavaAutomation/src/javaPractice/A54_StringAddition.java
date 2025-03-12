package javaPractice;

public class A54_StringAddition {

	public static void main(String[] args) {

		String str="Pranav have 12 oranges and 20 apples";

		String[] s=str.split(" ");

		int sum=0;

		for(String x:s){
			if(x.matches("\\d+")){
				int a=Integer.parseInt(x);
				sum+=a;
			}
		}
		System.out.println(sum);
	}

}
