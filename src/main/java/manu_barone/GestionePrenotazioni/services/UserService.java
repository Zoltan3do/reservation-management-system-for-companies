package manu_barone.GestionePrenotazioni.services;


import lombok.extern.slf4j.Slf4j;
import manu_barone.GestionePrenotazioni.entities.Utente;
import manu_barone.GestionePrenotazioni.exceptions.NotFoundException;
import manu_barone.GestionePrenotazioni.exceptions.ValidationException;
import manu_barone.GestionePrenotazioni.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepo utenteRepository;

    public void saveUser(Utente utente) {
        if (utenteRepository.existsByEmail(utente.getEmail())) {
            throw new ValidationException("Email già usata da qualcun'altro");
        }

        if (utente.getNome().length() < 2) {
            throw new ValidationException("Nome non valido");
        }

        utenteRepository.save(utente);
        log.info("L'utente " + utente.getNome() + " è stato salvato correttamente!");

    }

    public List<Utente> findAll() {
        return utenteRepository.findAll();
    }

    public Utente findByid(long id) {
        return utenteRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

}
