package backend.restController;

import backend.entities.Member;
import backend.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberRestController {
    // Verdrahten der Repository-Klasse, um Personen in der Datenbank zu finden
    //
    @Autowired
    private final MemberRepository repository;

    public MemberRestController(MemberRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/member")
    List<Member> all() {
        return repository.findAll();
    }

    @PostMapping("/member")
    Member newMember(@RequestBody Member newMember) {
        return repository.save(newMember);
    }
}
