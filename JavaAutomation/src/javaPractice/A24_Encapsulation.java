package javaPractice;

public class A24_Encapsulation {

	private int age=18;

	//getter
	public int getAge() {
		return age;
	}

	//setter
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		A24_Encapsulation e=new A24_Encapsulation(); //creating object
		e.setAge(27); //set the age
		System.out.println(e.getAge()); //get the age

	}

}
