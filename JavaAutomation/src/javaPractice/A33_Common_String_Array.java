package javaPractice;

public class A33_Common_String_Array {

	public static void main(String[] args) {

		String arr1[] = {"Test","HI","Java","Python"};
		String arr2[] = {"Hello","Java","Python", "Demo","Test"};
		
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				if(arr1[i].equals(arr2[j])) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
