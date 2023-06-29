package com.epicode.be;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		Dipendente dipendente1 = new Dipendente("AN100", Dipartimento.PRODUZIONE);
		Dipendente dipendente2 = new Dipendente("AN200", Dipartimento.PRODUZIONE);
		Dipendente dipendente3 = new Dipendente("AN300", 1200, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dipendente4 = new Dipendente("AN400", 2000, 40, Livello.DIRIGENTE, Dipartimento.VENDITE);

		dipendente1.promuovi();
		dipendente3.promuovi();
		
		dipendente1.stampaDatiDipendenti();
		dipendente2.stampaDatiDipendenti();
		dipendente3.stampaDatiDipendenti();
		dipendente4.stampaDatiDipendenti();
		
		
		System.out.println(
		(Dipendente.calcolaPaga(dipendente1, 5)) + 
		(Dipendente.calcolaPaga(dipendente2, 5)) +
		(Dipendente.calcolaPaga(dipendente3, 5)) +
		(Dipendente.calcolaPaga(dipendente4, 5))
		);
	}

}
