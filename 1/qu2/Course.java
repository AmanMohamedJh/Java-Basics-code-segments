package qu2;

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
