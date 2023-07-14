package com.epicode.controller;

import java.time.LocalDate;

import com.epicode.enumerated.TipoEvento;
import com.epicode.model.Evento;
import com.epicode.model.EventoDAO;

public class Main_project {

	public static void main(String[] args) {
		
		Evento e1 = new Evento("Concerto Metallica", LocalDate.of(2023, 10 , 30 ), "gran concerto metalloso", TipoEvento.pubblico, 100000 );

		EventoDAO.save(e1);
		
	}

}
