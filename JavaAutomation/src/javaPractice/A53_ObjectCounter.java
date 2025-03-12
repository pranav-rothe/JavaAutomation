package javaPractice;

public class A53_ObjectCounter {
	
	private static int count=0;
	
	public A53_ObjectCounter() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		
		A53_ObjectCounter obj1=new A53_ObjectCounter();
		A53_ObjectCounter obj2=new A53_ObjectCounter();
		A53_ObjectCounter obj3=new A53_ObjectCounter();
		
		System.out.println("Number of Object created: "+A53_ObjectCounter.getCount());
		
		
		
		
		
	}

}
