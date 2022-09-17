
public class StudentInfo {
	
	public void display(Student student) {
		
		System.out.println("\tStudent Id\t\t:\t\t"+student.getStudId());
		System.out.println("\tStudent Name\t\t:\t\t"+student.getStudName());
		System.out.println("\tStudent Date of birth\t:\t\t"+student.getDob());
		
	}
	
	public void display(Course course) {
		
		System.out.println("\tCourse Id\t\t:\t\t"+course.getCourseId());
		System.out.println("\tCourse Name\t\t:\t\t"+course.getCourceName());
		System.out.println("\tCourse Duration\t:\t\t"+course.getCourseDuration());
		System.out.println("\tCourse Fees\t\t:\t\t"+course.getFees());
	}

}
