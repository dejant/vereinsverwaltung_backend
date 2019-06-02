package backend.restController;

import backend.entities.Roommanager;
import backend.repositories.RoommanagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoommanagerRestController {
    // Verdrahten der Repository-Klasse, um Personen in der Datenbank zu finden
    //
    @Autowired
    private final RoommanagerRepository repository;

    public RoommanagerRestController(RoommanagerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/roommanager")
    public List<Roommanager> all() {
        return repository.findAll();
    }

    @PostMapping("/roommanager")
    public Roommanager newRoommanager (@RequestBody Roommanager newRoommanager) {
        return repository.save(newRoommanager);
    }
}
