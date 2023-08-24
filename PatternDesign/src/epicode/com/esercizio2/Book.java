package epicode.com.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Book implements BookComponent{

	private List<Author> authors = new ArrayList<>();
    private double price;
    private BookComponent contents;

    public Book(BookComponent contents, double price) {
        this.contents = contents;
        this.price = price;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public int getNumberOfPages() {
        return contents.getNumberOfPages();
    }

    @Override
    public void print() {
        System.out.println("Stampo il libro...");
        contents.print();
    }
}


	

