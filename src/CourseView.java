
public class CourseView 
{
	private Course course;
	
	public CourseView (Course course)
	{
		this.course = course;
	}
	
	public CourseView ()
	{
		
	}
	
	public void printCourseDetails(Course course)
	{
		this.course = course;
		printCourseDetails();
	}
	
	public void printCourseDetails ()
	{
		if (this.course == null) throw new IllegalArgumentException("student");
		
		System.out.println("Course name: " + this.course.getName());
		System.out.println("Course number: " +this.course.getNum());
		System.out.println("Course credit(s): " + this.course.getCredit());
		System.out.println("Course professor: " + this.course.getProf());
		System.out.println();
	}
}
