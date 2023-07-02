package multimedia;

public class Video extends ElementoMultimediale {
	
	private int volume; 
	private int luminosita; 
	
	public Video(String titolo, int durata, int volume, int luminosita) {
		
		super(titolo, durata);
		this.volume = volume; 
		this.luminosita= luminosita; 
		
	}

	public int getVolume() {
		return volume;
	}
	
	public int getLuminosita() {
		return luminosita;
	}
	
	public void abbassaVolume() {
		if (volume < 0) {
			volume--;
		}
	}
	
	public void alzaVoilum() {
		volume++;
	}
	
	public void aumentaLuminosita() {
		luminosita++;
	}
	
	public void diminuisciLuminosita() {
		if(luminosita >0) {
			luminosita--;
		}
	}
	
	public void play() {
	    String volumeString = "";
	    for (int i = 0; i < getVolume(); i++) {
	        volumeString += "!";
	    }
	    String luminositaString = "";
	    for (int i = 0; i < getLuminosita(); i++) {
	        luminositaString += "*";
	    }
	    System.out.println(getTitolo() + ": " + volumeString + luminositaString);
	}
	
}
