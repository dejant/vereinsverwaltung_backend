package backend.repositories;

import backend.entities.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MaterialRepository extends JpaRepository<Material, Long> {
    List<Material> findAllByOrderByName();

    Optional<Material> findByName(String name);
}
