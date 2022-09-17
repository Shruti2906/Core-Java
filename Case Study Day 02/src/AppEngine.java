import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

public class AppEngine {

	Scanner sc = new Scanner(System.in);
	
	public void introduce(Course course) {

		System.out.println("Enter Course Id : ");
		course.setCourseId(sc.nextInt());
		System.out.println("Enter Course Name : ");
		course.setCourceName(sc.next());
		System.out.println("Enter Course Duration : ");
		course.setCourseDuration(sc.nextInt());
		System.out.println("Enter Course Fees : ");
		course.setFees(sc.nextDouble());
    }
	
	public void register(Student student) throws ParseException {
		
		System.out.println("Enter Student Id : ");
		student.setStudId(sc.nextInt());
		System.out.println("Enter Student Name : ");
		student.setStudName(sc.next());
		System.out.println("Enter Student DOB : ");
		String sDate = sc.next();
		Date date = new SimpleDateFormat("DD/MM/YYYY").parse(sDate);
		student.setDob(date);
    }
	
	public Student[] listOfStudents() throws ParseException {
		
		System.out.println("How many students do you want : ");
		int n = sc.nextInt();
		Student stdArr[] = new Student[n];
		for(int i=0; i<n; i++) {

			Student student = new Student();
			System.out.println("Enter Student Id : ");
			student.setStudId(sc.nextInt());
			System.out.println("Enter Student Name : ");
			student.setStudName(sc.next());
			System.out.println("Enter Student DOB : ");
			String sDate = sc.next();
			Date date = new SimpleDateFormat("DD/MM/YYYY").parse(sDate);
			student.setDob(date);
			stdArr[i] = student;
		}
		return stdArr;
	
    }
	
	public Course[] listOfCourses() {
		
		System.out.println("How many Courses do you want : ");
		int n = sc.nextInt();
		Course cArr[] = new Course[n];
		for(int i=0; i<n; i++) {
			
			Course course = new Course();
			System.out.println("Enter Course Id : ");
			course.setCourseId(sc.nextInt());
			System.out.println("Enter Course Name : ");
			course.setCourceName(sc.next());
			System.out.println("Enter Course Duration : ");
			course.setCourseDuration(sc.nextInt());
			System.out.println("Enter Course Id : ");
			course.setFees(sc.nextDouble());
			cArr[i] = course;
			
		}
		return cArr;

    }

	public void enroll(Student student, Course course) {
			
		Enroll en = new Enroll();
		en.setStudent(student);
		en.setCourse(course);
		//LocalDate ld = new LocalDate(0, 0, 0);
		//en.setEnrollmentDate(new LocalDate("2020-01-08"));
		
    }

	public Enroll[] listOfEnrollments() throws ParseException {

		Student students[] = listOfStudents();
		Course courses[] = listOfCourses();
		LocalDate date = LocalDate.parse("2020-01-08");
		Enroll enrolls[] = new Enroll[students.length];
		for(int i=0; i<enrolls.length; i++) {
			enrolls[i].setStudent(students[i]);
			enrolls[i].setCourse(courses[i]);
		}
		return enrolls;
    }
	
}
