
import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		
		Hotel hotels[] = createHotels();
		Hotel affordabele3[] = new Hotel[8];
		int cnt = 0;
		String str;
		do {
			System.out.println("Tell Total Combination of rooms(s) you are looking for- ");
			int totalRooms = sc.nextInt();
			System.out.println("Tell the rooms(s) you are looking for(bed, room)- ");
			int bed = sc.nextInt();
			int room = sc.nextInt();
			
			for(int i=0; i<hotels.length; i++) {
				
				if(totalRooms <= hotels[i].getAvailableRooms()) {
					
					if(bed == hotels[i].getBed()) {
						
						if(room <= hotels[i].getAvailableRooms()) {
							
							if(cnt < 3) {
								affordabele3[cnt++] = hotels[i];
							}
							else {
								double max = affordabele3[0].getPrice();
								int index = 0;
								for(int j=1; j<cnt; j++) {
									if(affordabele3[j].getPrice() > max) {
										max = affordabele3[j].getPrice();
										index = j;
									}
								}
								if(max > hotels[i].getPrice()) {
									affordabele3[index] = hotels[i];
								}
							}
						}
					}
					
				}
				
			}
			System.out.println("top matches are : ");
			
			for(int i=0; i<cnt; i++) {
				System.out.println((i+1)+". "+affordabele3[i].getHotelName());
			}
			System.out.println("Wnat to search again : ");
			str = sc.next();
			}while(str.equalsIgnoreCase("y") );
		
	}
	
	public static Hotel[] createHotels() {
		
		Hotel hotels[] = new Hotel[8];
		
		hotels[0] = new Hotel("nocancellationhotels", "Hotel Hogsmeade Inn", 2, 20, 2000);
		hotels[1] = new Hotel("nocancellationhotels", "Hotel Hogsmeade Inn", 3, 20, 3000);
		hotels[2] = new Hotel("nocancellationhotels", "Hotel Joy N Jenny", 1, 20, 1500);
		hotels[3] = new Hotel("nocancellationhotels", "Hotel Hardhome", 3, 20, 4500);
		
		hotels[4] = new Hotel("noservicechargehotels", "Hotel Kanto", 2, 20, 1800);
		hotels[5] = new Hotel("noservicechargehotels", "Hotel Kanto", 3, 20, 3500);
		hotels[6] = new Hotel("noservicechargehotels", "Hotel Imperial", 1, 20, 1500);
		
		hotels[7] = new Hotel("noworryonlyhurryhotels", "Hotel Mandarin", 3, 20, 3800);
		return hotels;
	}

}

/*
 * 					*/
 