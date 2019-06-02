package backend.restController;

import backend.entities.Material;
import backend.repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaterialRestController {
    // Verdrahten der Repository-Klasse, um Personen in der Datenbank zu finden
    //
    @Autowired
    private final MaterialRepository repository;

    public MaterialRestController(MaterialRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/material")
    public List<Material> all() {
        return repository.findAll();
    }

    @PostMapping("/material")
    public Material newMaterial(@RequestBody Material newMaterial) {
        return repository.save(newMaterial);
    }
}
