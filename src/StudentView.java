
public class StudentView 
{
	private Student student;
	
	public StudentView(Student student) 
	{
		this.student = student;
	}
	
	public StudentView() 
	{
		
	}
	
	public void printStudentDetails(Student student) 
	{
		this.student = student;
		printStudentDetails();
	}
	
	public void setStudentDetails(Student student) 
	{
	
	}
	
	public void printStudentDetails() 
	{
		if (this.student == null) throw new IllegalArgumentException("student");		

		System.out.println("Student first name: " + this.student.getFirstName());
		System.out.println("Student last name: " + this.student.getLastName());
		System.out.println("Student ID number: " + this.student.getIdNumber());
		System.out.println("Student email: " + this.student.getEmail());
		System.out.println("Student courses:");
		printStudentCourses();
	}
	
	public void printStudentCourses()
	{
		for(Course c: this.student.getCourses())
		{
			System.out.println(c.getName() +" by " + c.getProf());
		}
		System.out.println();
	}
}
