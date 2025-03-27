package it.epicode.gara_atletica;

import it.epicode.eventi.Evento;
import it.epicode.locations.Location;
import it.epicode.partecipazioni.Partecipazione;
import it.epicode.persone.Persona;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SecondaryTable;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class GaraDiAtletica extends Evento {
    @ManyToMany
    private Set<Persona> atleti;
    @ManyToOne
    private Persona vincitore;

    public GaraDiAtletica(long id, String titolo, LocalDate dataEvento, String descrizione, String tipoEvento, int numeroMassimoPartecipanti, List<Partecipazione> partecipazioni, Location location, Set<Persona> atleti, Persona vincitore) {
        super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, partecipazioni, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public GaraDiAtletica(Long id, String titolo, LocalDate dataEvento, String descrizione, String tipoEvento, int numeroMassimoPartecipanti, List<Partecipazione> partecipazioni, Location location, Set<Persona> atleti, Persona vincitore) {
        super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, partecipazioni, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }




}
