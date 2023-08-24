package epicode.com.esercizio2;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

public class Chapter implements BookComponent{

	private List<BookComponent> components = new ArrayList<>();
	
	public void add(BookComponent component) {
		components.add(component);
	}
	
	@Override
	public int getNumberOfPages() {
		
		int pages = 0;
		
		for (BookComponent component : components) {
			pages += component.getNumberOfPages();
		}
		return pages;
	}

	@Override
	public void print() {
		
		  System.out.println("Stampo numero di pagine contentute della capitolo; " + getNumberOfPages());
		
	}

}
