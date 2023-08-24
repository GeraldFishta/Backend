package epicode.com.esercizio2;

public class Page implements BookComponent{

	private int pageIndex;

	public Page(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	
	@Override
	public int getNumberOfPages() {
		return 1;
	}

	@Override
	public void print() {
		System.out.println("Stampo pagina " + pageIndex);
		
	}
	
	
}
