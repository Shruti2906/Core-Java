
public class Course {
	
	private int courseId;
	private String courceName;
	private int courseDuration;
	private double fees;
	
	public Course() {
	}

	public Course(int courseId, String courceName, int courseDuration, double fees) {
		super();
		this.courseId = courseId;
		this.courceName = courceName;
		this.courseDuration = courseDuration;
		this.fees = fees;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
}
