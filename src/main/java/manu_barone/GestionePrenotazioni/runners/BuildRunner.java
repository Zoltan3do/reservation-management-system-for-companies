package manu_barone.GestionePrenotazioni.runners;

import manu_barone.GestionePrenotazioni.entities.*;
import manu_barone.GestionePrenotazioni.services.EdificioService;
import manu_barone.GestionePrenotazioni.services.PostazioneService;
import manu_barone.GestionePrenotazioni.services.PrenotazioneService;
import manu_barone.GestionePrenotazioni.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BuildRunner implements CommandLineRunner {
    @Autowired
    UserService us;

    @Autowired
    PostazioneService ps;

    @Autowired
    EdificioService es;

    @Override
    public void run(String... args) throws Exception {
//        Utente utente1 = new Utente("john_doe", "John Doe", "john.doe@example.com");
//        Utente utente2 = new Utente("jane_smith", "Jane Smith", "jane.smith@example.com");
//        Utente utente3 = new Utente("mark_twain", "Mark Twain", "mark.twain@example.com");
//        Utente utente4 = new Utente("lucy_hale", "Lucy Hale", "lucy.hale@example.com");
//        Utente utente5 = new Utente("bruce_wayne", "Bruce Wayne", "bruce.wayne@example.com");
//
//
//        Edificio edificio1 = new Edificio("Edificio A", "Via Roma 10", "Milano", new ArrayList<>());
//        Edificio edificio2 = new Edificio("Edificio B", "Corso Italia 5", "Roma", new ArrayList<>());
//        Edificio edificio3 = new Edificio("Edificio C", "Piazza Duomo 1", "Napoli", new ArrayList<>());
//        Edificio edificio4 = new Edificio("Edificio D", "Viale Europa 20", "Torino", new ArrayList<>());
//        Edificio edificio5 = new Edificio("Edificio E", "Via Libertà 15", "Firenze", new ArrayList<>());
//
//
////        Postazione postazione1 = new Postazione("Postazione Privata 1", TipoPostazione.PRIVATO, 3, es.findById(1));
//        Postazione postazione2 = new Postazione("Postazione Open Space 1", TipoPostazione.OPENSPACE, 5, es.findById(2));
//        Postazione postazione3 = new Postazione("Sala Riunioni 1", TipoPostazione.SALA_RIUNIONI, 10, es.findById(3));
////        Postazione postazione4 = new Postazione("Postazione Privata 2", TipoPostazione.PRIVATO, 9, es.findById(4));
//        Postazione postazione5 = new Postazione("Postazione Open Space 2", TipoPostazione.OPENSPACE, 6, es.findById(5));
//
//
////        us.saveUser(utente1);
////        us.saveUser(utente2);
////        us.saveUser(utente3);
////        us.saveUser(utente4);
////        us.saveUser(utente5);
//
////
////        es.saveEdificio(edificio1);
////        es.saveEdificio(edificio2);
////        es.saveEdificio(edificio3);
////        es.saveEdificio(edificio4);
////        es.saveEdificio(edificio5);
//
//
////        ps.savePostazione(postazione1);
//        ps.savePostazione(postazione2);
//        ps.savePostazione(postazione3);
////        ps.savePostazione(postazione4);
//        ps.savePostazione(postazione5);
//

    }
}
