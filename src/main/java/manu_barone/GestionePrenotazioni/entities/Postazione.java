package manu_barone.GestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;

    private int numeroMassimoOccupanti;

    @ManyToOne
    @JoinColumn(name="edificio_id")
    private Edificio edificio;

    @ManyToMany(mappedBy = "postazioni")
    private List<Prenotazione> prenotazioni;

    public Postazione(String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
        this.edificio = edificio;
    }
}
