package backend.restController;

import backend.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import backend.repositories.PersonRepository;

import java.util.List;

@RestController
public class PersonRestController {

    // Verdrahten der Repository-Klasse, um Karten in der Datenbank zu finden
    @Autowired
    private final PersonRepository repository;

    public PersonRestController(PersonRepository personRepository) {
        this.repository = personRepository;
    }

    @GetMapping("/person")
    public List<Person> all() {
        return repository.findAll();
    }

    @PostMapping("/person")
    public Person newPerson(@RequestBody Person newPerson) {
        return repository.save(newPerson);
    }

    /*
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

     */
}
