package backend.restController;

import backend.entities.Schedule;
import backend.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScheduleRestController {
    // Verdrahten der Repository-Klasse, um Personen in der Datenbank zu finden
    //
    @Autowired
    private final ScheduleRepository repository;

    public ScheduleRestController(ScheduleRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/schedule")
    List<Schedule> all() {
        return repository.findAll();
    }

    @PostMapping("/schedule")
    Schedule newSchedule(@RequestBody Schedule newSchedule) {
        return repository.save(newSchedule);
    }
}
