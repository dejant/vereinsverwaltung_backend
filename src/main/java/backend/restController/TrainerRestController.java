package backend.restController;

import backend.entities.Trainer;
import backend.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainerRestController {

    // Verdrahten der Repository-Klasse, um Personen in der Datenbank zu finden
    //
    @Autowired
    private final TrainerRepository repository;

    public TrainerRestController(TrainerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/trainer")
    List<Trainer> all() {
        return repository.findAll();
    }

    @PostMapping("/trainer")
    Trainer newTrainer(@RequestBody Trainer newTrainer) {
        return repository.save(newTrainer);
    }
}
