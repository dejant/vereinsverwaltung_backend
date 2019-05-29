package backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.entities.Team;

import java.util.List;
import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findAllByOrderByName();

    Optional<Team> findByName(String name);
}