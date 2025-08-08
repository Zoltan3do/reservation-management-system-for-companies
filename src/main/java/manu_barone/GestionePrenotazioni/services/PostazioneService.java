package manu_barone.GestionePrenotazioni.services;

import lombok.extern.slf4j.Slf4j;
import manu_barone.GestionePrenotazioni.entities.Postazione;
import manu_barone.GestionePrenotazioni.entities.TipoPostazione;
import manu_barone.GestionePrenotazioni.exceptions.NotFoundException;
import manu_barone.GestionePrenotazioni.exceptions.ValidationException;
import manu_barone.GestionePrenotazioni.repositories.PostazioneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    private PostazioneRepo postazioneRepo;

    public void savePostazione(Postazione postazione) {
        if (postazione.getNumeroMassimoOccupanti() < 2) {
            throw new ValidationException("Numero massimo occupanti troppo piccolo ");
        }

        postazioneRepo.save(postazione);
        log.info("La postazione " + postazione.getId() + " è stata salvata correttamente");
    }

    public List<Postazione> findAll() {
        return postazioneRepo.findAll();
    }

    public Postazione findById(long postazioneId) {
        return postazioneRepo.findById(postazioneId).orElseThrow(() -> new NotFoundException(postazioneId));
    }

    public List<Postazione> findByTipoeCitta(TipoPostazione tipo, String citta) {
        return postazioneRepo.findByTipoAndEdificio_Citta(tipo, citta);
    }

    public List<Postazione> findPostazioniDisponibiliPerData(LocalDate data) {
        return postazioneRepo.findByPrenotazioni_DataNot(data);
    }



}

