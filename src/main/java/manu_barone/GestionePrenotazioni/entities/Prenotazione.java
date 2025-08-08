package manu_barone.GestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate data;

    @ManyToOne
    @JoinColumn(name="utente_id")
    private Utente utente;

    @ManyToMany
    @JoinTable(
            name="prenotazione_postazione",
            joinColumns = @JoinColumn(name="prenotazione_id"),
            inverseJoinColumns = @JoinColumn(name="postazione_id")
    )
    private List<Postazione> postazioni;


    public Prenotazione(LocalDate data, Utente utente, List<Postazione> postazioni) {
        this.data = data;
        this.utente = utente;
        this.postazioni = postazioni;
    }
}
