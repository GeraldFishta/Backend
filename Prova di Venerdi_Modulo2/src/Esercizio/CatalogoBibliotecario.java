package Esercizio;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CatalogoBibliotecario {
	private static final Logger logger = LoggerFactory.getLogger(CatalogoBibliotecario.class);


	private static final String FILE_PATH = "File_salvati/catalogo.txt";


	private Map<String, Elemento> archivio;

	public CatalogoBibliotecario() {
		this.archivio = new HashMap<String, Elemento>();	
	}

	public void aggiungi(Elemento nuovoElemento) {
		archivio.put(nuovoElemento.getIsbn(), nuovoElemento);
		logger.info("Elemento aggiunto: {}",nuovoElemento.getIsbn());
	}
	
	public void rimuovi(String isbn) {
		Elemento elementoRimosso = archivio.remove(isbn);
		if ( elementoRimosso != null)
		logger.info("Elemento rimosso: {}",elementoRimosso.getIsbn());

	}
	
	public Elemento ricercaPerIsbn(String isbn){
		
		return archivio.get(isbn);
		
	}
	
	public List<Elemento> ricercaPerAnnoPubblicazione(Integer annoPubblicazione){
		
		return archivio.values().stream().filter(elem -> annoPubblicazione.equals(elem.getAnnoPubblicazione())) 
								  .collect(Collectors.toList()); 
	}
	
	
	public List<Libro> ricercaPerAutore(String autore){
		
		return archivio.values().stream().filter(elem -> elem instanceof Libro) 
								  .map(elem -> (Libro) elem) 
								  .filter(elem -> autore.equals(elem.getAutore())) 
								  .collect(Collectors.toList());
	}
	
	
	public void salvaCatalogo() throws IOException {

		String fileString = "";

		for (Elemento elemento : archivio.values()) {
			if (fileString.length() != 0) {
				fileString += "#";
			}
			if (elemento instanceof Libro) {
				fileString += Libro.toStringFile((Libro) elemento);
			} else if (elemento instanceof Rivista) {
				fileString += Rivista.toStringFile((Rivista) elemento);
			} 
		}

		File file = new File(FILE_PATH);
		FileUtils.writeStringToFile(file, fileString, "UTF-8");
		logger.info("Dati salvati correttamente sul file " + FILE_PATH);

	}

	public void caricaCatalogo() throws IOException {
		this.archivio.clear();

		File file = new File(FILE_PATH);

		String fileString = FileUtils.readFileToString(file, "UTF-8");

		List<String> splitElementiString = Arrays.asList(fileString.split("#"));

		for (String curString : splitElementiString) {
			Elemento elemento = null;
			if ( curString.startsWith(Libro.class.getSimpleName()) ) {
				elemento = Libro.fromStringFile(curString);
			} else if ( curString.startsWith(Rivista.class.getSimpleName()) ) {
				elemento= Rivista.fromStringFile(curString);
			}
			this.archivio.put(elemento.getIsbn(), elemento);
			
		}
		logger.info("Dati caricati correttamente dal file " + FILE_PATH);

	}
	
	public static void main(String[] args) {
		CatalogoBibliotecario catalogo = new CatalogoBibliotecario();
		
		Libro l1 = new Libro("102534","L'idiota", 1891, 1278, "Doestojevski", "Romanzo");
		Rivista r1 = new Rivista("145234","Playboy", 2021, 178, Periodicita.MENSILE);
		
		catalogo.aggiungi(r1);
		catalogo.aggiungi(l1);
		
		try {
			catalogo.salvaCatalogo();
			
			catalogo.caricaCatalogo();
			
			List<Libro> ricercaPerAutore = catalogo.ricercaPerAutore("Doestojevski");
			
			ricercaPerAutore.forEach(elem -> System.out.println("Titolo: " + elem.getTitolo()));
			
		} catch (IOException e) {
			logger.error("Errore durante la lettura/scrittura",e);
		}


	}
	

}
