package manu_barone.GestionePrenotazioni.repositories;

import manu_barone.GestionePrenotazioni.entities.Utente;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Utente,Long> {
    boolean existsByEmail(String email);

}
