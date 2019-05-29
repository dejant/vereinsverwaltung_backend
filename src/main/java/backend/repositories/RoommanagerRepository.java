package backend.repositories;

import backend.entities.Roommanager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoommanagerRepository extends JpaRepository<Roommanager, Long> {
    List<Roommanager> findAllByOrderByName();

    Optional<Roommanager> findByName(String name);
}
