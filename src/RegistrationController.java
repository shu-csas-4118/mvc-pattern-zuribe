import java.util.ArrayList;

public class RegistrationController 
{
	private RegistrationView registrationView;
	private Student student;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	
	
	public RegistrationController(Student student, RegistrationView registrationView, ArrayList<Course> courses)
	{
		this.student = student;
		this.registrationView = registrationView;
		this.courses = courses;
	}
	
	public void printAvailableCourses()
	{
		this.registrationView.printAvailableCourses(courses);
	}
	
	public void registerStudent(int[] courseNums)
	{
		this.student = student;
		
		
		for(int i = 0; i < courseNums.length; i++)
		{
			boolean notSuccess = true;
			
			for(Course c: courses)
			{
				if(c.getNum() == courseNums[i])
				{
					this.student.addCourse(c);
					notSuccess = false;
				}
			}
			
			if(notSuccess)
			{
				System.out.println("Unable to enroll in course " + courseNums[i] + ". Course may not exist.");
			}
		}
		System.out.println("Registration complete.\n");
	}
}
