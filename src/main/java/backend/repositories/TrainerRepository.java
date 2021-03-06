package backend.repositories;

import backend.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
    List<Trainer> findAllByOrderByLName();

}
