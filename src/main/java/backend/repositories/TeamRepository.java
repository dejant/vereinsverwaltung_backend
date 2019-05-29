package backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}