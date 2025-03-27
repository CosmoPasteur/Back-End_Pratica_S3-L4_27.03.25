package it.epicode.Main;

import it.epicode.eventi.Evento;
import it.epicode.eventi.EventoDAO;
import it.epicode.locations.Location;
import it.epicode.locations.LocationDAO;
import it.epicode.partecipazioni.Partecipazione;
import it.epicode.partecipazioni.PartecipazioneDAO;
import it.epicode.persone.Persona;
import it.epicode.persone.PersonaDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("epicode");
        EntityManager em = emf.createEntityManager();

        em.find(Evento.class, 1L);

        em.getTransaction().begin();

        //em.persist(new Evento(1, "evento 1", null, "descrizione 1", "tipo 1", 10, null, null));

        em.getTransaction().commit();

        em.close();
        emf.close();
    }








/*

        EventoDAO eventoDAO = new EventoDAO(em);
        LocationDAO locationDAO = new LocationDAO(em);
        PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO(em);
        PersonaDAO personaDAO = new PersonaDAO(em);

        //creazione evento
        Evento e = new Evento(1, "evento 1", null, "descrizione 1", "tipo 1", 10, null, null);
        eventoDAO.insert(e);

        //creazione location per l'evento
        Location l = new Location();
        locationDAO.insert(l);

        //creazione partecipazione
        Partecipazione p = new Partecipazione();
        partecipazioneDAO.insert(p);

        //creazione persona
        Persona persona = new Persona();
        personaDAO.insert(persona);

        //partita
        //partita.setStato(Stato.IN_CORSO);
        //partita.setGiornata(1);
        //partita.setGiornata(2);
        //partita.setGiornata(3);


        em.getTransaction().commit();

        em.close();
        emf.close();*/


    }

