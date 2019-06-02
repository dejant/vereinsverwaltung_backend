package backend.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import backend.entities.Team;
import backend.repositories.TeamRepository;

import java.util.List;

@RestController
public class TeamRestController {

    // Verdrahten der Repository-Klasse, um Personen in der Datenbank zu finden
    //
    @Autowired
    private final TeamRepository repository;

    public TeamRestController(TeamRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/team")
    public List<Team> all() {
        return repository.findAll();
    }

    @PostMapping("/team")
    public Team newTeam(@RequestBody Team newTeam) {
        return repository.save(newTeam);
    }
}
