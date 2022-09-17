import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HotelChallenge {

	public static void main(String[] args) {

		List<HotelData> lst = new LinkedList<HotelData>();
		lst.add(new HotelData("Hotel Hogsmeade Inn", 2, 20, 2000));
		lst.add(new HotelData("Hotel Hogsmeade Inn", 3, 20, 3000));
		lst.add(new HotelData("Hotel Joy N Jenny", 1, 20, 1500));
		lst.add(new HotelData("Hotel Hardhome", 3, 20, 4500));
		lst.add(new HotelData("Hotel Kanto", 2, 20, 1800));
		lst.add(new HotelData("Hotel Kanto", 3, 20, 3500));
		lst.add(new HotelData("Hotel Imperial", 1, 20, 1500));
		lst.add(new HotelData("Hotel Mandarin", 3, 20, 3800));

		Scanner sc = new Scanner(System.in);
		System.out.println("Tell the total combination of rooms you are looking for - ");
		int ch1 = sc.nextInt();
		int ch3 = 0;

		int ch2=0;
		System.out.println("Tell the rooms you are looking for - Enter Bed and Room");
		for(int i=0;i<ch1;i++) {
			ch2 = sc.nextInt();
			ch3 = sc.nextInt();
		}

		int n = 1;
		if(ch2 < 4) {
			for(HotelData h:lst) {
				if(ch2 == 1 && h.getRoomType() == 1) {
					System.out.println(n++ + ".\t" + h.getHotelName());
				}
				else if(ch2 == 2 && h.getRoomType() == 2) {
					System.out.println(n++ + ".\t" + h.getHotelName());
				}
				else if(ch2 == 3 && h.getRoomType() == 3) {
					System.out.println(n++ + ".\t" + h.getHotelName());
				}
			}
		}
		else {
			System.out.println("No rooms Found.");
		}

	}

}
