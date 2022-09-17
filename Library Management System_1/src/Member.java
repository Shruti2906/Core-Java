import java.util.Date;

public class Member {
	
	private int memberId;
	private String memeberName;
	private String memberOccupatuion;
	private Date dob;
	private Date registeredDt;
	
	public Member() {
		
	}

	public Member(int memberId, String memeberName, String memberOccupatuion, Date dob, Date registeredDt) {
		super();
		this.memberId = memberId;
		this.memeberName = memeberName;
		this.memberOccupatuion = memberOccupatuion;
		this.dob = dob;
		this.registeredDt = registeredDt;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemeberName() {
		return memeberName;
	}

	public void setMemeberName(String memeberName) {
		this.memeberName = memeberName;
	}

	public String getMemberOccupatuion() {
		return memberOccupatuion;
	}

	public void setMemberOccupatuion(String memberOccupatuion) {
		this.memberOccupatuion = memberOccupatuion;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getRegisteredDt() {
		return registeredDt;
	}

	public void setRegisteredDt(Date registeredDt) {
		this.registeredDt = registeredDt;
	}
	

}
