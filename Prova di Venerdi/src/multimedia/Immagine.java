package multimedia;


public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo, 0);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void play() {
        show();
    }

    public void show() {
    	String luminositaString = "";
	    for (int i = 0; i < getLuminosita(); i++) {
	        luminositaString += "*";
	    }
	    System.out.println(getTitolo() + ": " + luminositaString);
    }
}



