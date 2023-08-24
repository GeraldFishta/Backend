package epicode.com;

import java.time.LocalDate;

public class Adapter implements DataSource{
	
	 private Info info;

	    public Adapter(Info info) {
	        this.info = info;
	    }

	    @Override
	    public String getNomeCompleto() {
	        return info.getNome() + " " + info.getCognome();
	    }
	    
	    @Override
	    public int getEta() {
	    	
	    	LocalDate dataDiNascita = info.getDataDiNascita();
	    	LocalDate dataCorrente = LocalDate.now();
	    	int anniUser = dataCorrente.getYear() - dataDiNascita.getYear();
	    	return anniUser;
	    	
	    }


}
