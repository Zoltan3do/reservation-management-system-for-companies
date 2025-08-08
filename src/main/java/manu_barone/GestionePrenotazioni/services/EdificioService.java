package manu_barone.GestionePrenotazioni.services;

import lombok.extern.slf4j.Slf4j;
import manu_barone.GestionePrenotazioni.entities.Edificio;
import manu_barone.GestionePrenotazioni.exceptions.ValidationException;
import manu_barone.GestionePrenotazioni.repositories.EdificioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EdificioService {

    @Autowired
    private EdificioRepo er;

    public void saveEdificio(Edificio edificio){
        if(edificio.getNome().isEmpty() || edificio.getCitta().isEmpty()){
            throw new ValidationException("Nome e città sono obbligatori");
        }
        er.save(edificio);
        log.info("L'edifici p stato salvato correttamente");
    }

    public Edificio findById(long id){
        return er.findById(id).orElseThrow();
    }

    public List<Edificio> findAll(){
        return er.findAll();
    }



}
