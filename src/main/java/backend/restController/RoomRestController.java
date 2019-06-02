package backend.restController;

import backend.entities.Room;
import backend.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomRestController {

    // Verdrahten der Repository-Klasse, um Personen in der Datenbank zu finden
    //
    @Autowired
    private final RoomRepository repository;

    public RoomRestController(RoomRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/room")
    public List<Room> all() {
        return repository.findAll();
    }

    @PostMapping("/room")
    public Room newRoom(@RequestBody Room newRoom) {
        return repository.save(newRoom);
    }
}
