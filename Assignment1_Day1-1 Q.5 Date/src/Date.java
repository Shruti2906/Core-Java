
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		day = 01;
		month = 01;
		year = 2001;
	}

	public Date(int day, int month, int year) {
		super();
			if((day>00) && (day<32) && (month>00) && (month<13) && (year>=2000) && (year<2023)) {
				this.day = day;
				this.month = month;
				this.year = year;
			}
			else {
				System.out.println("Invalid Input for Date..");
				System.out.println("Default date would be taken..!\n");
			}
	}
	
	public void addDate(int day, int month, int year) {
		
		if(((this.day+day) >00) && ((this.day+day)<32) && ((this.month+month) >00) && ((this.month+month) <13) && ((this.year+year) >2000) && ((this.year+year) <2022)) {
			this.day += day;
			this.month += month;
			this.year += year;
		}
		else {
			System.out.println("Invalid input..");
			System.out.println("Date cannot be updated.!\n");
		}
	}
	
	public void changeDate(int day, int month, int year) {
	
		if((day>00) && (day<32) && (month>00) && (month<13) && (year>=2000) && (year<2023)) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		else {
			System.out.println("Invalid input..");
			System.out.println("Date cannot be updated.!\n");
		}
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
	
		if((day>00) && (day<32)) {
			this.day = day;
		}
		else {
			System.out.println("Invalid Input for Date.!\n");
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if((month>00) && (month<13)){
			this.month = month;
		}
		else {
			System.out.println("Invalid Input for Date.!\n");
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if((year>=2000) && (year<2023)) {
			this.year = year;
		}
		else {
			System.out.println("Invalid Input for Date.!\n");
		}
	}
	
}
