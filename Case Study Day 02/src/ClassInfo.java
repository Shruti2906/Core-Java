
public class ClassInfo {
	
	public void displayStudent(Student student) {
		
		System.out.println("\tStudent Id\t\t:\t\t"+student.getStudId());
		System.out.println("\tStudent Name\t\t:\t\t"+student.getStudName());
		System.out.println("\tStudent Date of Birth\t:\t\t"+student.getDob());
	}

	public void displayCourse(Course course) {
		System.out.println("\tCourse Id\t\t:\t\t"+course.getCourseId());
		System.out.println("\tCourse Name\t\t:\t\t"+course.getCourceName());
		System.out.println("\tCourse Duration\t\t:\t\t"+course.getCourseDuration());
		System.out.println("\tCourse Fees\t\t:\t\t"+course.getFees());
	}
	
	public void displayStudent(Student students[]) {
		
		for(int i=0; i<students.length; i++) {
			System.out.println("\tStudent Id\t\t:\t\t"+students[i].getStudId());
			System.out.println("\tStudent Name\t\t:\t\t"+students[i].getStudName());
			System.out.println("\tStudent Date of Birth\t:\t\t"+students[i].getDob());
		}
		
	}
	
	public void displayCourse(Course courses[]) {
		
		for(int i=0; i<courses.length; i++) {
			System.out.println("\tCourse Id\t\t:\t\t"+courses[i].getCourseId());
			System.out.println("\tCourse Name\t\t:\t\t"+courses[i].getCourceName());
			System.out.println("\tCourse Duration\t\t:\t\t"+courses[i].getCourseDuration());
			System.out.println("\tCourse Fees\t\t:\t\t"+courses[i].getFees());
		}
	}
	
	public void displayEnroll(Enroll enroll) {
		
		System.out.println("\n-------- Enrollment details ---------");
		System.out.println("\tStudent Id\t\t:\t\t"+enroll.getStudent().getStudId());
		System.out.println("\tStudent Name\t\t:\t\t"+enroll.getStudent().getStudName());
		System.out.println("\tStudent Date of Birth\t:\t\t"+enroll.getStudent().getDob());
		System.out.println("\tCourse Id\t\t:\t\t"+enroll.getCourse().getCourseId());
		System.out.println("\tCourse Name\t\t:\t\t"+enroll.getCourse().getCourceName());
		System.out.println("\tCourse Duration\t\t:\t\t"+enroll.getCourse().getCourseDuration());
		System.out.println("\tCourse Fees\t\t:\t\t"+enroll.getCourse().getFees());
	}
	
	public void displayEnroll(Enroll enroll[]) {
		
		System.out.println("\n-------- Enrollment details ---------");
		
		for(int i=0; i<enroll.length; i++) {
			System.out.println("\tStudent Id\t\t:\t\t"+enroll[i].getStudent().getStudId());
			System.out.println("\tStudent Name\t\t:\t\t"+enroll[i].getStudent().getStudName());
			System.out.println("\tStudent Date of Birth\t:\t\t"+enroll[i].getStudent().getDob());
			System.out.println("\tCourse Id\t\t:\t\t"+enroll[i].getCourse().getCourseId());
			System.out.println("\tCourse Name\t\t:\t\t"+enroll[i].getCourse().getCourceName());
			System.out.println("\tCourse Duration\t\t:\t\t"+enroll[i].getCourse().getCourseDuration());
			System.out.println("\tCourse Fees\t\t:\t\t"+enroll[i].getCourse().getFees());
		}
	}
	
}
