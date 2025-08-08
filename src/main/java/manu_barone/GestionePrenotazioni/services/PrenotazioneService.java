package manu_barone.GestionePrenotazioni.services;

import lombok.extern.slf4j.Slf4j;
import manu_barone.GestionePrenotazioni.entities.Postazione;
import manu_barone.GestionePrenotazioni.entities.Prenotazione;
import manu_barone.GestionePrenotazioni.entities.Utente;
import manu_barone.GestionePrenotazioni.exceptions.ValidationException;
import manu_barone.GestionePrenotazioni.repositories.PostazioneRepo;
import manu_barone.GestionePrenotazioni.repositories.PrenotazioneRepository;
import manu_barone.GestionePrenotazioni.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepo;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private UserService userService;


    public void savePrenotazione(long idUser, long postazioneId, LocalDate data) {
        Utente utente = userService.findByid(idUser);
        if (prenotazioneRepo.findByUtenteAndData(utente, data).isPresent()) {
            throw new ValidationException("L'utente ha già una prenotazione per questa data");
        }

        Postazione postazione = postazioneService.findById(postazioneId);

        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUtente(utente);
        prenotazione.setData(data);
        prenotazione.setPostazioni(List.of(postazione));

        prenotazioneRepo.save(prenotazione);
        log.info("Prenotazione andata a buon fine");

    }

    public List<Prenotazione> findByData(LocalDate data) {
        return prenotazioneRepo.findBydata(data);
    }

}
