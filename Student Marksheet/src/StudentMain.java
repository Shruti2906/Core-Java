
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		System.out.println("Enter Student Roll No : ");
		std.setStudRollNo(sc.nextInt());
		System.out.println("Enter Student Name : ");
		std.setStudName(sc.next());
		System.out.println("Enter Marks For 3 Subjects : ");
		int arr[] = new int[3];
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		std.setSub(arr);
		
		int scored = 0;
		for(int i:std.getSub()) {
			scored += i;
		}
		int total = 300;
		double avg = scored/300;
		double percentage = (float)scored / total * 100.0;
	
		System.out.println("Percentage : "+percentage);
		
		std.setTotal(total);
		std.setAvg(avg);
		std.setPercentage(percentage);
		
		System.out.println("Student Roll No\t\t:\t\t"+std.getStudRollNo());
		System.out.println("Student Name\t\t:\t\t"+std.getStudName());
		System.out.print("Student Marks for 3 Subjects\t:\t");
		
		for(int i:std.getSub()) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nTotal\t\t:\t\t"+std.getTotal());
		System.out.println("Avg\t\t:\t\t"+std.getAvg());
		System.out.println("Percentage\t:\t\t"+std.getPercentage());
		
	}

}
