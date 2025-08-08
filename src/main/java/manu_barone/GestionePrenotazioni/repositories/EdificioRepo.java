package manu_barone.GestionePrenotazioni.repositories;

import manu_barone.GestionePrenotazioni.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepo extends JpaRepository<Edificio, Long> {

}
