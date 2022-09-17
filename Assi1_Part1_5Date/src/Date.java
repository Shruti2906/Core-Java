
import java.util.Scanner;
public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date() {
		day = 1;
		month = 1;
		year = 1999;
	}

	public Date(int day, int month, int year) {
		if(day<31 && day>0 && month>0 && month<12 && year>=1999 && year<=2021) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		else
		{
			day = 1;
			month = 1;
			year = 1999;
			
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day, int mon) {
		if(day<31 && day>0)
			this.day = day;
	}
	public void setDay(int month) {
		if(month==1 && day>=30)
			day = 1;
		else if(month==2 && day>=28)
			day = 1;
		else if((month==3 || month==4) && day>=28)
			day = 1;


	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month>0 && month<12)
			this.month = month;
		if(month == 2)
				setDay(day, month);
				
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>=1999 && year<=2021)
			this.year = year;
	}
	
	public String toString() {
		
		return ""+day+"/"+month+"/"+year+"";
	}
	
	public void updateDate()	{
		Scanner sc = new Scanner(System.in);
		String ch;
		int value; 
		int newd;
		System.out.println("Which value you want to update (d/m/y) : ");
		ch = sc.next();
		if(ch.equals("d")){
			System.out.println("Enter value to add to exiting day : ");
			value = sc.nextInt();
			if(value>0 && value<30) {	//value < month
				newd = day+value;
				if(newd<30) {				//again check for valid month
					day = newd;
				}
				else
					System.out.println("Invalid input! cannot update the value!!");
			}
			else
					System.out.println("Invalis input! cannot update the value!!");
		}
		
		if(ch.equals("m")){
			System.out.println("Enter value to add to exiting month : ");
			value = sc.nextInt();
			if(value>0 && value<12) {
				newd = month+value;
				if(newd<=12) {
					month = newd;
				}
				else
					System.out.println("Invalid input! cannot update the value!!");
			}
			else
				System.out.println("Invalid input! cannot update the value!!");		

		}

		if(ch.equals("y")){
			System.out.println("Enter value to add to exiting year : ");
			value = sc.nextInt();
			
			if(value>0 && value<1999) {
				newd = year+value;
				if(newd < 1999) {
					year = newd;
				}
				else
					System.out.println("Invalid input! cannot update the value!!");
			}
			else
				System.out.println("Invalid input! cannot update the value!!");
			
		}

	}

}
