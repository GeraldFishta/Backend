package epicode.com.esercizio2;

public class MainProject {

	public static void main(String[] args) {
		    Page page1 = new Page(1);
	        Page page2 = new Page(2);
	        Chapter section = new Chapter();
	        section.add(page1);
	        section.add(page2);
	        Book book = new Book(section, 29.99);
	        book.addAuthor(new Author("John Doe"));
	}

}
