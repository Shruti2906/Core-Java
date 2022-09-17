import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentMain {

	public static void scenario1() {
		
		Student std1 = new Student();
		Student std2 = new Student(1, "John", new Date());
		Student std3 = new Student();
		std3.setStudId(3);
		std3.setStudName("ram");
		std3.setDob(new Date());
		
		//display
		StudentInfo sInfo = new StudentInfo();
		System.out.println("\n\n\t\t\t*** Scenario 1 ***\n");
		System.out.println("-------------------------- Student 1 --------------------------");
		sInfo.display(std1);
		
		System.out.println("-------------------------- Student 2 --------------------------");
		sInfo.display(std2);
		
		System.out.println("-------------------------- Student 3 --------------------------");
		sInfo.display(std3);
	}
	
	public static void scenario2() {
		
		StudentInfo sInfo = new StudentInfo();
		Student students[] = new Student[5];
		students[0] = new Student();
		students[1] = new Student(4, "abc", new Date());
		students[2] = new Student(5, "bcd", new Date());
		students[3] = new Student(6, "cde", new Date());
		students[4] = new Student(7, "def", new Date());
		
		System.out.println("\n\n\t\t\t*** Scenario 2 ***\n");
		for(int i=0; i<students.length; i++) {
			
			System.out.println("-------------------------- Student "+(i+1)+" --------------------------");
			sInfo.display(students[i]);
		}
		
	}
	
	
	public static void scenario3() throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		StudentInfo sInfo = new StudentInfo();
		Student students[] = new Student[1];
		System.out.println("\n\n\n");
		for(int i=0; i<students.length; i++) {
			System.out.println("Enter Student Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Student Name :");
			String name = sc.next();
			System.out.println("Enter Student's Date of Birth : ");
			String dt = sc.next();
			Date d = new SimpleDateFormat("dd/MM/yyyy").parse(dt);
			students[i] = new Student(id, name, d);
		}
	
		//display
		System.out.println("\n\n\t\t\t*** Scenario 3 ***\n");
		for(int i=0; i<students.length; i++) {
			System.out.println();
			sInfo.display(students[i]);
		}
	}

	public static void Coursescenario1() {
		
		Course c1 = new Course();
		Course c2 = new Course(1, "JAVA", 4, 5000);
		Course c3 = new Course();
		c3.setCourseId(3);
		c3.setCourceName("CProgramming");
		c3.setCourseDuration(2);
		c3.setFees(2000);
		
		//display
		StudentInfo sInfo = new StudentInfo();
		System.out.println("\n\n\t\t\t*** Scenario 1 for Course ***\n");
		System.out.println("-------------------------- Course 1 --------------------------");
		sInfo.display(c1);
		
		System.out.println("-------------------------- Course 2 --------------------------");
		sInfo.display(c2);
		
		System.out.println("-------------------------- Course 3 --------------------------");
		sInfo.display(c3);
	}
	
	public static void main(String[] args) throws ParseException {
		
		scenario1();
		scenario2();
		scenario3();
		Coursescenario1();
	}

}
