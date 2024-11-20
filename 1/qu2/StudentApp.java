

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




public class Course extends Student {
	private String courseName;

	Course(String name, int age,String courseName){
		super(name, age);
		this.courseName=courseName;
	}
	
	


	public void displayInfo() {
		displayInfo();
		System.out.println("The student's course name : "+this.courseName);
	}
}


public class StudentApp {

	public static void main(String[] args) {
		
		Course c1=new Course("Alice", 20, "Java Programming");
		Course c2=new Course("Bob", 22,"Data Structures");
		
		c1.displayInfo();
		System.out.println();
		c2.displayInfo();

	}

}
