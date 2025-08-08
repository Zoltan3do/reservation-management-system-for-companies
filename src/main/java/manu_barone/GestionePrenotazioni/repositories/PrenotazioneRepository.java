package manu_barone.GestionePrenotazioni.repositories;

import manu_barone.GestionePrenotazioni.entities.Prenotazione;
import manu_barone.GestionePrenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione,Long> {
    Optional<Prenotazione> findByUtenteAndData(Utente utente, LocalDate data);
    List<Prenotazione> findBydata(LocalDate data);
}
