
public class Student {
	
	private String name;
	private Course course;
	
	public Student(String aName){
		this.name = aName;
	}

	
	public void setCourse(Course aCourse) {
		course = aCourse;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Course " + course.getName());
		System.out.println("---------");
	}
	
	
}
