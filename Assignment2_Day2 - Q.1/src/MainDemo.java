
public class MainDemo {

	public static void main(String[] args) {
	
		Instrument[] instruments = new Instrument[10];
		
		instruments[0] = new Piano();
		instruments[1] = new Piano();
		instruments[2] = new Piano();
		
		instruments[3] = new Flute();
		instruments[4] = new Flute();
		instruments[5] = new Flute();
		
		instruments[6] = new Guitar();
		instruments[7] = new Guitar();
		instruments[8] = new Guitar();
		
		instruments[9] = new Guitar();
		
		for(int i=0; i<instruments.length; i++) {
			instruments[i].play();
			if(instruments[i] instanceof Piano) {
				System.out.println("This is Piano\n");
			}
			else if(instruments[i] instanceof Flute) {
				System.out.println("This is Flute\n");
			}
			else {
				System.out.println("This is Gauitar\n");
			}
		}
	
		
	}

}
