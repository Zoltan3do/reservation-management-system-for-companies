package manu_barone.GestionePrenotazioni.runners;

import lombok.extern.slf4j.Slf4j;
import manu_barone.GestionePrenotazioni.exceptions.ValidationException;
import manu_barone.GestionePrenotazioni.services.PrenotazioneService;
import manu_barone.GestionePrenotazioni.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Slf4j
public class PrenotazioniRunner implements CommandLineRunner {
    @Autowired
    PrenotazioneService ps;

    @Autowired
    UserService us;


    @Override
    public void run(String... args) throws Exception {

        try{
            ps.savePrenotazione(1,2, LocalDate.now());
        }catch(ValidationException e){
            log.error(e.getMessage());
        }catch(Exception e){
            log.error("Errore generico: " + e.getMessage());
        }

    }
}
