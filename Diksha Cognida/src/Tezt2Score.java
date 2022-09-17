
public class Tezt2Score {

	public static void main(String[] args) {
	
		/*String  str = "450";//"01:30";
		int istr = Integer.parseInt(str);
		istr = istr+istr;
		
		String result = Integer.toString(istr);
		System.out.println(result);
		*/
		
		
		String date = "2019:02:10";
		
		int md1 = 31, md2 = 28, md3 = 31, md4 = 30, md5 = 31;
		int md6 = 30, md7 = 31, md8 = 31, md9 = 30, md10 = 31;
		int md11 = 30, md12 = 31;
		
		
		char day1 = date.charAt(8); 
		char day2 = date.charAt(9);
		
		int day = Integer.parseInt(""+day1+day2);
		
		char m1 = date.charAt(5);
		char m2 = date.charAt(6);
		
		int m = Integer.parseInt(""+m1+m2);
		
		if(m==2) {
			day = day+md1;
		}
		else if(m==3) {
			day = day+md1+md2;
		}
		else if(m==4) {
			day = day+md1+md2+md3;
		}
		else if(m==5) {
			day = day+md1+md2+md3+md4;
		}
		else if(m==6) {
			day = day+md1+md2+md3+md4+md5;
		}
		else if(m==7) {
			day = day+md1+md2+md3+md4+md5+md6;
		}
		else if(m==8) {
			day = day+md1+md2+md3+md4+md5+md6+md7;
		}
		else if(m==9) {
			day = day+md1+md2+md3+md4+md5+md6+md7+md8;
		}
		else if(m==10) {
			day = day+md1+md2+md3+md4+md5+md6+md7+md8+md9;
		}
		else if(m==11) {
			day = day+md1+md2+md3+md4+md5+md6+md7+md8+md9+md10;
		}
		else if(m==12) {
			day = day+md1+md2+md3+md4+md5+md6+md7+md8+md9+md10+md11+md12;
		}
		
		System.out.println(day*10);
		
		/*
		if(m==1 ){//|| m==3 || m==7 || m==8 || m==10 || m==12 ) {
			day += 31;
		}
		else if(m == 2) {
			day += 59;
		}
		else if(m == 3) {
			day += 90;
		}
		else if(m == 4) {
			day += 120;
		}
		else if(m == 5) {
			day += 151;
		}
		else if(m == 6) {
			day += 181;
		}
		else if(m == 7) {
			day += 212;
		}
		else if(m == 8) {
			day += 243;
		}
		else if(m == 9) {
			day += 273;
		}
		else if(m == 10) {
			day += 304;
		}
		else if(m == 11) {
			day += 334;
		}
		else if(m == 12) {
			day += 365;
		}*/
		System.out.println(day);
		System.out.println(day*10);
		
	}

}
