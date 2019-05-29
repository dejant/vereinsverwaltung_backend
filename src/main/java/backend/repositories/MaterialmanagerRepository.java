package backend.repositories;

import backend.entities.Materialmanager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MaterialmanagerRepository extends JpaRepository<Materialmanager, Long> {
    List<Materialmanager> findAllByOrderByName();

    Optional<Materialmanager> findByName(String name);
}
