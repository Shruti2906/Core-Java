import java.text.ParseException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);	
		AppEngine app = new AppEngine();
		ClassInfo cInfo = new ClassInfo();
		
		Course course = new Course();
		Student student = new Student();
		
		String str;
		
		do {
			System.out.println("1 : Register Student and display it\n2 : introduce new course and display it\n3 : Add new Enrollment\n4 : Register List of Student and display it\n5 : intriduce new course and display it\n6 : Add new list of Enrollment and display it");
			System.out.println("Enter Your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
			
			case 1:
				//Register Student and display it
					app.register(student);
					cInfo.displayStudent(student);
				break;
			case 2:
				//Introduce Course and display it
					app.introduce(course);
					cInfo.displayCourse(course);
				break;
			case 3:
				//Create new Enrollment and display it	
					app.enroll(student, course);
				//	cInfo.displayEnroll(enroll);
				break;
			case 4:
				//create students list and display it	
					Student students[] = app.listOfStudents();
					cInfo.displayStudent(students);
				break;
			case 5:
				//create courses list and display it 
					Course coureses[] = app.listOfCourses();
					cInfo.displayCourse(coureses);
				break;
			case 6:
				
				//create enrollments list and display it 
					Enroll enrolls[] = app.listOfEnrollments();
					cInfo.displayEnroll(enrolls);
				break;
			default: System.out.println("Invalid choice.!"); 
			
			}		
			System.out.println("Continue?(Y/N) : ");
			str = sc.next();
		}while(str.equals("y"));	
	}

}
