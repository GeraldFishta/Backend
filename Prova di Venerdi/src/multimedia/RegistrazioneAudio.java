package multimedia;

public class RegistrazioneAudio extends ElementoMultimediale {

	private int volume; 
	
	public RegistrazioneAudio(String titolo, int durata, int volume){
		
		super(titolo, durata);
		this.volume = volume; 
		
	}
	
	
	public int getVolume() {
		return volume;
	}
	
	public void abbassaVolume() {
		if (volume > 0) {
			volume--;
		}
	}
	
	public void alzaVolume() {
		volume++;
	}
	
	public void play() {
		for (int i = 0; i < getDurata(); i++) {
			System.out.println(getTitolo() + ": " + "!".repeat(volume));
		}
	}
	
}
