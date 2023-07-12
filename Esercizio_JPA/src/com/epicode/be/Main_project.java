package com.epicode.be;

import java.util.Date;

import utils.JpaUtil;

public class Main_project {

    public static void main(String[] args) {
        Evento evento = new Evento();
        evento.setTitolo("Evento di prova");
        evento.setDataEvento(new Date());
        evento.setDescrizione("Descrizione dell'evento");
        evento.setTipoEvento(TipoEvento.PUBBLICO);
        evento.setNumeroMassimoPartecipanti(100);

        EventoDAO eventoDAO = new EventoDAO();

        eventoDAO.save(evento);
        System.out.println("Evento salvato con successo. ID: " + evento.getId());

        Long eventoId = evento.getId();
        Evento eventoRecuperato = eventoDAO.getById(eventoId);
        System.out.println("Evento recuperato: " + eventoRecuperato.getTitolo());

        eventoRecuperato.setDescrizione("Nuova descrizione dell'evento");
        eventoDAO.refresh(eventoRecuperato);
        System.out.println("Evento aggiornato con successo.");


        eventoDAO.delete(eventoRecuperato);
        System.out.println("Evento eliminato.");

      
        JpaUtil.getEntityManagerFactory().close();
    }
}