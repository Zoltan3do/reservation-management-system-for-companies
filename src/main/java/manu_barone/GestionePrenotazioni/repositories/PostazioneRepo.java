package manu_barone.GestionePrenotazioni.repositories;

import manu_barone.GestionePrenotazioni.entities.Postazione;
import manu_barone.GestionePrenotazioni.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PostazioneRepo extends JpaRepository<Postazione,Long> {
    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);// a quanto pare il _ entra all'interno di un'attributo di un'altra tabella
    List<Postazione> findByPrenotazioni_DataNot(LocalDate data);
}
