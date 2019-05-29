package backend.repositories;

import backend.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findAllByOrderByName();

    Optional<Member> findByName(String name);
}
