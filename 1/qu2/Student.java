package qu2;

public class Student {
	
	protected  String name;
	protected  int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	


	public  String getName() {
		return this.name;
		
	}
	public int getAge() {
		return this.age;
	}
	
	public void displayInfo() {
		System.out.println("The name of the student : "+this.name);
		System.out.println("The age of the student : "+this.age);
	}
}
