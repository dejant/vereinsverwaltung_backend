package backend.restController;

import backend.entities.Location;
import backend.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationRestController {
    // Verdrahten der Repository-Klasse, um Personen in der Datenbank zu finden
    //
    @Autowired
    private final LocationRepository repository;

    public LocationRestController(LocationRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/location")
    public List<Location> all() {
        return repository.findAll();
    }

    @PostMapping("/location")
    public Location newLocation(@RequestBody Location newLocation) {
        return repository.save(newLocation);
    }
}
