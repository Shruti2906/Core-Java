import java.util.Date;

public class Student {

		private int studId;
		private String studName;
		private Date dob;
		
		public Student() {
			studId = 0;
			studName = "abc";
			dob = new Date(); 
		}

		public Student(int studId, String studName, Date dob) {
			super();
			this.studId = studId;
			this.studName = studName;
			this.dob = dob;
		}

		public int getStudId() {
			return studId;
		}

		public void setStudId(int studId) {
			this.studId = studId;
		}

		public String getStudName() {
			return studName;
		}

		public void setStudName(String studName) {
			this.studName = studName;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}
		
		
}
