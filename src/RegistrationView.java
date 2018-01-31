import java.util.ArrayList;

public class RegistrationView 
{
	private CourseView courseView;
	
	public RegistrationView (CourseView courseView)
	{
		this.courseView = courseView;
	}
	
	public void printAvailableCourses (ArrayList<Course> courses)
	{
		System.out.println("Available Courses: ");
		for(Course c: courses)
		{
			this.courseView.printCourseDetails(c);
		}
	}
}
