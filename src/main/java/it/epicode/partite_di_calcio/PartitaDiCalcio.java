package it.epicode.partite_di_calcio;

import it.epicode.eventi.Evento;
import it.epicode.locations.Location;
import it.epicode.partecipazioni.Partecipazione;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "PartiteDiCalcio")
public class PartitaDiCalcio extends Evento {
    @Column(length = 100, nullable = false)
    private String squadraDiCasa;

    @Column(length = 100, nullable = false)
    private String squadraOspite;

    @Column(length = 100, nullable = false)
    private String squadraVincente;

    @Column(length = 100, nullable = false)
    private int goalSquadraDiCasa;

    @Column(length = 100, nullable = false)
    private int goalSquadraOspite;

    public PartitaDiCalcio(String squadraDiCasa, String squadraOspite, String squadraVincente, int goalSquadraDiCasa, int goalSquadraOspite, Long id, String titolo, LocalDate dataEvento, String descrizione, String tipoEvento, int numeroMassimoPartecipanti, List<Partecipazione> partecipazioni, Location location) {
        super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, partecipazioni, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = risultatoVincente();
        this.goalSquadraDiCasa = goalSquadraDiCasa;
        this.goalSquadraOspite = goalSquadraOspite;

    }

    private String risultatoVincente() {
        if (goalSquadraDiCasa > goalSquadraOspite) {
            return squadraDiCasa;
        } else if (goalSquadraDiCasa < goalSquadraOspite) {
            return squadraOspite;
        } else {
            return null; //"Pareggio";
        }
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGoalSquadraDiCasa() {
        return goalSquadraDiCasa;
    }

    public void setGoalSquadraDiCasa(int goalSquadraDiCasa) {
        this.goalSquadraDiCasa = goalSquadraDiCasa;
    }

    public int getGoalSquadraOspite() {
        return goalSquadraOspite;
    }

    public void setGoalSquadraOspite(int goalSquadraOspite) {
        this.goalSquadraOspite = goalSquadraOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", goalSquadraDiCasa=" + goalSquadraDiCasa +
                ", goalSquadraOspite=" + goalSquadraOspite +
                '}';
    }
}
