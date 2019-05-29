package backend.restController;

import backend.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import backend.repositories.PersonRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonRestController {

    // Verdrahten der Repository-Klasse, um Karten in der Datenbank zu finden
    @Autowired
    private PersonRepository personRepository;

    /**
     * REST-Ressource für URL /infmapi/v1/worlds (GET)
     *
     * @return                  HTTP-Response mit einem Status 200 oder 404, sowie im ersten Fall einer Liste aller Welten-Entitäten im JSON-Format
     */
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> getPerson(){
        // Alle Karten aus dem Repository laden und der cards-Variable zuweisen
        List<Person> person = personRepository.findAllByOrderByLName();

        // Wenn die Liste Einträge enthält...
        if(person != null && !person.isEmpty()){
            // ... dann diese als Body zurückgeben
            return new ResponseEntity(person, HttpStatus.OK);
        } else {
            // ... ansonsten ResourceNotFoundException (404)
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
