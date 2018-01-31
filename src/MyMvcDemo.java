import java.util.ArrayList;

public class MyMvcDemo 
{

	public static void main(String[] args) 
	{
		//for testing purposes
		Professor prof1 = new Professor("James", "Jones", "jj@mail.com", 12345);
		Course course1 = new Course("math", 1101, 3, prof1);
		Professor prof2 = new Professor("Jane", "Doe", "jd@mail.com", 23456);
		Course course2 = new Course("science", 1102, 3, prof2);
		Professor prof3 = new Professor("Jim", "Morrison", "jimmorrison@rock.roll", 30303);
		Course course3 = new Course("rock", 9999, 1000, prof3);
		Professor prof4 = new Professor("Jim", "Hendrix", "purplehaze@san.fran", 11111);
		Course course4 = new Course("guitar", 8888, 2308, prof4);
		Professor prof5 = new Professor("Chan", "TheMan", "chantheman@teacher.edu", 00000);
		Course course5 = new Course("awesomeness", 5555, 7891, prof5);
		ArrayList<Course> studentCourses = new ArrayList<Course>();
		studentCourses.add(course1);
		studentCourses.add(course2);
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
		
		
		Student student = new Student("Zane", "Uribe", 123456, "student@shu.edu", studentCourses);
		StudentView studentView =  new StudentView();
		StudentController studentController =  new StudentController(student, studentView);
		CourseView courseView = new CourseView();
		RegistrationView registrationView = new RegistrationView(courseView);
		RegistrationController registrationController = new RegistrationController(student, registrationView, courses);
		
		studentController.printStudentDetails();
		registrationController.printAvailableCourses();
		
		int[] registeringCourses = {9999, 7649, 8888};
		registrationController.registerStudent(registeringCourses);
		studentController.printStudentDetails();
	}
}
