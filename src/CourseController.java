
public class CourseController 
{
	private CourseView courseView;
	private Course course;
	
	public CourseController(CourseView courseView, Course course)
	{
		this.courseView = courseView;
		this.course = course;
	}
	
	public void printCourseDetails()
	{
		this.courseView.printCourseDetails(this.course);
	}
}
