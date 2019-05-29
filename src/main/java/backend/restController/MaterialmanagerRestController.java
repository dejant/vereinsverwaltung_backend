package backend.restController;

import backend.entities.Materialmanager;
import backend.repositories.MaterialmanagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaterialmanagerRestController {
    // Verdrahten der Repository-Klasse, um Personen in der Datenbank zu finden
    //
    @Autowired
    private final MaterialmanagerRepository repository;

    public MaterialmanagerRestController(MaterialmanagerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/materialmanager")
    List<Materialmanager> all() {
        return repository.findAll();
    }

    @PostMapping("/materialmanager")
    Materialmanager newMaterialmanager(@RequestBody Materialmanager newMaterialmanager) {
        return repository.save(newMaterialmanager);
    }
}
